package sk.tsystems.akademia.MovieDatabase.dao;

import java.util.Date;
import java.util.List;

import sk.tsystems.akademia.MovieDatabase.MovDatHelper;
import sk.tsystems.akademia.MovieDatabase.model.Celebrity;
import sk.tsystems.akademia.MovieDatabase.model.Genre;
import sk.tsystems.akademia.MovieDatabase.model.Movie;
import sk.tsystems.akademia.MovieDatabase.model.Review;
import sk.tsystems.akademia.MovieDatabase.model.TvSeries;
import sk.tsystems.akademia.MovieDatabase.model.VideoArt;

public class VideoArtDao {

	public void saveVideoArt(VideoArt videoArt) {
		MovDatHelper.beginTransaction();
		MovDatHelper.getEntityManager().persist(videoArt);
		MovDatHelper.commitTransaction();
	}

	// vytvorenie noveho filmu (movie) alebo serialu (tv series)

	public void newMovie(String name, int yearOfPublication, Date publicationDate, int length) {
		saveVideoArt(new Movie(name, yearOfPublication, publicationDate, length));

	}

	public void newTvSeries(String name, int yearOfPublication, int series, int episode, int startYear, int endYear) {
		saveVideoArt(new TvSeries(name, yearOfPublication, series, episode, startYear, endYear));
	}

	//// pridanie zanru do video art

	public void addGenre(VideoArt videoArt, Genre genre) {
		videoArt.addGenre(genre);
	}

	// pridanie rezisera do video art

	public void addDirector(VideoArt videoart, Celebrity director) {
		videoart.addDirector(director);
	}

	// pridanie herca do video art
	public void addActor(VideoArt videoart, Celebrity actor) {
		videoart.addActor(actor);
	}

	public void listAllVideoArts() {
		MovDatHelper.beginTransaction();
		List<VideoArt> videoArts = MovDatHelper.getEntityManager()
				.createQuery("select v from VideoArt v", VideoArt.class).getResultList();
		for (VideoArt videoArt : videoArts) {
			System.out.println(videoArt);
		}
		MovDatHelper.commitTransaction();
	}

	public VideoArt find(long id) {
		return MovDatHelper.getEntityManager().find(VideoArt.class, id);
	}

	// zobrazenie vsetkych filmov publikovanych vo zvoleny rok

	public void listAllMoviesByDateOfPublication(int year) {
		MovDatHelper.beginTransaction();
		List<Movie> movies = MovDatHelper.getEntityManager()
				.createQuery("select m from Movie m where m.yearOfPublication=:year", Movie.class)
				.setParameter("year", year).getResultList();
		for (Movie movie : movies) {
			System.out.println(movie.getName() + " year of publication:" + movie.getYearOfPublication());

		}
		MovDatHelper.commitTransaction();
	}

	// zobrazenie vsetkych filmov v ktorych hral zvoleny herec
	public void listAllMoviesByCelebrity(Celebrity celebrity) {
		MovDatHelper.beginTransaction();
		List<Movie> movies = MovDatHelper.getEntityManager()
				.createQuery("select m from Movie m join fetch m.actors a where a.id=:id", Movie.class)
				.setParameter("id", celebrity.getId()).getResultList();
		for (Movie movie : movies) {
			System.out.println(movie);

		}
		MovDatHelper.commitTransaction();
	}

	// zobrazenie celkoveho poctu tv serialov v databaze

	public void countTvSeries() {
		MovDatHelper.beginTransaction();
		List<TvSeries> series = MovDatHelper.getEntityManager().createQuery("select s from TvSeries s ", TvSeries.class)
				.getResultList();
		int i = 0;
		for (TvSeries serie : series) {
			i++;

		}
		System.out.println("Count of series: " + i);
		MovDatHelper.commitTransaction();
	}

	// zobrazenie celkoveho poctu filmov v databaze

	public void countMovies() {
		MovDatHelper.beginTransaction();
		List<Movie> movies = MovDatHelper.getEntityManager().createQuery("select m from Movie m ", Movie.class)
				.getResultList();
		int i = 0;
		for (Movie movie : movies) {
			i++;

		}
		System.out.println("Count of movies: " + i);
		MovDatHelper.commitTransaction();
	}

	// zobrazenie vsetkych filmov a serialov zvoleneho zanru

	public void listAllVideoArtByGenre(Genre genre) {
		MovDatHelper.beginTransaction();
		List<VideoArt> videoArts = MovDatHelper.getEntityManager()
				.createQuery("select v from VideoArt v join fetch v.genres g where g.id=:id", VideoArt.class)
				.setParameter("id", genre.getId()).getResultList();
		for (VideoArt videoArt : videoArts) {
			System.out.println(videoArt.getName());

		}
		MovDatHelper.commitTransaction();
	}

	// zobrazenie vsetkych filmov, ktore maju aspon jedno review s hodnotenim
	// podla zvoleneho cisla a vyssie

	public void listAllMoviesByRating(int rating) {
		MovDatHelper.beginTransaction();
		List<Movie> movies = MovDatHelper.getEntityManager()
				.createQuery("select m from Movie m join fetch m.reviews r where r.rating>=:rating", Movie.class)
				.setParameter("rating", rating).getResultList();
		for (Movie movie : movies) {
			System.out.println(movie.getName());
		}
		MovDatHelper.commitTransaction();
	}

	// zobrazenie suctu minut filmov zvoleneho zanru

	public void sumMinutesMovieByGenre(Genre genre) {
		MovDatHelper.beginTransaction();
		List<Movie> movies = MovDatHelper.getEntityManager()
				.createQuery("select m from Movie m join fetch m.genres g where g.id=:id", Movie.class)
				.setParameter("id", genre.getId()).getResultList();
		int i = 0;
		for (Movie movie : movies) {
			i = +movie.getLength();

		}

		System.out.println("Zobrazenie suctu minut filmov zvoleneho zanru: " + i);
		MovDatHelper.commitTransaction();
	}

	// zobrazenie najlepsie hodnoteneho filmu (pouzit priemer hodnoteni pre
	// film)

	public void bestRatingMovie() {
		MovDatHelper.beginTransaction();
		List<Movie> movies = MovDatHelper.getEntityManager().createQuery("select m from Movie m ", Movie.class)
				.getResultList();

		Movie bestMovie = movies.get(0);
		List<Review> reviews1 = movies.get(0).getReviews();
		int sumReviewFirstMovie = 0;
		for (Review review : reviews1) {
			sumReviewFirstMovie = sumReviewFirstMovie + review.getRating();
		}

		for (int i = 1; i < movies.size(); i++) {

			Movie compareMovie = movies.get(i);

			List<Review> reviews2 = compareMovie.getReviews();

			int sumReviewCompareMovie = 0;

			for (Review review : reviews2) {
				sumReviewCompareMovie += review.getRating();
			}

			if (sumReviewFirstMovie < sumReviewCompareMovie) {
				bestMovie = compareMovie;
			}

		}

		System.out.println(bestMovie.getName());
		MovDatHelper.commitTransaction();
	}

}
