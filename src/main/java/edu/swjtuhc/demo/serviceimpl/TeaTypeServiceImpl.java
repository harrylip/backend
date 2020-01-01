package edu.swjtuhc.demo.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.swjtuhc.demo.mapper.TeaTypeMapper;
import edu.swjtuhc.demo.model.Tea;
import edu.swjtuhc.demo.service.TeaTypeService;

@Service
public class TeaTypeServiceImpl implements TeaTypeService{

	@Autowired
	TeaTypeMapper  TeaTypeMapper;

	@Override
	public List<Tea> getList() {
		// TODO Auto-generated method stub
		return TeaTypeMapper.selectTeaType();
	}
	
	
	

}
