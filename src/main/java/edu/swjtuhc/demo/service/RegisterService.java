//接口类


package edu.swjtuhc.demo.service;

import edu.swjtuhc.demo.model.Admin;
import edu.swjtuhc.demo.model.Opinion;
import edu.swjtuhc.demo.model.User;

public interface RegisterService {
	public int  register(User user);
	
	public int login(User user) ;

	public int admin(Admin admin);

	public int admin_register(Admin admin);
	
	public int Opinion(Opinion opinion);

}
