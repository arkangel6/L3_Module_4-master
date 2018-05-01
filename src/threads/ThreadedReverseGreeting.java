
package threads;

import java.util.ArrayList;

public class ThreadedReverseGreeting {
  static //Write a program that creates a thread (Thread 1) that creates another thread (Thread 2); 
  //Thread 2 creates Thread 3; and so on, up to Thread 50. 
  //Each thread should print "Hello from Thread <num>!", 
  //but you should structure your program such that the threads print their greetings in reverse order.
	ArrayList<Thread> list;
	public static void main(String[] args) {
		
		int num = 1;
		list = new ArrayList<Thread>();
		Thread t1 = new Thread(()->createThread(num));
		t1.start();
		
		
	}
	
	public static Thread createThread(int num) {
		
		
		
		if(num == 51) {
			
			runAll(list);
			return null;
			
		}
		
		Thread t = new Thread(()-> System.out.println("Hello from Thread " + num + "!"));
		
		list.add(t);
		
		return createThread(num+1);
	}
	
	public static void runAll(ArrayList<Thread> list) {
		for(int i = list.size()-1; i >= 0; i--) {
			list.get(i).start();
			try {
				list.get(i).join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	
}
