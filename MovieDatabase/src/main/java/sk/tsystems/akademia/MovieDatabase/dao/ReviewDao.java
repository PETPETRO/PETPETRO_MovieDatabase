package sk.tsystems.akademia.MovieDatabase.dao;

import java.util.List;

import sk.tsystems.akademia.MovieDatabase.MovDatHelper;
import sk.tsystems.akademia.MovieDatabase.model.Review;
import sk.tsystems.akademia.MovieDatabase.model.VideoArt;

public class ReviewDao {

	public void saveReview(Review review) {
		MovDatHelper.beginTransaction();
		MovDatHelper.getEntityManager().persist(review);
		MovDatHelper.commitTransaction();
	}

	// vytvorenie review k video art

	public void newReview(VideoArt videoArt, Review review) {
		review.addReviewed(videoArt);
	}

	public void listAllReviews() {
		MovDatHelper.beginTransaction();
		List<Review> reviews = MovDatHelper.getEntityManager().createQuery("select r from Review r", Review.class)
				.getResultList();
		for (Review review : reviews) {
			System.out.println(review);
		}
		MovDatHelper.commitTransaction();
	}

	public Review find(long id) {
		return MovDatHelper.getEntityManager().find(Review.class, id);
	}

}
