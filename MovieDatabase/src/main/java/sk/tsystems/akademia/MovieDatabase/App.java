package sk.tsystems.akademia.MovieDatabase;

import java.util.Date;

import sk.tsystems.akademia.MovieDatabase.dao.CelebrityDao;
import sk.tsystems.akademia.MovieDatabase.dao.GenreDao;
import sk.tsystems.akademia.MovieDatabase.dao.ReviewDao;
import sk.tsystems.akademia.MovieDatabase.dao.VideoArtDao;
import sk.tsystems.akademia.MovieDatabase.model.Celebrity;
import sk.tsystems.akademia.MovieDatabase.model.Genre;
import sk.tsystems.akademia.MovieDatabase.model.Movie;
import sk.tsystems.akademia.MovieDatabase.model.TvSeries;
import sk.tsystems.akademia.MovieDatabase.model.VideoArt;
import sk.tsystems.akademia.MovieDatabase.model.Review;;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		// Vlozte udaje do systemu - minimalne 5 realnych filmov, 5 serialov, 8
		// celebrit, 5 zanrov a pre kazdy video art vlozte 1-3 review. Pre
		// vyplnenie skutocnych udajov si mozete pomoct databazou IMDb alebo
		// CSFD.

		// Vlozenie filmov

		// Movie theDoors = new Movie("The Doors", 1991, new Date(), 140);
		// Movie sauna = new Movie("Sauna ", 2008, new Date(), 85);
		// Movie aurora = new Movie("Aurora ", 2010, new Date(), 181);
		// Movie air = new Movie("Air", 2015, new Date(), 95);
		// Movie inferno = new Movie("Inferno", 1999, new Date(), 92);
		//
		// VideoArtDao videoArtDao = new VideoArtDao();
		// videoArtDao.saveVideoArt(theDoors);
		// videoArtDao.saveVideoArt(sauna);
		// videoArtDao.saveVideoArt(aurora);
		// videoArtDao.saveVideoArt(air);
		// videoArtDao.saveVideoArt(inferno);

		// Vlozenie serialov

		// TvSeries theSimpsons = new TvSeries("The Simpsons", 1989, 50, 574,
		// 1989, 2015);
		// TvSeries bingBangTheory = new TvSeries(" The Big Bang Theory", 2007,
		// 10, 183, 2007, 2015);
		// TvSeries friends = new TvSeries(" Friends", 1994, 20, 238, 1994,
		// 2015);
		// TvSeries hImYm = new TvSeries(" How I Met Your Mother", 2005, 20,
		// 208, 2005, 2015);
		// TvSeries house = new TvSeries(" House M.D.", 2004, 15, 177, 2004,
		// 2015);
		//
		// videoArtDao.saveVideoArt(theSimpsons);
		// videoArtDao.saveVideoArt(bingBangTheory);
		// videoArtDao.saveVideoArt(friends);
		// videoArtDao.saveVideoArt(hImYm);
		// videoArtDao.saveVideoArt(house);

		// Vlozenie celebrit

		// Celebrity hugh = new Celebrity("Hugh", "Laurie", new Date(),
		// "James Hugh Calum Laurie zdědil sportovní nadání" + " po svém otci,
		// který vyhrál zlatou medail");
		// Celebrity omar = new Celebrity("Omar", "Epps", new Date(),
		// "Omar Epps se narodil v Brooklynu 23.7.1973." + " Už od mládí
		// projevoval vztahy ke kultuře.");
		// Celebrity robert = new Celebrity("Robert Sean", "Leonard", new
		// Date(),
		// "Robert Sean Leonard se narodil 28.2.1969"
		// + " ve Westwoodu v USA. Vystudoval historii na Fordhamské
		// univerzitě.");
		// Celebrity jesse = new Celebrity("Jesse", "Spencer", new Date(),
		// "Jesse Gordon Spencer se narodil 12." + " února 1979 v Melbourne ve
		// znamení Vodnáře.");
		// Celebrity lisa = new Celebrity("Lisa", "Edelstein", new Date(),
		// "Lisa se narodila židovským rodičům " + "Alvin a Bonnie
		// Edelsteinovým.");
		// Celebrity jenifer = new Celebrity("Jennifer", "Morrison", new Date(),
		// "Jennifer Marie Morrison je americká herečka.");
		// Celebrity peter = new Celebrity("Peter", "Jacobson ", new Date(),
		// "Peter Jacobson se narodil 24. března 1965 v Chicagu," + " americkém
		// státě Illionois.");
		// Celebrity olivia = new Celebrity("Olivia", "Wilde ", new Date(),
		// "Olivia Wilde je dcérou žurnalistu a scenáristu filmu"
		// + " Peacemaker Andrewa Cockburna a Leslie Redlichovej,");
		//
		// CelebrityDao celebrityDao = new CelebrityDao();
		// celebrityDao.saveCelebrity(olivia);
		// celebrityDao.saveCelebrity(hugh);
		// celebrityDao.saveCelebrity(peter);
		// celebrityDao.saveCelebrity(jenifer);
		// celebrityDao.saveCelebrity(lisa);
		// celebrityDao.saveCelebrity(robert);
		// celebrityDao.saveCelebrity(omar);
		// celebrityDao.saveCelebrity(jesse);

		// Zanre

		// Genre drama = new Genre("drama", "dramaticek");
		// Genre horor = new Genre("horor", "hororove");
		// Genre komedia = new Genre("komedia", "komedialne");
		// Genre scifi = new Genre("scifi", "scificke");
		// Genre action = new Genre("action", "akcne");
		//
		// GenreDao genreDao = new GenreDao();
		//
		// genreDao.saveGenre(action);
		// genreDao.saveGenre(drama);
		// genreDao.saveGenre(horor);
		// genreDao.saveGenre(komedia);
		// genreDao.saveGenre(scifi);

		// Review

		// Review review1 = new Review(1, "review1");
		// Review review2 = new Review(1, "review2");
		// Review review3 = new Review(1, "review3");
		// Review review4 = new Review(1, "review4");
		// Review review5 = new Review(1, "review5");
		// Review review6 = new Review(1, "review6");
		// Review review7 = new Review(1, "review7");
		// Review review8= new Review(1, "review8");
		// Review review9 = new Review(1, "review9");
		// Review review10 = new Review(1, "review10");
		//
		// ReviewDao reviewDao = new ReviewDao();
		//
		// reviewDao.saveReview(review1);
		// reviewDao.saveReview(review2);
		// reviewDao.saveReview(review3);
		// reviewDao.saveReview(review4);
		// reviewDao.saveReview(review5);
		// reviewDao.saveReview(review6);
		// reviewDao.saveReview(review7);
		// reviewDao.saveReview(review8);
		// reviewDao.saveReview(review9);
		// reviewDao.saveReview(review10);

		// Pridanie reviews

		// ReviewDao reviewDao = new ReviewDao();
		// VideoArtDao videoArtDao = new VideoArtDao();
		// reviewDao.find(49).addReviewed(videoArtDao.find(21));
		// reviewDao.find(50).addReviewed(videoArtDao.find(22));
		// reviewDao.find(51).addReviewed(videoArtDao.find(23));
		// reviewDao.find(52).addReviewed(videoArtDao.find(24));
		// reviewDao.find(53).addReviewed(videoArtDao.find(25));
		// reviewDao.find(54).addReviewed(videoArtDao.find(26));
		// reviewDao.find(55).addReviewed(videoArtDao.find(27));
		// reviewDao.find(56).addReviewed(videoArtDao.find(28));
		// reviewDao.find(57).addReviewed(videoArtDao.find(29));
		// reviewDao.find(58).addReviewed(videoArtDao.find(30));

		// zobrazenie vsetkych filmov publikovanych vo zvoleny rok
		// VideoArtDao videoArtDao = new VideoArtDao();
		// videoArtDao.listAllMoviesByDateOfPublication(2010);

		// VideoArtDao videoArtDao = new VideoArtDao();
		// CelebrityDao celebrityDao = new CelebrityDao();
		// Celebrity c1 = celebrityDao.find(31);
		// Celebrity c2 = celebrityDao.find(31);
		// videoArtDao.find(21).addActor(c1);
		// videoArtDao.find(21).addActor(c2);

		// zobrazenie vsetkych filmov v ktorych hral zvoleny herec
		// VideoArtDao videoArtDao = new VideoArtDao();
		// CelebrityDao celebrityDao = new CelebrityDao();
		// videoArtDao.listAllMoviesByCelebrity(celebrityDao.find(31));

		// zobrazenie celkoveho poctu tv serialov v databaze
		// VideoArtDao videoArtDao = new VideoArtDao();
		// videoArtDao.countTvSeries();

		// zobrazenie celkoveho poctu filmov v databaze
		// VideoArtDao videoArtDao = new VideoArtDao();
		// videoArtDao.countMovies();

		// VideoArtDao videoArtDao = new VideoArtDao();
		// GenreDao genreDao = new GenreDao();
		// VideoArt v = videoArtDao.find(21);
		// v.addGenre(genreDao.find(44));
		// videoArtDao.saveVideoArt(v);

		// zobrazenie vsetkych filmov a serialov zvoleneho zanru
		// VideoArtDao videoArtDao = new VideoArtDao();
		// GenreDao genreDao = new GenreDao();
		// videoArtDao.listAllVideoArtByGenre(genreDao.find(44));

		// VideoArtDao videoArtDao = new VideoArtDao();
		// ReviewDao reviewDao = new ReviewDao();
		//
		// Review r = reviewDao.find(49);
		// r.addReviewed(videoArtDao.find(21));
		// reviewDao.saveReview(r);

		// zobrazenie vsetkych filmov, ktore maju aspon jedno review s
		// hodnotenim
		// podla zvoleneho cisla a vyssie
		// VideoArtDao videoArtDao = new VideoArtDao();
		// videoArtDao.listAllMoviesByRating(1);

		// zobrazenie suctu minut filmov zvoleneho zanru
		// VideoArtDao videoArtDao = new VideoArtDao();
		// GenreDao genreDao = new GenreDao();
		// videoArtDao.sumMinutesMovieByGenre(genreDao.find(44));

		// VideoArtDao videoArtDao = new VideoArtDao();
		// ReviewDao reviewDao = new ReviewDao();
		// // Review review11 = new Review(5, "review11");
		// Review r = reviewDao.find(60);
		// VideoArt v = videoArtDao.find(24);
		// r.addReviewed(v);

		// zobrazenie najlepsie hodnoteneho filmu (pouzit priemer hodnoteni pre
		// film)
		// VideoArtDao videoArtDao = new VideoArtDao();
		// videoArtDao.bestRatingMovie();

		MovDatHelper.close();
	}
}
