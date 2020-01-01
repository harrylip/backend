package edu.swjtuhc.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import edu.swjtuhc.demo.model.Tea;
import edu.swjtuhc.demo.service.TeaTypeService;

@RestController
@RequestMapping("/type")
public class TeaTypeController {
	
	@Autowired
	TeaTypeService TeaTypeService;
	
	@RequestMapping("/getlist")
	public List<Tea> getList(){
		
		return TeaTypeService.getList();
	}
}
