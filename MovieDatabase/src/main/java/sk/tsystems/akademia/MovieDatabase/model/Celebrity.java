package sk.tsystems.akademia.MovieDatabase.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import javassist.expr.NewArray;

@Entity
public class Celebrity {

	// Celebrity
	// - surname
	// - first name
	// - date of birth (only date, not time)
	// - biography (max. 3000chars)
	// - directed (VideoArt 0..* slave)
	// - actedAt (VideoArt 0..* slave)

	@Id
	@GeneratedValue
	private long id;

	private String firstName;

	private String surname;

	@Temporal(TemporalType.DATE)
	private Date dateOfBirth;

	@Column(length = 3000)
	private String biography;

	@ManyToMany(mappedBy = "directors", cascade = CascadeType.ALL)
	private List<VideoArt> directed = new ArrayList<VideoArt>();

	@ManyToMany(mappedBy = "actors", cascade = CascadeType.ALL)
	private List<VideoArt> actedAt = new ArrayList<VideoArt>();

	public Celebrity(String firstName, String surname, Date dateOfBirth, String biography) {
		super();
		this.firstName = firstName;
		this.surname = surname;
		this.dateOfBirth = dateOfBirth;
		this.biography = biography;
	}

	public Celebrity() {
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName
	 *            the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the surname
	 */
	public String getSurname() {
		return surname;
	}

	/**
	 * @param surname
	 *            the surname to set
	 */
	public void setSurname(String surname) {
		this.surname = surname;
	}

	/**
	 * @return the dateOfBirth
	 */
	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	/**
	 * @param dateOfBirth
	 *            the dateOfBirth to set
	 */
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	/**
	 * @return the biography
	 */
	public String getBiography() {
		return biography;
	}

	/**
	 * @param biography
	 *            the biography to set
	 */
	public void setBiography(String biography) {
		this.biography = biography;
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @return the directed
	 */
	public List<VideoArt> getDirected() {
		return directed;
	}

	/**
	 * @param directed
	 *            the directed to set
	 */
	public void addDirected(VideoArt direct) {
		directed.add(direct);
	}

	/**
	 * @return the actedAt
	 */
	public List<VideoArt> getActedAt() {
		return actedAt;
	}

	/**
	 * @param actedAt
	 *            the actedAt to set
	 */
	public void addActedAt(VideoArt actAt) {
		actedAt.add(actAt);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Celebrity [id=");
		builder.append(id);
		builder.append(", ");
		if (firstName != null) {
			builder.append("firstName=");
			builder.append(firstName);
			builder.append(", ");
		}
		if (surname != null) {
			builder.append("surname=");
			builder.append(surname);
			builder.append(", ");
		}
		if (dateOfBirth != null) {
			builder.append("dateOfBirth=");
			builder.append(dateOfBirth);
			builder.append(", ");
		}
		if (biography != null) {
			builder.append("biography=");
			builder.append(biography);
			builder.append(", ");
		}
		if (directed != null) {
			builder.append("directed=");
			builder.append(directed);
			builder.append(", ");
		}
		if (actedAt != null) {
			builder.append("actedAt=");
			builder.append(actedAt);
		}
		builder.append("]");
		return builder.toString();
	}

}
