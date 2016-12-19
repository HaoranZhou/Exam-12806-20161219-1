package Ben;

public class FilmText {

	private Long film_id;
	
	private String title;
	
	private String description;

	public Long getFilm_id() {
		return film_id;
	}

	public void setFilm_id(Long film_id) {
		this.film_id = film_id;
	}

	public FilmText() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FilmText(Long film_id, String title, String description) {
		super();
		this.film_id = film_id;
		this.title = title;
		this.description = description;
	}

	@Override
	public String toString() {
		return "FilmText [film_id=" + film_id + ", title=" + title + ", description=" + description + "]";
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
	
}
