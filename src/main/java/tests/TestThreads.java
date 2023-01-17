package tests;

import runnable.AppThread;

public class TestThreads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AppThread thread1=new AppThread();// when the instance of thread is initiated status is New
		AppThread thread2=new AppThread();
		AppThread thread3=new AppThread();
		thread1.start();//runnable
		thread2.start();
		thread3.start();
//		execute-- RUnning
//		job completed --terminated/dead
//		Block/Waiting
		
//		thread1.

	}

}
