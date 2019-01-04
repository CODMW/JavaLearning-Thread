package com.interthreadcommunicationdemo;

public class InterThreadCommunicationOutput implements Runnable {
	private Resource res ;
	InterThreadCommunicationOutput(Resource res){
		this.res = res;
	}
	@Override
	public void run() {
		while(true){
			synchronized (InterThreadCommunicationInput.class) {
				System.out.println(res.name + "..." + res.sex);
			}
		}
	}
}
