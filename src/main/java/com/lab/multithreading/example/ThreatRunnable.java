package com.lab.multithreading.example;

public class ThreatRunnable {
	
	
	public static void main(String[] args) {
		
		Thread thread = new Thread(new Runnable() {
			
			@Override
			public void run() {

				System.out.println("We are now in thread "+ Thread.currentThread().getName());
				
				System.out.println("Current pŕiority "+ Thread.currentThread().getPriority());
				
				
			}
		});
		
		thread.setName("New worker Thread");
		thread.setPriority(Thread.MAX_PRIORITY);
		
		System.out.println("We are in thread"+ Thread.currentThread().getName()+" Before statring a new thread");
		
		thread.start();
		
		System.out.println("We are in thread"+ Thread.currentThread().getName()+" Before statring a new thread");
		
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}
	

}
