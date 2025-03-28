package com.lambda;

// Approach 2
public class ThreadDemo2 {

	public static void main(String[] args) {

		// Anonymous Implementation in java
		Runnable r = new Runnable() {

			@Override
			public void run() {
				for (int i = 1; i <= 5; i++) {
					System.out.println(i);
				}

			}
		};

		Thread t = new Thread(r);
		t.start();
	}

}
