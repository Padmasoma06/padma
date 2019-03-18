package com.perftool.perftool;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DB {
public void db() throws SQLException {
	String username;
	String password;
	Encryptpass encryptpass=new Encryptpass();
	encryptpass.getClass();
Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe", "system", "cGFkbWEyMjgw");
Statement smt = con.createStatement();
String s = "select username, password from padma11";
ResultSet r = smt.executeQuery(s);
while (r.next()) {
	 username=r.getString("username");
	 password=r.getString("password");
	System.out.println(username);
	System.out.println(password);
}

con.close();
   }
}





