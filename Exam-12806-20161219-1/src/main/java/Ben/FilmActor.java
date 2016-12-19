package Ben;

import java.sql.Timestamp;

public class FilmActor {

	private Long actor_id;
	
	private Long film_id;
	
	private Timestamp last_update;

	public Long getActor_id() {
		return actor_id;
	}

	public void setActor_id(Long actor_id) {
		this.actor_id = actor_id;
	}

	public Long getFilm_id() {
		return film_id;
	}

	public void setFilm_id(Long film_id) {
		this.film_id = film_id;
	}

	public Timestamp getLast_update() {
		return last_update;
	}

	public void setLast_update(Timestamp last_update) {
		this.last_update = last_update;
	}

	@Override
	public String toString() {
		return "FilmActor [actor_id=" + actor_id + ", film_id=" + film_id + ", last_update=" + last_update + "]";
	}

	public FilmActor(Long actor_id, Long film_id, Timestamp last_update) {
		super();
		this.actor_id = actor_id;
		this.film_id = film_id;
		this.last_update = last_update;
	}

	public FilmActor() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
