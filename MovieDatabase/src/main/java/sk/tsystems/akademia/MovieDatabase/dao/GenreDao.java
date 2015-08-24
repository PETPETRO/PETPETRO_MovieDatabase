package sk.tsystems.akademia.MovieDatabase.dao;

import java.util.List;

import sk.tsystems.akademia.MovieDatabase.MovDatHelper;
import sk.tsystems.akademia.MovieDatabase.model.Genre;

public class GenreDao {

	public void saveGenre(Genre genre) {
		MovDatHelper.beginTransaction();
		MovDatHelper.getEntityManager().persist(genre);
		MovDatHelper.commitTransaction();
	}

	// vytvorenie noveho zanru (genre), vypisanie vsetkych ulozenych zanrov

	public void newGenre(String name, String description) {
		saveGenre(new Genre(name, description));
	}



	
	public void listAllGenres() {
		MovDatHelper.beginTransaction();
		List<Genre> genres = MovDatHelper.getEntityManager().createQuery("select g from Genre g", Genre.class)
				.getResultList();
		for (Genre genre : genres) {
			System.out.println(genre);
		}
		MovDatHelper.commitTransaction();
	}

	public Genre find(long id) {
		return MovDatHelper.getEntityManager().find(Genre.class, id);
	}
}
