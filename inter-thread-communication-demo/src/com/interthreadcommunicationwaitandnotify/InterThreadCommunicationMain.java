package com.interthreadcommunicationwaitandnotify;

public class InterThreadCommunicationMain {
	public static void main(String[] args){
		Resource res = new Resource();

		new Thread(new InterThreadCommunicationInput(res)).start();
		new Thread(new InterThreadCommunicationOutput(res)).start();
		/*InterThreadCommunicationInput in = new InterThreadCommunicationInput(res);
		InterThreadCommunicationOutput out = new InterThreadCommunicationOutput(res);

		Thread t1 = new Thread(in);
		Thread t2 = new Thread(out);

		t1.start();
		t2.start();*/
	}
}
