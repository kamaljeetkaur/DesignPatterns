package com.test.creational.singleton;

class UseResources implements Runnable{
	SingleResource singleResource;
	
	public UseResources(SingleResource singleResource1) {
		singleResource = singleResource1;
	}
	
	public void run() {
		System.out.println("thread name" + Thread.currentThread().getName());
		singleResource.print();
	}
	
	
}

public class TestSingleton {
	
	public static void main(String[] args) {
		SingleResource instance = SingleResource.getInstance();
		UseResources resource = new UseResources(instance);
		
		Thread thread1 = new Thread(resource);
		Thread thread2 = new Thread(resource);
		
		thread1.start();
		thread2.start();
		
		//instance.print();
	}

}
