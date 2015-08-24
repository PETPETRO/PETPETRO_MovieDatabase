package sk.tsystems.akademia.MovieDatabase.dao;

import java.util.Date;
import java.util.List;

import sk.tsystems.akademia.MovieDatabase.MovDatHelper;
import sk.tsystems.akademia.MovieDatabase.model.Celebrity;

public class CelebrityDao {

	public void saveCelebrity(Celebrity celebrity) {
		MovDatHelper.beginTransaction();
		MovDatHelper.getEntityManager().persist(celebrity);
		MovDatHelper.commitTransaction();
	}

	// vytvorenie novej celebrity (BEZ priradenych filmov a serialov ktore
	// rezirovali alebo v ktorych hrali)
	public void newCelebrity(String firstName, String surname, Date dateOfBirth, String biography) {
		saveCelebrity(new Celebrity(firstName, surname, dateOfBirth, biography));
	}

	public void listAllCelebrities() {
		MovDatHelper.beginTransaction();
		List<Celebrity> celebrities = MovDatHelper.getEntityManager()
				.createQuery("select c from Celebrity c", Celebrity.class).getResultList();
		for (Celebrity celebrity : celebrities) {
			System.out.println(celebrity);
		}
		MovDatHelper.commitTransaction();
	}

	public Celebrity find(long id) {
		return MovDatHelper.getEntityManager().find(Celebrity.class, id);
	}

}
