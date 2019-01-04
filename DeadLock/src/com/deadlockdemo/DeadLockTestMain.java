package com.deadlockdemo;

public class DeadLockTestMain {
	public static void main(String[] args) {
		Thread t1 = new Thread(new DeadLockTest(true));
		Thread t2 = new Thread(new DeadLockTest(false));
		t1.start();
		try{
			Thread.sleep(10);
		}catch (InterruptedException e){}
		t2.start();
	}
}
