package com.perftool.perftool;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController("/sample")
public class HelloController {

	@RequestMapping("/welcome")
	public String welcome() {
		return "Welcome to my App----";
	}

	@RequestMapping("/signIn")
	public String signIn(@RequestParam("username") String username, @RequestParam("password") String password)
			{
		
		    DAO b=new DAO();
			HashMap<DAO, String> b1=new HashMap<DAO, String>();
			b1.put(b, "username");
			b1.put(b, "password");
			return "b1";
		
		}
		
	

	@RequestMapping("/forgotPassword")
	public String forgotPassword() {
		return "email has been sent to reset your password---";
	}

	@RequestMapping("/aboutUs")
	public String aboutUs() {
		return "We proviide an efficient and effective Performance Analysis tool";
	}

	
	@RequestMapping("/departments")
	public HashMap<Integer, String> departments() {
		HashMap<Integer, String> s=new HashMap<Integer, String>();
		s.put(1, "firstname");
		s.put(2, "lastname");
		s.put(3, "Achievements");
		s.put(4, "contribution");
		s.put(5, "performance report");
		return s;
		
	   
	}
	
		
	@RequestMapping("/save")
	public String save() {
		return "saved the data entered in the corresponding fields";
	}
}