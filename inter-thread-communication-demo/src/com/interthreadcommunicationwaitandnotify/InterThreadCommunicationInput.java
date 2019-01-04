package com.interthreadcommunicationwaitandnotify;

public class InterThreadCommunicationInput implements Runnable{
	private Resource res ;
	InterThreadCommunicationInput(Resource res){
		this.res = res;
	}
	@Override
	public void run() {
		int x = 0;
		while (true) {
			if (x == 0) {
				res.set("mike", "male");
			} else {
				res.set("丽丽","女女");
			}
			x = (x + 1) % 2;
		}
	}
}


//notifyAll()