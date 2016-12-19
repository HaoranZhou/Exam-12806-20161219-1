package Ben;

import java.sql.Timestamp;

public class FilmCategory {

	private Long film_id;
	
	private Long category_id;
	
	private Timestamp last_update;

	public Long getFilm_id() {
		return film_id;
	}

	public void setFilm_id(Long film_id) {
		this.film_id = film_id;
	}

	public Long getCategory_id() {
		return category_id;
	}

	public void setCategory_id(Long category_id) {
		this.category_id = category_id;
	}

	public Timestamp getLast_update() {
		return last_update;
	}

	public void setLast_update(Timestamp last_update) {
		this.last_update = last_update;
	}

	@Override
	public String toString() {
		return "FilmCategory [film_id=" + film_id + ", category_id=" + category_id + ", last_update=" + last_update
				+ "]";
	}

	public FilmCategory(Long film_id, Long category_id, Timestamp last_update) {
		super();
		this.film_id = film_id;
		this.category_id = category_id;
		this.last_update = last_update;
	}

	public FilmCategory() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
