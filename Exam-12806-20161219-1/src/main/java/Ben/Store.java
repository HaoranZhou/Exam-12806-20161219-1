package Ben;

import java.sql.Date;

public class Store {

	private long store_id;
	private long manager_staff_id;
	private long address_id;
	private Date last_update;
	public Store(long store_id, long manager_staff_id, long address_id, Date last_update) {
		this.store_id = store_id;
		this.manager_staff_id = manager_staff_id;
		this.address_id = address_id;
		this.last_update = last_update;
	}
	public Store() {}
	public long getStore_id() {
		return store_id;
	}
	public void setStore_id(long store_id) {
		this.store_id = store_id;
	}
	public long getManager_staff_id() {
		return manager_staff_id;
	}
	public void setManager_staff_id(long manager_staff_id) {
		this.manager_staff_id = manager_staff_id;
	}
	public long getAddress_id() {
		return address_id;
	}
	public void setAddress_id(long address_id) {
		this.address_id = address_id;
	}
	public Date getLast_update() {
		return last_update;
	}
	public void setLast_update(Date last_update) {
		this.last_update = last_update;
	}
	
	
}
