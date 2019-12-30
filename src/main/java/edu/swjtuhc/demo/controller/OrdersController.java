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
	
	
	//添加订单
	@RequestMapping("/insert_orders")
	public JSONObject insert_orders(@RequestBody Orders orders) {
		JSONObject result= new JSONObject();	//result装返回值

		//调用service层
		int i=OrdersService.insert_orders(orders);
		result.put("state", i);	
			
		return result;
	}
	
	
	//修改订单
	@RequestMapping("/alter_orders")
	public  JSONObject alter_orders(@RequestBody Orders orders) {
		JSONObject result= new JSONObject();	//result装返回值

		//调用service层
		int i=OrdersService.alter_orders(orders);

		result.put("state", i);	
			
		return result;
		
	}
	
	
	//删除订单
		@RequestMapping("/delete_orders")
		public  JSONObject delete_orders(@RequestBody Orders orders) {
			JSONObject result= new JSONObject();	//result装返回值

			//调用service层
			int i=OrdersService.delete_orders(orders);
			result.put("state", i);	
				
			return result;
			
		}
}
