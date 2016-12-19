package Ben;

import java.sql.Date;


public class Actor {
	
	private long cator_id;
	private String first_name;
	private String last_name;
	private Date last_update;
	public long getCator_id() {
		return  cator_id;
	}
	public void setCator_id(long cator_id) {
		this.cator_id = cator_id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public Date getLast_update() {
		return last_update;
	}
	public void setLast_update(Date last_update) {
		this.last_update = last_update;
	}
	@Override
	public String toString() {
		return "Actor [cator_id=" + cator_id + ", first_name=" + first_name + ", last_name=" + last_name
				+ ", last_update=" + last_update + "]";
	}
	public Actor(int cator_id, String first_name, String last_name, Date last_update) {
		super();
		this.cator_id = cator_id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.last_update = last_update;
	}
	public Actor() {
		super();
	}
	
}
