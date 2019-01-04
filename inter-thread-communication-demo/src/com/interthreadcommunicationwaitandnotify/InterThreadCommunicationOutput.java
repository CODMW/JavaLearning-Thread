package com.interthreadcommunicationwaitandnotify;

public class InterThreadCommunicationOutput implements Runnable {
	private Resource res ;
	InterThreadCommunicationOutput(Resource res){
		this.res = res;
	}
	@Override
	public void run() {
		while(true){
			res.out();
		}
	}
}
