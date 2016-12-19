package Ben;

import java.sql.Date;

public class Inventory {
	private long inventory_id;
	private long film_id;
	private long store_id;
	private Date last_update;
	public long getInventory_id() {
		return inventory_id;
	}
	public void setInventory_id(long inventory_id) {
		this.inventory_id = inventory_id;
	}
	public long getFilm_id() {
		return film_id;
	}
	public void setFilm_id(long film_id) {
		this.film_id = film_id;
	}
	public long getStore_id() {
		return store_id;
	}
	public void setStore_id(long store_id) {
		this.store_id = store_id;
	}
	public Date getLast_update() {
		return last_update;
	}
	public void setLast_update(Date last_update) {
		this.last_update = last_update;
	}
	@Override
	public String toString() {
		return "Inventory [inventory_id=" + inventory_id + ", film_id=" + film_id + ", store_id=" + store_id
				+ ", last_update=" + last_update + "]";
	}
	public Inventory(long inventory_id, long film_id, long store_id, Date last_update) {
		super();
		this.inventory_id = inventory_id;
		this.film_id = film_id;
		this.store_id = store_id;
		this.last_update = last_update;
	}
	public Inventory() {
		super();
	}
	
}
