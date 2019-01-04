package com.producerandconsumerdemo;

public class Producer implements Runnable {
	private Resource res;
	Producer(Resource res){
		this.res = res;
	}
	public void run(){
		while(true){
			res.set("商品");
		}
	}
}
