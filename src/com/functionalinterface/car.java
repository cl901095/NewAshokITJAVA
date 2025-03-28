package com.functionalinterface;

public interface car {
	
	public void start();
	
	public default void clean()/// functional interface
	{
		System.out.println("cleaning completed");
	}
	
	public static void horn() {
		System.out.println("horn is boom");
	}

}
