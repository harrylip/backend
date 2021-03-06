//接口实现类


package edu.swjtuhc.demo.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.swjtuhc.demo.mapper.RegisterMapper;
import edu.swjtuhc.demo.model.Admin;
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
			i=1;RegisterMapper.insertUser(user);
			//注册成功
		}else {
			i=2;
			//用户名已存在
		}
		
		return i;   
	}

	@Override
	public int login(User user) {
		// TODO Auto-generated method stub
		User u2=RegisterMapper.selectUserByUserAndPass(user.getUsername(),user.getPassword());
//		user.setUID(u2.getUID());
		
		int i=0;
		if (u2==null) {
			i=1;//登录失败
		}else {
			i=2;//登录成功
		}
		return i;
	}

	@Override
	public int admin(Admin admin) {
		// TODO Auto-generated method stub
		Admin a0=RegisterMapper.selectAdminByNameAndPass(admin.getAdmin_name(), admin.getAdmin_password());
//		admin.setAdmin_ID(a0.getAdmin_ID());
		
		int i=0;
		if (a0==null) {
			i=1;//登录失败
		}else {
			i=2;//登录成功
		}
		return i;
	}

	@Override
	public int Opinion(edu.swjtuhc.demo.model.Opinion opinion) {
		// TODO Auto-generated method stub
		int i=-1;
		i=RegisterMapper.opinion(opinion);
		
		return i;
	}
	
	@Override
	public int admin_register(Admin admin) {
		// TODO Auto-generated method stub
		Admin a1=RegisterMapper.selectAdminByname(admin.getAdmin_name());
		
		int i=-1;
		if (a1==null) {
			i=1;RegisterMapper.insertAdmin(admin);
			//添加成功
		}else {
			i=2;
			//管理员已存在
		}
		
		return i;
	}
	
}
