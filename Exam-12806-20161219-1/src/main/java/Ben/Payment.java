package Ben;

import java.sql.Date;

public class Payment {
	private long payment_id;
	private long customer_id;
	private long staff_id;
	private long rental_id;
	private long amount;
	private Date payment_date;
	private Date last_update;
	public long getPayment_id() {
		return payment_id;
	}
	public void setPayment_id(long payment_id) {
		this.payment_id = payment_id;
	}
	public long getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(long customer_id) {
		this.customer_id = customer_id;
	}
	public long getStaff_id() {
		return staff_id;
	}
	public void setStaff_id(long staff_id) {
		this.staff_id = staff_id;
	}
	public long getRental_id() {
		return rental_id;
	}
	public void setRental_id(long rental_id) {
		this.rental_id = rental_id;
	}
	public long getAmount() {
		return amount;
	}
	public void setAmount(long amount) {
		this.amount = amount;
	}
	public Date getPayment_date() {
		return payment_date;
	}
	public void setPayment_date(Date payment_date) {
		this.payment_date = payment_date;
	}
	public Date getLast_update() {
		return last_update;
	}
	public void setLast_update(Date last_update) {
		this.last_update = last_update;
	}
	@Override
	public String toString() {
		return "Payment [payment_id=" + payment_id + ", customer_id=" + customer_id + ", staff_id=" + staff_id
				+ ", rental_id=" + rental_id + ", amount=" + amount + ", payment_date=" + payment_date
				+ ", last_update=" + last_update + "]";
	}
	public Payment(long payment_id, long customer_id, long staff_id, long rental_id, long amount, Date payment_date,
			Date last_update) {
		super();
		this.payment_id = payment_id;
		this.customer_id = customer_id;
		this.staff_id = staff_id;
		this.rental_id = rental_id;
		this.amount = amount;
		this.payment_date = payment_date;
		this.last_update = last_update;
	}
	public Payment() {
		super();
	}
	
}
