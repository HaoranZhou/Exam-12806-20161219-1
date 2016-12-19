package Ben;

import java.sql.Date;
import java.sql.Timestamp;

public class Film {
	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public Film(String language, Long film_id, String title, String description) {
		super();
		this.language = language;
		this.film_id = film_id;
		this.title = title;
		this.description = description;
	}

	public Film(String language, Long film_id, String title, String description, Date release_year, Long language_id,
			Long original_language_id, Long rental_duration, double rental_rate, Long length, double replacement_cost,
			String rating, String special_features, Timestamp last_update) {
		super();
		this.language = language;
		this.film_id = film_id;
		this.title = title;
		this.description = description;
		this.release_year = release_year;
		this.language_id = language_id;
		this.original_language_id = original_language_id;
		this.rental_duration = rental_duration;
		this.rental_rate = rental_rate;
		this.length = length;
		this.replacement_cost = replacement_cost;
		this.rating = rating;
		this.special_features = special_features;
		this.last_update = last_update;
	}

	private String language;
	
	private Long film_id;

	private String title;

	private String description;

	private Date release_year;

	private Long language_id;

	private Long original_language_id;

	private Long rental_duration;

	private double rental_rate;

	private Long length;

	private double replacement_cost;

	private String rating;

	private String special_features;

	private Timestamp last_update;

	public Long getFilm_id() {
		return film_id;
	}

	public void setFilm_id(Long film_id) {
		this.film_id = film_id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getRelease_year() {
		return release_year;
	}

	public void setRelease_year(Date release_year) {
		this.release_year = release_year;
	}

	public Long getLanguage_id() {
		return language_id;
	}

	public void setLanguage_id(Long language_id) {
		this.language_id = language_id;
	}

	public Long getOriginal_language_id() {
		return original_language_id;
	}

	public void setOriginal_language_id(Long original_language_id) {
		this.original_language_id = original_language_id;
	}

	public Long getRental_duration() {
		return rental_duration;
	}

	public void setRental_duration(Long rental_duration) {
		this.rental_duration = rental_duration;
	}

	public double getRental_rate() {
		return rental_rate;
	}

	public void setRental_rate(double rental_rate) {
		this.rental_rate = rental_rate;
	}

	public Long getLength() {
		return length;
	}

	public void setLength(Long length) {
		this.length = length;
	}

	public double getReplacement_cost() {
		return replacement_cost;
	}

	public void setReplacement_cost(double replacement_cost) {
		this.replacement_cost = replacement_cost;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public String getSpecial_features() {
		return special_features;
	}

	public void setSpecial_features(String special_features) {
		this.special_features = special_features;
	}

	public Timestamp getLast_update() {
		return last_update;
	}

	public void setLast_update(Timestamp last_update) {
		this.last_update = last_update;
	}

	@Override
	public String toString() {
		return "Film [film_id=" + film_id + ", title=" + title + ", description=" + description + ", release_year="
				+ release_year + ", language_id=" + language_id + ", original_language_id=" + original_language_id
				+ ", rental_duration=" + rental_duration + ", rental_rate=" + rental_rate + ", length=" + length
				+ ", replacement_cost=" + replacement_cost + ", rating=" + rating + ", special_features="
				+ special_features + ", last_update=" + last_update + "]";
	}

	public Film(Long film_id, String title, String description, Date release_year, Long language_id,
			Long original_language_id, Long rental_duration, double rental_rate, Long length, double replacement_cost,
			String rating, String special_features, Timestamp last_update) {
		super();
		this.film_id = film_id;
		this.title = title;
		this.description = description;
		this.release_year = release_year;
		this.language_id = language_id;
		this.original_language_id = original_language_id;
		this.rental_duration = rental_duration;
		this.rental_rate = rental_rate;
		this.length = length;
		this.replacement_cost = replacement_cost;
		this.rating = rating;
		this.special_features = special_features;
		this.last_update = last_update;
	}

	public Film() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Film(String language, String title, String description) {
		super();
		this.language = language;
		this.title = title;
		this.description = description;
	}
	
}
