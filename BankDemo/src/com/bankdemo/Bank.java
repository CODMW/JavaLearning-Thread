package com.bankdemo;

public class Bank {
	private  int sum;
	//Object obj = new Object();
	public synchronized void add(int n) {
		//synchronized (obj) {   改为同步函数
			sum += n;
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
			}
			System.out.println("sum" + sum);
		//}
	}
}
