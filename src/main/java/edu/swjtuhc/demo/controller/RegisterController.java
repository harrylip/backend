package edu.swjtuhc.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}