package Ben;

import java.sql.Date;

public class Country {

	private long country_id;
	private String country;
	private Date last_update;
	
	public Country() {}

	public Country(long country_id, String country, Date last_update) {
		this.country_id = country_id;
		this.country = country;
		this.last_update = last_update;
	}

	public long getCountry_id() {
		return country_id;
	}

	public void setCountry_id(long country_id) {
		this.country_id = country_id;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Date getLast_update() {
		return last_update;
	}

	public void setLast_update(Date last_update) {
		this.last_update = last_update;
	}
	
	
}
