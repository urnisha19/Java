//fig 7.25: Drawing a rainbow using arcs and an array of colors

 import java.awt.Color;  //used represent color by their rgb value
 import java.awt.Graphics;  //provides various methods for drawing text or shapes
 import javax.swing.JPanel; //provides an area on which we can draw
 
 public class DrawRainbow extends JPanel
 {
     // declare and create two new color constants
     private final static Color VIOLET = new Color(128, 0, 128);
     private final static Color INDIGO = new Color(75, 0, 130);
     
     /*colors to use in the rainbow,starting from the innermost. Color.WHITE entries at the beginning of the array is to create the empty 
     arc in the center*/ 
     private Color[] colors = { Color.WHITE, Color.WHITE, VIOLET, INDIGO, Color.BLUE, Color.GREEN, Color.YELLOW, Color.ORANGE, Color.RED };

     // constructor
     public DrawRainbow()
     {
         setBackground(Color.WHITE); // set the background to white
     }
     
     // draws a rainbow using concentric arcs
     public void paintComponent(Graphics g)
     {
        super.paintComponent(g);
           
        int radius = 20; // radius of an arc
         
        // draw the rainbow near the bottom-center
        //Local variables centerX and centerY determine the location of the midpoint on the base of the rainbow.
        
        int centerX = getWidth()/2;
        int centerY = getHeight()-10;
         
         // draws filled arcs starting with the outermost
         
         for (int counter = colors.length; counter > 0; counter--) /*control variable counter to count backward from the end of 
             the array, drawing the largest arcs first and placing each successive smaller arc on top of the previous one*/
         {
             // set the color for the current arc
             g.setColor(colors[counter - 1]);
             
             // fill the arc from 0 to 180 degrees
             g.fillArc(centerX - counter * radius,centerY - counter * radius,counter * radius * 2, counter * radius * 2, 0, 180); //draws a filled semicircle
             
             /*Method fillArc requires six parameters.
             The first four represent the bounding rectangle in which the arc will be drawn. 
             The first two of these specify the coordinates for the upper-left corner of the bounding rectangle, and the 
             next two specify its width and height.
             The fifth parameter is the starting angle on the oval, and the sixth specifies 
             the sweep, or the amount of arc to cover. */
         }
     }
 }