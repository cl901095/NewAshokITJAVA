package com.functionalinterface;

public class Demo implements car {
	
	@Override
	public void start() {
		System.out.println("car started");
		
	}
	
	@Override
	public 	void clean() {
		System.out.println("claeaning done again");
	}
	
	
	
	public static void main(String[] args) {
		
		Demo d=new Demo();
		d.start();
		d.clean();
		car.horn();
	}

	
	
	

}
