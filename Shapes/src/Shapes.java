//fig 5.27: Drawing a cascade of shapes based on the user’s choice

import java.awt.Graphics; //provides various methods for drawing text or shapes
import javax.swing.JPanel;  //provides an area on which we can draw

public class Shapes extends JPanel
{
    private int choice; // user's choice of which shape to draw

    // constructor sets the user's choice
    public Shapes(int userChoice)
    {
        choice = userChoice;
    }

    // draws a cascade of shapes starting from the top-left corner
    public void paintComponent(Graphics g)
    {
     super.paintComponent(g);

      for (int i = 0; i < 10; i++)
      {
        // pick the shape based on the user's choice
        switch (choice)
        {
         case 1: // draw rectangles
         g.drawRect(10 + i * 10, 10 + i * 10, 50 + i * 10, 50 + i * 10); 
         
        /*The first two argument represent the x- and y-coordinates of the upper-left corner of the rectangle;the next two 
        represent the rectangle’s width and height.
         In this example, we start at a position 10 pixels down and 10 pixels right of 
        the top-left corner, and every iteration of the loop moves the upper-leftcorner another 10 pixels down and to the right.
        The width and the height of the rectangle start at 50 pixels and increase by 10 pixels in each iteration.*/
         
        break;
    
         case 2: // draw ovals
         g.drawOval(10 + i * 10, 10 + i * 10, 50 + i * 10, 50 + i * 10);
         
         /*Method drawOval requires the same four arguments as method drawRect.The arguments specify the position and size of the bounding 
         rectangle for the oval.*/
         
         break;  
        }  
      }
    }
}
