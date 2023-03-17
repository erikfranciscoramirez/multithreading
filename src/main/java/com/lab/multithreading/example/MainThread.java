package com.lab.multithreading.example;

public class MainThread extends Thread {

	public static void main(String[] args) {

		Thread thread = new MainThread();
		
		thread.start();
	}

	@Override
	public void run() {
		System.out.println("Hello from the  thread " + this.getName());
	}

}
