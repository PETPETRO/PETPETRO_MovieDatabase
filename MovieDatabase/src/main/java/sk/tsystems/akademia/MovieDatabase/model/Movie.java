package sk.tsystems.akademia.MovieDatabase.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Movie extends VideoArt {

	// Movie
	// - publication date (first date of release in cinema - not time)
	// - length (in minutes)

	@Temporal(TemporalType.DATE)
	private Date publicationDate;

	private int length;

	public Movie(String name, int yearOfPublication, Date publicationDate, int length) {
		super(name, yearOfPublication);
		this.publicationDate = publicationDate;
		this.length = length;
	}

	public Movie() {
	}

	/**
	 * @return the publicationDate
	 */
	public Date getPublicationDate() {
		return publicationDate;
	}

	/**
	 * @param publicationDate
	 *            the publicationDate to set
	 */
	public void setPublicationDate(Date publicationDate) {
		this.publicationDate = publicationDate;
	}

	/**
	 * @return the length
	 */
	public int getLength() {
		return length;
	}

	/**
	 * @param length
	 *            the length to set
	 */
	public void setLength(int length) {
		this.length = length;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Movie [");
		if (publicationDate != null) {
			builder.append("publicationDate=");
			builder.append(publicationDate);
			builder.append(", ");
		}
		builder.append("length=");
		builder.append(length);
		builder.append("]");
		return builder.toString();
	}

}
