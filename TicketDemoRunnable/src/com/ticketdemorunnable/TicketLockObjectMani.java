package com.ticketdemorunnable;

public class TicketLockObjectMani {
	public static void main(String[] args){

		TicketLockObject t = new TicketLockObject();

		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);
		t1.start();
		try {
			Thread.sleep(10);
		}catch (InterruptedException e){}
		t.flag = false;
		t2.start();
	}
}
