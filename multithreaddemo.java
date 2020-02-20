import java.util.*;
class multithreaddemo implements Runnable{
	public void run(){
		System.out.println("thread is running");
	}
	public static void main(String args[]){
		multithreaddemo md=new multithreaddemo();
		Thread t1=new Thread(md);
		t1.start();
	}
}