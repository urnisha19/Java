//fig 6.11: Drawing a smiley face using colors and filled shapes

import java.awt.Color; //used represent color by their rgb value
import java.awt.Graphics; //provides various methods for drawing text or shapes
import javax.swing.JPanel; //provides an area on which we can draw


public class DrawSmiley extends JPanel
{
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        
        // draw the face
        g.setColor(Color.YELLOW);
        g.fillOval(10, 10, 200, 200);/* draws a circle with diameter 200 to represent the face—when the width and height 
        arguments are identical, method fillOval draws a circle*/
        
        // draw the eyes
        g.setColor(Color.BLACK);
        g.fillOval(55, 65, 30, 30);
        g.fillOval(135, 65, 30, 30);
        
        // draw the mouth
        g.fillOval(50, 110, 120, 60);// draws the mouth as an oval,but this is not quite what we want
        
        // "touch up" the mouth into a smile
        g.setColor(Color.YELLOW);
        g.fillRect(50, 110, 120, 30); // draws a rectangle that’s half the mouth’s height. This erases the top half of the mouth
        g.fillOval(50, 120, 120, 40);//draws another oval to slightly cover the upper portion of the mouth
    }
}
