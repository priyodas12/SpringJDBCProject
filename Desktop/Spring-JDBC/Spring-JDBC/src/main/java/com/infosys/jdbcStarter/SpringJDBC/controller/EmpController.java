package com.infosys.jdbcStarter.SpringJDBC.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infosys.jdbcStarter.SpringJDBC.service.EmpService;

@RestController
@RequestMapping("/emp")
public class EmpController {
	
	@Autowired
	private EmpService empService;
	
    //get general info
	@GetMapping("/allInfo")
	public String getInfo() {
		return "Generalized Emp Info";
	}
	//get All empID
	@GetMapping("/allEmpId")
	public List<Integer> getAllEmpId(){
		
		return empService.getAllEmp();
		
	}
	//get All empID
	@GetMapping("/allEmpMail")
	public List<String> getAllEmMail(){
			
	return empService.getAllEmpMail();
			
	}

}
