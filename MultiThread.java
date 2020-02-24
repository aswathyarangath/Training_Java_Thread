package com.thread;

public class MultiThread implements Runnable{
	public void run(){
	
		for(int i=0;i<3;i++){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+"------------"+i);
		}
	}
	public static void main(String args[]){
		Thread t1=new Thread(new MultiThread());
	
		Thread t2=new Thread(new MultiThread());
		Thread t3=new Thread(new MultiThread());
		t1.setName("thread-1");
		t2.setName("thread-2");
		t3.setName("thread-3");
		t1.start();
		t2.start();
		t3.start();

}
}
