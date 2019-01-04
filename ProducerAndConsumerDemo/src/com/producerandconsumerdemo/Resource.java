package com.producerandconsumerdemo;

public class Resource {
	private String name;
	private int count = 1;
	private boolean flag = false;
	public synchronized void set(String name) {
		while (flag) {
			try {
				this.wait();
			} catch (InterruptedException e) {
			}
		}
		this.name = name + "--" + count++;
		System.out.println(Thread.currentThread().getName() + "...生产者：" + this.name);
		flag = true;
		this.notifyAll();
	}
	public synchronized void out(){
		while(!flag){
			try {
				this.wait();
			}catch (InterruptedException e){
			}
		}
		System.out.println(Thread.currentThread().getName() + "...消费者...：" + this.name);
		flag = false;
		this.notifyAll();
	}
}
