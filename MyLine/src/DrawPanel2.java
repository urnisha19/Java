//fig 8.18: Program that uses class MyLine to draw random lines

import java.awt.Color;
import java.awt.Graphics;
import java.security.SecureRandom;
import javax.swing.JPanel;

public class DrawPanel2 extends JPanel
{
   private SecureRandom randomNumbers = new SecureRandom();
   private MyLine[] lines; // declares the MyLine array lines to store the lines to draw
   
   // constructor, creates a panel with random shapes
   public DrawPanel2()
   {
       setBackground(Color.WHITE);
       lines = new MyLine[5 + randomNumbers.nextInt(5)];//creates the array with a random length between 5 and 9
       
       // create lines
       for (int count = 0; count < lines.length; count++) // creates a new MyLine for every element in the array.
       {
           // generate random coordinates for each line’s endpoints
           int x1 = randomNumbers.nextInt(300);
           int y1 = randomNumbers.nextInt(300);
           int x2 = randomNumbers.nextInt(300);
           int y2 = randomNumbers.nextInt(300);
           
           // generate a random color  for the line
           Color color = new Color(randomNumbers.nextInt(256),randomNumbers.nextInt(256), randomNumbers.nextInt(256));
           
           // add the line to the list of lines to be displayed
           lines[count] = new MyLine(x1, y1, x2, y2, color);/*creates a new MyLine object with the randomly generated values
           and stores it in the array*/
       }
   }
   
   // for each shape array, draw the individual shapes
   public void paintComponent(Graphics g)
   {
       super.paintComponent(g);
       
       // draw the lines
       for (MyLine line : lines)
           line.draw(g);
       
       /*Method paintComponent iterates through the MyLine objects in array lines using an enhanced for statement. Each iteration 
      calls the draw method of the current MyLine object and passes it the Graphics object for drawing on the panel. */
   }
}
