package com.infosys.jdbcStarter.SpringJDBC.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


@Repository
public class EmpService {
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	public List<Integer> getAllEmp() {
		// TODO Auto-generated method stub
		List<Integer> allUser=new ArrayList<Integer>();
		allUser.addAll(jdbcTemplate.queryForList("SELECT id FROM employee.emp_data", Integer.class));
		return allUser;
	}

	public List<String> getAllEmpMail() {
		// TODO Auto-generated method stub
		List<String> allUserEmail=new ArrayList<String>();
		allUserEmail.addAll(jdbcTemplate.queryForList("SELECT email FROM employee.emp_data", String.class));
		return allUserEmail;
	}

}
