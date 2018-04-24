package threads;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded {
	// Make A Program that uses Threads and robots to draw the Olympic rings. One robot should draw one ring simultaneously with the other 4 robots.
	public static void main(String[] args) {
		
	
	Robot jeff = new Robot(600, 500);
	Robot jeff2 = new Robot(400, 300);
	Robot jeff3 = new Robot(800, 300);
	Robot jeff4 = new Robot(1200, 300);
	Robot jeff5 = new Robot(1000, 500);
	
	jeff.setSpeed(10);
	jeff2.setSpeed(10);
	jeff3.setSpeed(10);
	jeff4.setSpeed(10);
	jeff5.setSpeed(10);
	
	jeff.penDown();
	jeff2.penDown();
	jeff3.penDown();
	jeff4.penDown();
	jeff5.penDown();
	
	jeff.setPenColor(Color.YELLOW);
	jeff2.setPenColor(Color.BLUE);
	jeff3.setPenColor(Color.BLACK);
	jeff4.setPenColor(Color.RED);
	jeff5.setPenColor(Color.GREEN);
	
	jeff.setPenWidth(10);
	jeff2.setPenWidth(10);
	jeff3.setPenWidth(10);
	jeff4.setPenWidth(10);
	jeff5.setPenWidth(10);
	
	/*Thread t1 = new Thread(()-> {jeff.move(1); 
								jeff.turn(1);});*/
	Thread t1 = new Thread(()-> drawCircle(jeff));
	Thread t2 = new Thread(()-> drawCircle(jeff2));
	Thread t3 = new Thread(()-> drawCircle(jeff3));
	Thread t4 = new Thread(()-> drawCircle(jeff4));
	Thread t5 = new Thread(()-> drawCircle(jeff5));
	
	t1.start();
	t2.start();
	t3.start();
	t4.start();
	t5.start();
	}
	
	
	
	
	public static void drawCircle(Robot r) {
		for (int i = 0; i < 360; i++) {
			r.move(3);
			r.turn(1);
		}
		
		
	}
	
}

