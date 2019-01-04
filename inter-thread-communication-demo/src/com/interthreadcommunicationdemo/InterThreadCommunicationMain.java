package com.interthreadcommunicationdemo;

public class InterThreadCommunicationMain {
	public static void main(String[] args){
		Resource res = new Resource();

		InterThreadCommunicationInput in = new InterThreadCommunicationInput(res);
		InterThreadCommunicationOutput out = new InterThreadCommunicationOutput(res);

		Thread t1 = new Thread(in);
		Thread t2 = new Thread(out);

		t1.start();
		t2.start();
	}
}
