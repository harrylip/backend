//
package edu.swjtuhc.demo.mapper;

import org.apache.ibatis.annotations.Mapper;

import edu.swjtuhc.demo.model.Admin;
import edu.swjtuhc.demo.model.Opinion;
import edu.swjtuhc.demo.model.User;

@Mapper
public interface RegisterMapper {
	
	public User selectUserByUsername(String username);
	
	public int insertUser(User user);
	
	public User selectUserByUserAndPass(String username,String password);
	
	public Admin selectAdminByNameAndPass(String admin_name,String admin_password);

	
	public int insertAdmin(Admin admin);

	public Admin selectAdminByname(String admin_name);

	public int opinion(Opinion opinion);

}
