/*
 * Write a java program to illustrate synchronized method in multithreading
  by Divya
 */
package studentManagement;

//importing required package
import java.util.Scanner;
//creating a class called synchronizedThread
public class synchronizedThread {
	//main method
	public static void main(String args[]) {
		//creating Scanner object to take user input
		Scanner obj = new Scanner(System.in);
		//creating object of counter class(Class 2)
	    final counter c = new counter();
	    System.out.println("\n\t\t\t----------Synchronized Multithreading------------");
	    System.out.println("\nEnter No of Cycles : ");
		final int cycle = obj.nextInt();
		//anonymous thread
		Thread t1 = new Thread()
		{
			public void run()
			{
				// calling counter method 
				c.counter(cycle);
			}
		};
		//anonymous thread
		Thread t2 = new Thread() { 
			public void run(){
				// calling counter method 
				c.counter(cycle);
			}
		};
		//thread starting
		t1.start();
		t2.start();
		//closing scanner object
		obj.close();
	}
	
}
//creating class named as counter 
class counter{

	//synchronized method 
	synchronized public void counter(int n) {
			//executing thread n no of times
			for(int i=0;i<=n;i++) {
				int count = 1;
				count += i;  
				//printing 
				System.out.println(Thread.currentThread().getName()+" Count is  "+ count);
				
		}
	}
}
