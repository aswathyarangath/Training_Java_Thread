package com.thread;

public class ThreadEven implements Runnable{
	public void run(){
	
		for(int i=0;i<50;i++){
			
			if(i%2==0)
				System.out.println(Thread.currentThread().getName()+"------------"+i+"is even");
			else
				System.out.println(Thread.currentThread().getName()+"------------"+i+"is odd");
		}
	}
	public static void main(String args[]){
		Thread t1=new Thread(new ThreadEven());
	
		Thread t2=new Thread(new ThreadEven());
		//Thread t3=new Thread(new ThreadEven());
		t1.setName("thread-1");
		t2.setName("thread-2");
	//	t3.setName("thread-3");
		t1.start();
		t2.start();
		//t3.start();

}
}



