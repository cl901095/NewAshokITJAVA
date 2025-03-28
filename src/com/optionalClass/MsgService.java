package com.optionalClass;

import java.util.Optional;
import java.util.Scanner;

public class MsgService {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Enter USER ID");
		int userId = s.nextInt();

		User u = new User();
//		String UserName = u.getUserName(userId);
//
//		String msg = UserName.toUpperCase() + ", hello";
//		System.out.println(msg);
		
		Optional<String> user=u.getUser(userId);
		if(user.isPresent()) {
			String name= user.get();
			System.out.println(name.toUpperCase()+", hello");
		}else {
			System.out.println("no Data found");
		}
	}

}
