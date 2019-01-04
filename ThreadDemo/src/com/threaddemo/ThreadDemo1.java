package com.threaddemo;

public class ThreadDemo1 extends Thread {
	private int timeOfRun = 0;
	public void run(){
		for(int i = 0; i < 100; i ++) {
			System.out.println("线程1运行了" + ( ++timeOfRun) + "次！");
		}
	}
}
