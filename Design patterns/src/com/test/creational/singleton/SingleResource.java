package com.test.creational.singleton;

public class SingleResource {
	
	private static SingleResource instance = new SingleResource();
 	
	private SingleResource() {
		
	}
	
	public static SingleResource getInstance() {
		return instance;
	}
	
	public void print() {
		for(int i=0;i<10;i++) {
			System.out.println("Printing");
		}
		
	}

}
