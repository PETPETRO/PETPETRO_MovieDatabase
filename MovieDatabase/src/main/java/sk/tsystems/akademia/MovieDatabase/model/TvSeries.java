package sk.tsystems.akademia.MovieDatabase.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;

@Entity
public class TvSeries extends VideoArt {

	// Tv Series
	// - series count
	// - episode count
	// - start year
	// - end year

	private int series;

	private int episode;

	private int startYear;

	private int endYear;

	public TvSeries(String name, int yearOfPublication, int series, int episode, int startYear, int endYear) {
		super(name, yearOfPublication);
		this.series = series;
		this.episode = episode;
		this.startYear = startYear;
		this.endYear = endYear;
	}

	public TvSeries() {
	}

	/**
	 * @return the series
	 */
	public int getSeries() {
		return series;
	}

	/**
	 * @param series
	 *            the series to set
	 */
	public void setSeries(int series) {
		this.series = series;
	}

	/**
	 * @return the episode
	 */
	public int getEpisode() {
		return episode;
	}

	/**
	 * @param episode
	 *            the episode to set
	 */
	public void setEpisode(int episode) {
		this.episode = episode;
	}

	/**
	 * @return the startYear
	 */
	public int getStartYear() {
		return startYear;
	}

	/**
	 * @param startYear
	 *            the startYear to set
	 */
	public void setStartYear(int startYear) {
		this.startYear = startYear;
	}

	/**
	 * @return the endYear
	 */
	public int getEndYear() {
		return endYear;
	}

	/**
	 * @param endYear
	 *            the endYear to set
	 */
	public void setEndYear(int endYear) {
		this.endYear = endYear;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("TvSeries [series=");
		builder.append(series);
		builder.append(", episode=");
		builder.append(episode);
		builder.append(", startYear=");
		builder.append(startYear);
		builder.append(", endYear=");
		builder.append(endYear);
		builder.append("]");
		return builder.toString();
	}

}
