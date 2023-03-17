package com.lab.multithreading.example.secure;

public abstract class HackerThread extends Thread {

	protected Vault vault;

	public HackerThread(Vault vault) {

		this.vault = vault;
		this.setName(this.getClass().getSimpleName());
		this.setPriority(Thread.MAX_PRIORITY);
	}

	@Override
	public synchronized void start() {
		System.out.println("Starting Thread " + this.getName());
		super.start();
	}

}
