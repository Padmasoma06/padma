package com.perftool.perftool;

public class DAO {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[]args) {
		DB d=new DB();
		
		String password=" password";
		String  username ="username";
		if(d.equals(username)){
			
				System.out.println("username "+ username);
				}
			else if(d.equals(password)) {
				System.out.println("password "+ password);
			}else {
				System.out.println("Invalid username and password");
			}
	
	}
}
