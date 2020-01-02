package edu.swjtuhc.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.swjtuhc.demo.model.Admin;
import edu.swjtuhc.demo.model.Opinion;
import edu.swjtuhc.demo.model.User;
import edu.swjtuhc.demo.service.RegisterService;
import net.sf.json.JSONObject;

@RestController
@RequestMapping("/user")

public class RegisterController {
	@Autowired
	RegisterService RegisterService;
	
	@RequestMapping("/register")
	public JSONObject register(@RequestBody User user) {
		JSONObject result= new JSONObject();	//result装返回值
		
		//调用service层
		int i=RegisterService.register(user);
		result.put("state", i);
		
		return result;
	}
	
	@RequestMapping("/login")
	public JSONObject login(@RequestBody User user) {
		JSONObject result= new JSONObject();	//result装返回值
		
		//调用service层
		int i=RegisterService.login(user);
		result.put("state", i);
		
		return result;
	}
	@RequestMapping("/admin_login")
	public JSONObject admin(@RequestBody Admin admin) {
		JSONObject result= new JSONObject();	//result装返回值
		
		//调用service层
		int i=RegisterService.admin(admin);
		result.put("state", i);
		
		return result;
	}
	
	@RequestMapping("/admin_register")
	public JSONObject admin_register(@RequestBody Admin admin) {
		JSONObject result= new JSONObject();	//result装返回值
		
		//调用service层
		int i=RegisterService.admin_register(admin);
		result.put("state", i);
		
		return result;
	}
	@RequestMapping("/opinion")
	public JSONObject opinion(@RequestBody Opinion opinion) {
		JSONObject result= new JSONObject();	//result装返回值
		
		//调用service层
		int i=RegisterService.Opinion(opinion);
		result.put("state", i);
		
		return result;
	}
}
