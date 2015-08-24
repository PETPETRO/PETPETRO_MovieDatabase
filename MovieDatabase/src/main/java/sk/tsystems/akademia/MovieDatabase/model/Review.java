package sk.tsystems.akademia.MovieDatabase.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;

@Entity
public class Review {

	// Review (anonymous reviews)
	// - datetime of creation (should be filled as automatic value using
	// @PrePersist)
	// - reviewed (VideoArt 0..1 master)
	// - rating ( int 1 - 10 )
	// - text (max 5000 chars)

	@Id
	@GeneratedValue
	private long id;

	private Date dateTimeOfCreation;

	@ManyToOne
	private VideoArt reviewed;

	public int rating;

	@Column(length = 5000)
	public String text;

	public Review(int rating, String text) {
		this.rating = rating;
		this.text = text;
	}

	public Review() {
	}

	/**
	 * @return the dateTimeOfCreation
	 */
	public Date getDateTimeOfCreation() {
		return dateTimeOfCreation;
	}

	/**
	 * @param dateTimeOfCreation
	 *            the dateTimeOfCreation to set
	 */

	public void setDateTimeOfCreation(Date dateTimeOfCreation) {
		this.dateTimeOfCreation = dateTimeOfCreation;
	}

	@PrePersist
	public void addDateTimeOfCreation() {
		this.dateTimeOfCreation = new Date();
	}

	/**
	 * @return the rating
	 */
	public int getRating() {
		return rating;
	}

	/**
	 * @param rating
	 *            the rating to set
	 */
	public void setRating(int rating) {
		this.rating = rating;
	}

	/**
	 * @return the text
	 */
	public String getText() {
		return text;
	}

	/**
	 * @param text
	 *            the text to set
	 */
	public void setText(String text) {
		this.text = text;
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @return the reviewed
	 */
	public VideoArt getReviewed() {
		return reviewed;
	}

	/**
	 * @param reviewed
	 *            the reviewed to set
	 */
	public void addReviewed(VideoArt review) {
		this.reviewed = review;
		review.addReviews(this);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Review [id=");
		builder.append(id);
		builder.append(", ");
		if (dateTimeOfCreation != null) {
			builder.append("dateTimeOfCreation=");
			builder.append(dateTimeOfCreation);
			builder.append(", ");
		}
		if (reviewed != null) {
			builder.append("reviewed=");
			builder.append(reviewed);
			builder.append(", ");
		}
		builder.append("rating=");
		builder.append(rating);
		builder.append(", ");
		if (text != null) {
			builder.append("text=");
			builder.append(text);
		}
		builder.append("]");
		return builder.toString();
	}

}
