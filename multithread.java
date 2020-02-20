import java.util.*;
class multithread extends Thread{
	public void run(){
		System.out.println("thread is running.");
	}
	public static void main(String args[]){
		multithread t1=new multithread();
		t1.start();
	}
}