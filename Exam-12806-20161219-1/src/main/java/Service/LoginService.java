package Service;

import org.junit.Test;

import Dao.CustomerDao;

public class LoginService {
	@Test
	public boolean Login(String username){
		CustomerDao dao = new CustomerDao();
		String Name = dao.findCustomerByName(username);
		if(Name!=null&&Name.equals(username)){
			return true;
		}
		else{
			return false;
		}
	}
	
}
