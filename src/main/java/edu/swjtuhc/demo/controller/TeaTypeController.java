package edu.swjtuhc.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import edu.swjtuhc.demo.model.Tea;
import edu.swjtuhc.demo.model.User;
import edu.swjtuhc.demo.service.TeaTypeService;
import net.sf.json.JSONObject;

@RestController
@RequestMapping("/type")
public class TeaTypeController {
	
	@Autowired
	TeaTypeService TeaTypeService;
	
	@RequestMapping("/getlist")
	public List<Tea> getList(){
		
		return TeaTypeService.getList();
	}
	
	@RequestMapping("/insert_type")
	public JSONObject insert_type(@RequestBody Tea tea) {
		JSONObject result= new JSONObject();	//result装返回值
		
		//调用service层
		int i=TeaTypeService.insert_type(tea);
		result.put("state", i);
		
		return result;
	}
	@RequestMapping("/update_type")
	public JSONObject update_type(@RequestBody Tea tea) {
		JSONObject result= new JSONObject();	//result装返回值
		
		//调用service层
		int i=TeaTypeService.update_type(tea);
		result.put("state", i);
		
		return result;
	}
	@RequestMapping("/delete_type")
	public JSONObject delete_type(@RequestBody Tea tea) {
		JSONObject result= new JSONObject();	//result装返回值
		
		//调用service层
		int i=TeaTypeService.delete_type(tea);
		result.put("state", i);
		
		return result;
	}
	
//	public void deleteUser(Integer tid) {
//        TeaTypeService.deleteById(tid);
//    }
}
