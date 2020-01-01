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

	@Override
	public int insert_type(Tea tea) {
		// TODO Auto-generated method stub
		Tea t1=TeaTypeMapper.selectUserByName(tea.getName());
		
		int i=-1;
		if (t1==null) {
			i=1;TeaTypeMapper.insert_type(tea);
			//插入成功
		}else {
			i=2;
			//商品已存在
		}
		
		return i;  
		
	}

	@Override
	public int update_type(Tea tea) {
		// TODO Auto-generated method stub
		int i=-1;
		i=TeaTypeMapper.update_type(tea);
		
		return i;
	}

	@Override
	public int delete_type(Tea tea) {
		// TODO Auto-generated method stub
		int i=-1;
		i=TeaTypeMapper.delete_type(tea);
		
		return i;
	}
	
	
	

}
