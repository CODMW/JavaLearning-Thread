package com.deadlockdemo;

public class TicketLockObject implements Runnable {
	private int tick = 1000;
	private Object obj = new Object();
	boolean flag = true;
	public void run(){
		if(flag) {
			while (true) {
				synchronized (obj) {
					show();
				}
			}
		}else {
			while (true){
				show();
			}
		}
	}
	public void show(){   //同步锁是this
		synchronized (obj) {
			if (tick > 0) {
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
				}
				System.out.println(Thread.currentThread().getName() + "run...sale:" + tick--);
			}
		}
	}
}
