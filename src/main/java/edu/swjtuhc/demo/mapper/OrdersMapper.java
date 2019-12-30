package edu.swjtuhc.demo.mapper;

import org.apache.ibatis.annotations.Mapper;

import edu.swjtuhc.demo.model.Orders;
@Mapper
public interface OrdersMapper {
	public int  insertOrders(Orders  orders);//添加订单
	
	public int alterOrders(Orders orders);//修改订单
	
	public int deleteOrders(Orders orders);//删除订单

	
}
