package com.dateApi.Base64;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class Encription {
	public static void main(String[] args) throws NoSuchAlgorithmException {
		
		String pwd="chandu";
		MessageDigest md= MessageDigest.getInstance("SHA-256");
		byte[] digest=md.digest(pwd.getBytes());
		String str=new String(digest);
		System.out.println(str);
		
		Encoder encoder=Base64.getEncoder();
		byte[] encode=encoder.encode(digest);
		System.out.println("Encrypted+ encoded = "+new String(encode));
		//decoding
		Decoder decoder=Base64.getDecoder();
		byte[] decode= decoder.decode(encode);
		String decodedpwd=new String(decode);
		System.out.println(decodedpwd);
	}

}
