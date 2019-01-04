package com.deadlockdemo;

public class DeadLockTest implements Runnable{
	private boolean flag;
	DeadLockTest(boolean flag){
		this.flag =flag;
	}
	public void run(){
		if(flag){
			synchronized (MyLock.lockA){
				System.out.println("if lockA" + MyLock.lockA.toString());
				synchronized (MyLock.lockB){
					System.out.println("if lockB" + MyLock.lockB.toString());
				}
			}
		}else {
			synchronized (MyLock.lockB){
				System.out.println("else lockB" + MyLock.lockB.toString());
				synchronized (MyLock.lockA){
					System.out.println("else lockA" + MyLock.lockA.toString());
				}
			}
		}
	}
}
