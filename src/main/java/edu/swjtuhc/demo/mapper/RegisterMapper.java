//
package edu.swjtuhc.demo.mapper;

import org.apache.ibatis.annotations.Mapper;

import edu.swjtuhc.demo.model.User;

@Mapper
public interface RegisterMapper {
	public User selectUserByUsername(String username);
	
	public int insertUser(User user);
}
