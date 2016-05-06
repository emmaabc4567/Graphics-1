import java.awt.*;
import javax.swing.*;
import java.util.Scanner;

public class graphicsChallenges2 extends Canvas
	{
		private static int width;
		private static int length;
		private static String color;

		public static void main(String[] args)
		{
			System.out.println("Would you like to help me draw a rectangle? If so, what should it's width be?");
    		Scanner userInput = new Scanner(System.in);
			width = userInput.nextInt();					
			System.out.println("Height?");
			Scanner userInput1 = new Scanner(System.in);
			length = userInput1.nextInt();
			System.out.println("What color should it be, red or blue?");
			Scanner userInput2 = new Scanner(System.in);
			color = userInput2.nextLine();
			graphicsChallenges2 canvas = new graphicsChallenges2();
			JFrame frame = new JFrame();
			frame.setSize(800, 800);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    frame.getContentPane().add(canvas).setBackground(Color.white);
		    frame.setVisible(true);
		}
    	public void paint(Graphics graphics) 
    	{
//    		for (int row=10; row<200; row=row+40)
//    			{
//    				for (int col=10; col<200; col=col+40)
//    					{
//    						graphics.setColor(Color.white);
//    						graphics.fillRect(row, col, 20, 20);
//    						graphics.fillRect(col, row, 20, 20);
//    					}
//    			}
//    		for (int row=30; row<200; row=row+40)
//    			{
//    				for (int col=10; col<200; col=col+40)
//    					{
//    						graphics.setColor(Color.black);
//    						graphics.fillRect(row, col, 20, 20);
//    						graphics.fillRect(col, row, 20, 20);
//    					}
//    			}
    		if (color.equals("red"))
    			{
    				graphics.setColor(Color.red);
    				graphics.fillRect(0, 0, width, length);
    			}
    		else
    			{
    				graphics.setColor(Color.blue);
    				graphics.fillRect(0, 0, width, length);
    			}
    		int Red;
    		int Green;
    		int Blue;
    		for (Red=0; Red<=225; Red++)
    			{
    				for (Green=0; Green<=225; Green++)
    					{
    						for (Blue=0; Blue<=225; Blue++)
    							{
    								graphics.setColor(new Color (Red, Green, Blue));
    								graphics.fillRect(100, 100, 20, 20);
    							}
    					}
    			}
//    		for (int i=0; i<800; i++)
//    			{
//    				graphics.setColor(Color.orange);
//    				graphics.fillRect(i, i, 20, 20);
//    					
//   					delay();
//    					
//   					graphics.setColor(Color.white);
//    				graphics.fillRect(i, i, 20, 20);
//    			}
//    		
//    		int y=0;
//    		while (y<800)300
//    			{
//    				for (int i=0; i<800; i++)
//    					{
//    	    				graphics.setColor(new Color(10, 25, 225));
//    	    				graphics.fillRect(i, y, 100, 100);
//    	    				
//    	    				delay();
//    	    				graphics.setColor(Color.white);
//    	    				graphics.fillRect(i, y, 100, 100);
//    					}
//    			}
    	}
    	public void delay()
    	{
           try
        	   {
    			Thread.sleep(20);
    			} catch (InterruptedException e)
    			{
    			e.printStackTrace();
    			}
    			
	}

	}
