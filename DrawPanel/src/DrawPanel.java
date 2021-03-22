//fig 4.18: Using drawLine to connect the corners of a panel

import java.awt.Graphics; //provides various methods for drawing text or shapes
import javax.swing.JPanel; //provides an area on which we can draw

public class DrawPanel extends JPanel//DrawPanel(Subclass) inherits JPanel(SuperClsss)
{
    // draws an X from the corners of the panel
    public void paintComponent(Graphics g)
    {
        // call paintComponent to ensure the panel displays correctly
        super.paintComponent(g); //paintComponent is a method of superClass(JPanel)
        
        int width = getWidth(); // total width. //method getWidth returns Jpanels width
        int height = getHeight(); // total height. //method getHeight returns Jpanels height
        
        // draw a line from the upper-left to the lower-right
        g.drawLine(0, 0, width, height);
        
        /*grapgics variable g calls method drawline to draw two lines.The first two arguments are the x and y-coordinates for one endpoint,
        and the last two arguments are the coordinates for the other endpoint.*/
        
        // draw a line from the lower-left to the upper-right
        g.drawLine(0, height, width, 0);  //graphics variable g calls method drawline to draw two lines
    }   
}
