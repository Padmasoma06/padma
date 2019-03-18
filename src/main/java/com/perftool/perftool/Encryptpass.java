package com.perftool.perftool;

import org.apache.tomcat.util.codec.binary.Base64;

public class Encryptpass {

	public static void main(String[] args) {
		String password="XXXXXX";
		String encrypted=new String(Base64.encodeBase64(password.getBytes()));
		System.out.println("encrypted code is  "+encrypted);
		String decrypted =new String(Base64.decodeBase64(encrypted));
		System.out.println("derypted code is  "+decrypted);
	}

}
