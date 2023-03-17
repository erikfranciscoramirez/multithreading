package com.lab.multithreading.example.secure;

public class DescendingHackerThread extends HackerThread {

	public static final int MAX_PASSWORD = 9999;

	public DescendingHackerThread(Vault vault) {
		super(vault);

	}

	@Override
	public void run() {
		for (int guess = 0; guess < MAX_PASSWORD; guess++) {
			if (vault.isCorrectPassword(guess)) {
				System.out.println(this.getName() + " guessed the passwprd " + guess);
				System.exit(0);
			}
		}

	}

}
