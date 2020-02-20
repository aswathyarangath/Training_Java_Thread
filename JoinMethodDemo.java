class JoinMethodDemo extends Thread{
	public void run(){	
		System.out.println(Thread.currentThread().getName());
	}

	public static void main(String args[]){
		JoinMethodDemo t1=new JoinMethodDemo();
		JoinMethodDemo t2=new JoinMethodDemo();
		t1.start();
		t2.start();
}}