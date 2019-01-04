package com.threadrtest;

public class ThreadTest1 extends Thread{
	//private String name;
	ThreadTest1(String name){
		super(name);
	}
	public void run(){
		for(int x = 0; x < 60; x ++){
			System.out.println(Thread.currentThread().getName() + "run..." + x);
		}
	}
}
