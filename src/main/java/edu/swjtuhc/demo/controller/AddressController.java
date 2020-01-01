package edu.swjtuhc.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.swjtuhc.demo.model.Address;
import edu.swjtuhc.demo.model.Orders;
import edu.swjtuhc.demo.service.AddressService;
import net.sf.json.JSONObject;

@RestController
@RequestMapping("/address")
public class AddressController {
	
	@Autowired
	AddressService AddressService;
	
	@RequestMapping("/insert")
	public JSONObject insert(@RequestBody Address address) {
		JSONObject result= new JSONObject();	//result装返回值

		//调用service层
		int i=AddressService.insert(address);
		result.put("state", i);	
			
		return result;
	}
	
	@RequestMapping("/update")
	public JSONObject update(@RequestBody Address address) {
		JSONObject result= new JSONObject();	//result装返回值

		//调用service层
		int i=AddressService.update(address);
		result.put("state", i);	
			
		return result;
	}
	
	@RequestMapping("/delete")
	
	public JSONObject delete(@RequestBody Address address) {
		JSONObject result= new JSONObject();	//result装返回值

		//调用service层
		int i=AddressService.delete(address);
		result.put("state", i);	
			
		return result;
	}
	
	@RequestMapping("/get_address")
	public List<Address> getList(){
		
		return AddressService.get_address();
	}
}
