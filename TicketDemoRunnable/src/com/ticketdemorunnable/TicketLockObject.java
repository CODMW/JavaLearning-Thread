package com.ticketdemorunnable;

/*
同步函数用的是哪一个锁：
函数需要被对象调用，那么函数都有一个所属对象的引用，就是this
所以同步函数使用的锁是this

通过该程序进行验证

使用两个线程来卖票
一个线程在同步代码块，一个线程在同步函数
都在执行卖票动作
* */
public class TicketLockObject implements Runnable {
	private int tick = 100;
	private Object obj = new Object();
	boolean flag = true;
	public void run(){
		if(flag) {
			while (true) {
				synchronized (this) {
					if (tick > 0) {
						try {
							Thread.sleep(10);
						} catch (InterruptedException e) {
						}
						System.out.println(Thread.currentThread().getName() + "run...sale:" + tick--);
					}
				}
			}
		}else {
			while (true){
				show();
			}
		}
	}
	public synchronized void show(){   //同步锁是this
		if(tick > 0) {
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) { }
			System.out.println(Thread.currentThread().getName() + "show...sale:" + tick--);
		}
	}
}

