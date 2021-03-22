//fig 5.29: Drawing concentric circles.

import java.awt.Graphics;
import javax.swing.JPanel;
import javax.swing.JFrame; //handle the display

public class Circle extends JPanel
{
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
         int radius = 10; 
         int centerX = getWidth()/2;
         int centerY = getHeight()-5;
         for (int i = 0; i < 12; i++)
         {
              g.drawCircle(centerX - i * radius,centerY - i * radius,i * radius * 2,i * radius * 2, 0, 180);
         }
    } 
    public static void main(String[] args)
    {
         JFrame application = new JFrame(); // creates a new JFrame
         application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         
         application.setSize(300, 300);
         application.setVisible(true);
    }
}
