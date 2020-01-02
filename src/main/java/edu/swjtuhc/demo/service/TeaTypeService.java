package edu.swjtuhc.demo.service;

import java.util.List;

import edu.swjtuhc.demo.model.Tea;

public interface TeaTypeService {
	
	public List<Tea> getList();

	public int insert_type(Tea tea);

	public int update_type(Tea tea);

	public int delete_type(Tea tea);
	
	
//	 void deleteById(Integer id);
}
