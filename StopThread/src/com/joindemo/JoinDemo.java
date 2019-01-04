package com.joindemo;

public class JoinDemo implements Runnable{
	@Override
	public void run() {
		for(int x = 0; x < 70; x ++){
			System.out.println(Thread.currentThread().toString() + "..." + x);
		}
	}
}
