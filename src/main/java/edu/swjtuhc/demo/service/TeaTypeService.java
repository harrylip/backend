package edu.swjtuhc.demo.service;

import java.util.List;

import edu.swjtuhc.demo.model.Tea;

public interface TeaTypeService {
	
	public List<Tea> getList();

	public int insert_type(Tea tea);

	public int update_type(Tea tea);

	public int detele_type(Tea tea);
}
