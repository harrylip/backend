package edu.swjtuhc.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.swjtuhc.demo.model.Orders;

import edu.swjtuhc.demo.service.OrdersService;
import net.sf.json.JSONObject;

@RestController
@RequestMapping("/user")

public class OrdersController {
	@Autowired
	OrdersService OrdersService;
	
	@RequestMapping("/orders")
	public JSONObject orders(@RequestBody Orders orders) {
		JSONObject result= new JSONObject();	//result装返回值
		
		//调用service层
		int i=OrdersService.orders(orders);
		result.put("state", i);
			
		return result;
	}
}
