package com.lab.multithreading.example;

import java.util.List;

public class MultiExecutor {

	List<Runnable> tasks;

	// Add any necessary member variables here

	/*
	 * @param tasks to executed concurrently
	 */
	public MultiExecutor(List<Runnable> tasks) {
		// Complete your code here
		this.tasks = tasks;
	}

	/**
	     * Starts and executes all the tasks concurrently
	     */
	    public void executeAll() {
	        // complete your code here
	        
	        for(Runnable task: tasks){
	        	Thread thread= new Thread(task);
	        	thread.start();
	        }
	    }

}
