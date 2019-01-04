package com.stopthreaddemo;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

/*stop方法已经过时。

如何停止线程？
只有一种，让run方法结束。
开启多线程运行，运行代码通常是循环结构。

只要控制住循环，就可以让run方法结束，也就是线程结束。

特殊情况：当线程处于冻结状态，就不会读取到标记，那么线程间就不会结束。

当没有指定的方式让冻结的线程恢复到运行状态时，需要对冻结状态进行清除，
强制让线程恢复到运行状态中来，这样就可以操作标记让线程结束。

Thread类中提供了该方法 interruppt
* */
public class StopThread implements Runnable {
	private boolean flag = true;
	@Override
	public synchronized void run() {
		while(flag){
			try {
				wait();
			}catch (InterruptedException e){
				System.out.println(Thread.currentThread().getName() + "...Exception");
				flag = false;
			}
			System.out.println(Thread.currentThread().getName() + "...run");
		}
	}
	public void changeFlag(){
		flag = false;
	}
}
