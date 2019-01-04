package com.singletondemo;
//懒汉式
public class Singleton {
	private static Singleton s = null;
	private Singleton(){}
	public static synchronized Singleton getInstance(){ //懒汉式在多线程访问会new多个，故线程同步
		if(s == null){
			s = new Singleton();
		}
		return s;
	}
}
//懒汉式----实例的延时加载
//public class Singleton {
//	private static Singleton s = null;
//	private Singleton(){}
//	public static  Singleton getInstance() { //懒汉式在多线程访问会new多个，故线程同步
//		if (s == null) {                            //双重判断减少同步语句执行次数，提高效率
//			synchronized (Singleton.class) {
//				if (s == null) {
//					s = new Singleton();
//				}
//				return s;
//			}
//		}
//	}
//}

//饿汉式---不会有线程同步问题
//class SingletonDemoE {
//	private static final SingletonDemoE se = new SingletonDemoE();
//	private SingletonDemoE(){}
//	public static SingletonDemoE getInstance(){
//		return se;
//	}
//}