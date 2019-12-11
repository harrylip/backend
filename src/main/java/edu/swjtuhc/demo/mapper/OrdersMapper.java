package edu.swjtuhc.demo.mapper;

import org.apache.ibatis.annotations.Mapper;

import edu.swjtuhc.demo.model.Orders;
@Mapper
public interface OrdersMapper {
	public int insertOrders(Orders orders);
	
	
}
