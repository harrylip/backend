package edu.swjtuhc.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import edu.swjtuhc.demo.model.Tea;
@Mapper
public interface TeaTypeMapper {
	
	public List<Tea> selectTeaType();
	
}
