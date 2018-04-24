
package threads;
public class ThreadedReverseGreeting {
  //Write a program that creates a thread (Thread 1) that creates another thread (Thread 2); 
  //Thread 2 creates Thread 3; and so on, up to Thread 50. 
  //Each thread should print "Hello from Thread <num>!", 
  //but you should structure your program such that the threads print their greetings in reverse order.
	
	public static void main(String[] args) {
		
		int num = 1;
		Thread t1 = new Thread(()->createThread(num));
		t1.start();
		
		
	}
	
	public static Thread createThread(int num) {
		
		if(num == 51) {
			return null;
			
		}
		
		Thread t = new Thread(()-> System.out.println("Hello from Thread " + num + "!"));
		t.start();
		
		return createThread(num+1);
	}
	
	
}
