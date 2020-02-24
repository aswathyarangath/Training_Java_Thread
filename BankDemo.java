package com.thread;

// -----------------------------------Transaction class-----------------------------
class Customer{
	int amt=0;
	int flag=0;
	// -------------------------------Withdrawal Method-----------------------------
	
	public synchronized int withdraw(int amt) throws InterruptedException{
		System.out.println(Thread.currentThread().getName()+" is going to withdraw.");
		if(flag==0){
			System.out.println("Insufficient balance");
			wait();
		}
		
			this.amt-=amt;
			System.out.println("Withdrawal amount is  :"+amt);
			return amt;
			
		
	}
	// ------------------------------Deposit Method-----------------------------------
	
	public synchronized int deposit(int amt){
		System.out.println(Thread.currentThread().getName()+" is going to deposit.");
		this.amt+=amt;
		System.out.println("Deposited amount is : "+amt);
		notifyAll();
		flag=1;
		return amt;
	}
}
//----------------------------------Main Method-----------------------------------------
public class BankDemo {
	public static void main(String args[]){
		Customer c=new Customer();
		Thread t1=new Thread(){
			public void run(){
			
					try {
						c.withdraw(5000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				
				System.out.println("Withdrawal completed."+"Balance is : "+c.amt);
			}
		};
		Thread t2=new Thread(){
			public void run(){
				c.deposit(9000);
				c.deposit(15000);
				System.out.println("Deposit completed."+"Balance is : "+c.amt);
			}
		};
		t1.setName("Rahul");
		t2.setName("Manu");
		t1.start();
		t2.start();
	}

}
