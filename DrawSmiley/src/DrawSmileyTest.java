//fig 6.12 Test application that displays a smiley face

import javax.swing.JFrame; //create an window to dispaly on screen

public class DrawSmileyTest
{
    public static void main(String[] args)
    {
       // create a panel that contains our drawing
       DrawSmiley panel = new DrawSmiley();
       
        // create a new frame to hold the panel
       JFrame application = new JFrame();
       
       application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       application.add(panel);
       application.setSize(230, 250);
       application.setVisible(true);
    }
}
