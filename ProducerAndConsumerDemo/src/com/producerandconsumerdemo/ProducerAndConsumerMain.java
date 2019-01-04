package com.producerandconsumerdemo;

public class ProducerAndConsumerMain {
	public static void main(String[] args){
		Resource res = new Resource();
		Producer pro = new Producer(res);
		Consumer con = new Consumer(res);

		Thread t1 = new Thread(pro);
		Thread t2 = new Thread(pro);
		Thread t3 = new Thread(con);
		Thread t4 = new Thread(con);

		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}
