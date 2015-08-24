package sk.tsystems.akademia.MovieDatabase.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public abstract class VideoArt {

	// VideoArt (abstract)
	// - name
	// - year of publication (not date)
	// - genres (Genre 0..* master)
	// - directors (Celebrity 0..* master)
	// - actors (Celebrity 0..* master)
	// - reviews (Review 0..* slave)
	// - additional info (List<String>)

	@Id
	@GeneratedValue
	private long id;

	private String name;

	private int yearOfPublication;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "directors")
	private List<Celebrity> directors = new ArrayList<Celebrity>();

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "actors")
	private List<Celebrity> actors = new ArrayList<Celebrity>();

	@ElementCollection(fetch = FetchType.EAGER)
	private List<String> additonalInfo = new ArrayList<String>();

	@ManyToMany(cascade = CascadeType.ALL)
	private List<Genre> genres = new ArrayList<Genre>();

	@OneToMany(mappedBy = "reviewed", cascade = CascadeType.ALL)
	private List<Review> reviews = new ArrayList<Review>();

	public VideoArt(String name, int yearOfPublication) {
		this.name = name;
		this.yearOfPublication = yearOfPublication;
	}

	public VideoArt() {
	}

	/**
	 * @return the reviews
	 */
	public List<Review> getReviews() {
		return reviews;
	}

	/**
	 * @param reviews
	 *            the reviews to set
	 */
	public void addReviews(Review review) {
		reviews.add(review);
	}

	/**
	 * @return the genres
	 */
	public List<Genre> getGenres() {
		return genres;
	}

	/**
	 * @param genres
	 *            the genres to set
	 */
	public void addGenre(Genre genre) {
		genres.add(genre);
	}

	/**
	 * @return the additonalInfo
	 */
	public List<String> getAdditonalInfo() {
		return additonalInfo;
	}

	/**
	 * @param additonalInfo
	 *            the additonalInfo to set
	 */
	public void addAdditonalInfo(String info) {
		additonalInfo.add(info);
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the yearOfPublication
	 */
	public int getYearOfPublication() {
		return yearOfPublication;
	}

	/**
	 * @param yearOfPublication
	 *            the yearOfPublication to set
	 */
	public void setYearOfPublication(int yearOfPublication) {
		this.yearOfPublication = yearOfPublication;
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @return the actors
	 */
	public List<Celebrity> getActors() {
		return actors;
	}

	/**
	 * @param actors
	 *            the actors to set
	 */
	public void addActor(Celebrity actor) {
		actors.add(actor);
		actor.addActedAt(this);
	}

	/**
	 * @return the directors
	 */
	public List<Celebrity> getDirectors() {
		return directors;
	}

	/**
	 * @param directors
	 *            the directors to set
	 */
	public void addDirector(Celebrity director) {
		directors.add(director);
		director.addDirected(this);
	}

	/**
	 * @return the reviews
	 */
	// public List<Review> getReviews() {
	// return reviews;
	// }

	/**
	 * @param reviews
	 *            the reviews to set
	 */
	// public void addReviews(Review review) {
	// reviews.add(review);
	// }

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("VideoArt [id=");
		builder.append(id);
		builder.append(", ");
		if (name != null) {
			builder.append("name=");
			builder.append(name);
			builder.append(", ");
		}
		builder.append("yearOfPublication=");
		builder.append(yearOfPublication);
		builder.append(", ");
		// if (directors != null) {
		// builder.append("directors=");
		// builder.append(directors);
		// builder.append(", ");
		// }
		// if (actors != null) {
		// builder.append("actors=");
		// builder.append(actors);
		// builder.append(", ");
		// }
		if (additonalInfo != null) {
			builder.append("additonalInfo=");
			builder.append(additonalInfo);
			builder.append(", ");
		}
		// if (genres != null) {
		// builder.append("genres=");
		// builder.append(genres);
		// builder.append(", ");
		// }
		// if (reviews != null) {
		// builder.append("reviews=");
		// builder.append(reviews);
		// }
		builder.append("]");
		return builder.toString();
	}

}
