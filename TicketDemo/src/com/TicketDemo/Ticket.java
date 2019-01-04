package com.TicketDemo;

public class Ticket extends Thread {
	private static int tick = 100;
	public void run(){
		while(true){
			if(tick > 0) {
				System.out.println(Thread.currentThread().getName() + "sale:" + tick--);
			}
		}
	}
}
