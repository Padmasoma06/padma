package com.perftool.perftool;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

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
		
		//check if user is valid by making sure entered user name is correct or wrong.
		
		return "";
		
	}
		
	

	@RequestMapping("/forgotPassword")
	public String forgotPassword() {
		return "email has been sent to reset your password---";
	}

	

	
	@RequestMapping("/departments")
	public List departments() {
		List aList = new ArrayList();
		DepartmentTO deptTO = null;
		try {
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe", "system", "XXXXXXXXX");
			Statement smt = con.createStatement();
			String s = "select deptno,dname  from dept";
			ResultSet r = smt.executeQuery(s);
			while (r.next()) {
				deptTO = new DepartmentTO();
 				deptTO.setDeptNo(Integer.parseInt(r.getString("deptno")));
 				deptTO.setDeptName(r.getString("dname"));
 				aList.add(deptTO);
 			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return aList;
		
	   
	}
	
		
	@RequestMapping("/save")
	public String save() {
		return "saved the data entered in the corresponding fields";
	}
	
	
	public static void main(String[] args) {
		try {
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe", "system", "padma2280");
			Statement smt = con.createStatement();
			String s = "select deptno,dname  from dept";
			ResultSet r = smt.executeQuery(s);
			while (r.next()) {
				String dno = r.getString("deptno");
				String dname = r.getString("dname");
				System.out.print(dno);
				System.out.println(dname);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
