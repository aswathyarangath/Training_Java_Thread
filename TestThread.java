package com.thread;

public class TestThread implements Runnable {
	public void run(){
		System.out.println("In run method");
	}
public static void main(String args[]){
	TestThread t=new TestThread();
	Thread tt=new Thread(t);
	//Thread tt=new Thread(new TestThread());
	tt.start();
}
}
