package com.threadrtest;

public class ThreadTestMain {
	public static void main(String[] args){
		ThreadTest1 t1 = new ThreadTest1("one---");
		ThreadTest1 t2 = new ThreadTest1("two+++");
		t1.start();
		t2.start();
	}
}
