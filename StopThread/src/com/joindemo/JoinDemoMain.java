package com.joindemo;

public class JoinDemoMain {
	public static void main(String[] args) throws InterruptedException{
		JoinDemo jd = new JoinDemo();
		Thread t1 = new Thread(jd);
		Thread t2 = new Thread(jd);
		t1.start();
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.start();
		t1.join();//抢夺主线执行权

		for(int i = 0; i < 80; i ++){
			System.out.println("main...." + i);
		}
		System.out.println("over");
	}
}
/*join
当A线程执行到了B线程的jion方法时，A线程就会等待，等B线程都执行完，A才会执行
join可以用来临时加入线程执行
* */