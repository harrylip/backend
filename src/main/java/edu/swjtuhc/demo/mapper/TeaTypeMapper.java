package edu.swjtuhc.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import edu.swjtuhc.demo.model.Tea;
@Mapper
public interface TeaTypeMapper {
	
	public List<Tea> selectTeaType();

	public void insert_type(Tea tea);

	public Tea selectUserByName(String name);

	public int update_type(Tea tea);

	public int delete_type(Tea tea);

//	
//	Tea deleteById(Integer tid);
}
