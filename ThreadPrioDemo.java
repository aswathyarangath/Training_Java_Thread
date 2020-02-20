class ThreadPrioDemo extends Thread{
	public void run(){	
		System.out.println("Running thread name is:"+Thread.currentThread().getName());
		System.out.println("Running threadpriority is:"+Thread.currentThread().getPriority());
	}
	public static void main(String args[]){
		ThreadPrioDemo t1=new ThreadPrioDemo();
		ThreadPrioDemo t2=new ThreadPrioDemo();
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		t1.start();
		t2.start();
	}
}