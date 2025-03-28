package com.dateApi.Base64;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Encoders {
	public static void main(String[] args) {
		String pwd="chandu";
		
		// password encoding
		Encoder encoder = Base64.getEncoder();
		byte[] encode=encoder.encode(pwd.getBytes());
		String encodedpwd=new String(encode);
		System.out.println(encodedpwd);
		
		//password decoding
		Decoder decoder=Base64.getDecoder();
		byte[] decode= decoder.decode(encodedpwd);
		String decodedpwd=new String(decode);
		System.out.println(decodedpwd);
	}
	
	
}