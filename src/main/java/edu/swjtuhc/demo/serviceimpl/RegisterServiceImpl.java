//接口实现类


package edu.swjtuhc.demo.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.swjtuhc.demo.mapper.RegisterMapper;
import edu.swjtuhc.demo.model.User;
import edu.swjtuhc.demo.service.RegisterService;

@Service
public class RegisterServiceImpl implements RegisterService{

	@Autowired
	RegisterMapper RegisterMapper;
	
	@Override
	public int register(User user) {
		// TODO Auto-generated method stub
		//调用mapper实现注册
		User u1=RegisterMapper.selectUserByUsername(user.getUsername());
		int i=-1;
		if (u1==null) {
			i=RegisterMapper.insertUser(user);
			//注册成功
		}else {
			i=2;
			//用户名已存在
		}
		
		return i;   
	}
	
}