package producerandconsumerdemopro;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Resource {
	private String name;
	private int count = 1;
	private boolean flag = false;
	private Lock lock = new ReentrantLock();
	private Condition condition_pro = lock.newCondition();
	private Condition condition_con = lock.newCondition();
	public void set(String name) throws InterruptedException{
		lock.lock();
		try {
			while (flag) {
				condition_pro.await();
			}
			this.name = name + "--" + count++;
			System.out.println(Thread.currentThread().getName() + "...生产者：" + this.name);
			flag = true;
			condition_con.signal();
		}finally {
			lock.unlock();
		}
	}
	public void out() throws InterruptedException{
		lock.lock();
		try {
			while (!flag) {
				condition_con.await();
			}
			System.out.println(Thread.currentThread().getName() + "...消费者...：" + this.name);
			flag = false;
			condition_pro.signalAll();
		}finally {
			lock.unlock();
		}
	}
}
