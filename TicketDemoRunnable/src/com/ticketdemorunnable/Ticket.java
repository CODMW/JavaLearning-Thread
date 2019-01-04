package com.ticketdemorunnable;

public class Ticket implements Runnable {
	private int tick = 100;
	Object obj = new Object();
	public void run(){
		while(true){
			synchronized (obj) {
				if(tick > 0) {
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) { }
					System.out.println(Thread.currentThread().getName() + "sale:" + tick--);
				}
			}
		}
	}
}
