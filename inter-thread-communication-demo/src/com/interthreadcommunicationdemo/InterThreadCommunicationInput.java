package com.interthreadcommunicationdemo;

public class InterThreadCommunicationInput implements Runnable{
	private  Resource res ;
	InterThreadCommunicationInput(Resource res){
		this.res = res;
	}
	@Override
	public void run() {
		int x = 0;
		while (true) {
			synchronized (InterThreadCommunicationInput.class) {
				if (x == 0) {
					res.name = "mike";
					res.sex = "male";
				} else {
					res.name = "丽丽";
					res.sex = "女";
				}
				x = (x + 1) % 2;
			}
		}
	}
}
