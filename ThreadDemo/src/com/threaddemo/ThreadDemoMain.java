package com.threaddemo;

public class ThreadDemoMain {
	public static void main(String argu[]){
		ThreadDemo1 th1 = new ThreadDemo1();
		ThreadDemo2 th2 = new ThreadDemo2();
		th1.start();
		th2.start();
		for(int i = 0; i < 200; i++){
			System.out.println("主线程运行了" + i + "次");
		}
	}
}
