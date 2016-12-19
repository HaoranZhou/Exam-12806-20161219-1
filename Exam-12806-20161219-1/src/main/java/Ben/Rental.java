package Ben;

import java.sql.Date;

public class Rental {

	private long rental_id;
	private Date rental_date;
	private long inventory_id;
	private long customer_id;
	private Date return_date;
	private long staff_id;
	private Date last_update;
	
	public Rental(long rental_id, Date rental_date, long inventory_id, long customer_id, Date return_date,
			long staff_id, Date last_update) {
		this.rental_id = rental_id;
		this.rental_date = rental_date;
		this.inventory_id = inventory_id;
		this.customer_id = customer_id;
		this.return_date = return_date;
		this.staff_id = staff_id;
		this.last_update = last_update;
	}
	public Rental() {
	}
	
	
	public long getRental_id() {
		return rental_id;
	}
	public void setRental_id(long rental_id) {
		this.rental_id = rental_id;
	}
	public Date getRental_date() {
		return rental_date;
	}
	public void setRental_date(Date rental_date) {
		this.rental_date = rental_date;
	}
	public long getInventory_id() {
		return inventory_id;
	}
	public void setInventory_id(long inventory_id) {
		this.inventory_id = inventory_id;
	}
	public long getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(long customer_id) {
		this.customer_id = customer_id;
	}
	public Date getReturn_date() {
		return return_date;
	}
	public void setReturn_date(Date return_date) {
		this.return_date = return_date;
	}
	public long getStaff_id() {
		return staff_id;
	}
	public void setStaff_id(long staff_id) {
		this.staff_id = staff_id;
	}
	public Date getLast_update() {
		return last_update;
	}
	public void setLast_update(Date last_update) {
		this.last_update = last_update;
	}
	
	
}
