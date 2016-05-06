import java.awt.*;
import javax.swing.*;

public class graphicsChallenges1 extends Canvas
	{

		public static void main(String[] args)
			{
				graphicsChallenges1 canvas = new graphicsChallenges1();
				JFrame frame = new JFrame();
				frame.setSize(1000, 1000);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		        frame.getContentPane().add(canvas).setBackground(Color.black);
		        frame.setVisible(true);
			}
    	public void paint(Graphics graphics) 
    	{
    		graphics.setColor(Color.white);
    		graphics.drawLine(0, 0, 1000, 1000);
    		
    		graphics.setColor(Color.white);
    		graphics.drawLine(1000, 0, 0, 1000);
    		
    		graphics.setColor(Color.green);
    		graphics.fillRect(0, 0, 800, 100);
    		
    		graphics.setColor(Color.red);
    		graphics.drawRect(300, 50, 250, 850);
    		
    		graphics.setColor(Color.blue);
    		graphics.drawRect(799, 699, 101, 101);
    		graphics.setColor(Color.yellow);
    		graphics.fillRect(800, 700, 100, 100);
    		
    		graphics.setColor(Color.white);
    		graphics.fillOval(100, 100, 275, 275);
    		graphics.setColor(Color.pink);
    		graphics.fillOval(175, 250, 125, 75);
    		graphics.setColor(Color.white);
    		graphics.fillOval(185, 225, 105, 80);
    		graphics.setColor(Color.blue);
    		graphics.fillRect(150, 175, 60, 60);
    		graphics.setColor(Color.blue);
    		graphics.fillRect(275, 175, 60, 60);
    	}
	}
