package edu.swjtuhc.demo.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import edu.swjtuhc.demo.mapper.OrdersMapper;
import edu.swjtuhc.demo.model.Orders;
import edu.swjtuhc.demo.model.User;
import edu.swjtuhc.demo.service.OrdersService;
@Service
public class OrdersServiceImpl implements OrdersService{
	@Autowired
	OrdersMapper OrdersMapper;
	
	@Override
	public int insert_orders(Orders orders) {
		// TODO Auto-generated method stub
		//调用mapper实现
		int i= -1;
		i=OrdersMapper.insertOrders(orders);
		return i;

	}

	@Override
	public int alter_orders(Orders orders) {
		// TODO Auto-generated method stub
		int i=-1;
		i=OrdersMapper.alterOrders(orders);
		
		return i;
		
	}

	@Override
	public int delete_orders(Orders orders) {
		// TODO Auto-generated method stub
		
		int i=OrdersMapper.deleteOrders(orders);
		String message="";
		if(i>0) {
			message="删除成功";
		}else {
			message="删除失败";
		}
		return i;
	}
	
	
	
}
