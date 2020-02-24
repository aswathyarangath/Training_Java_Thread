package com.thread;

public class ThreadEx extends Thread{
	public void run(){
		
		System.out.println(Thread.currentThread().getName());
		for(int i=0;i<6;i++){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println(i);
		}
		
	
	}
public static void main(String args[]) throws InterruptedException{
	ThreadEx t1=new ThreadEx();
	t1.setName("t1 thread");
	t1.start();
	t1.join();
	ThreadEx t2=new ThreadEx();
	t2.setName("t2 thread");
	t2.start();
	//t.run();
}
}
