package edu.swjtuhc.demo.service;

import java.util.List;

import edu.swjtuhc.demo.model.Orders;

public interface OrdersService {
	public int insert_orders(Orders orders);//添加订单
	public int alter_orders(Orders orders);//修改订单
	public int delete_orders(Orders orders);//删除订单
	
	public List<Orders> get_orders();
}
