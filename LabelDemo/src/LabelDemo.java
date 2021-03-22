//Fig 9.13: Demonstrates the use of labels

import java.awt.BorderLayout;//specify where we can place Gui components
import javax.swing.ImageIcon;//represent image that can be displayed on JLabel
import javax.swing.JLabel;//containt both text and image
import javax.swing.JFrame;

public class LabelDemo 
{
    public static void main(String[] args) 
    {
        // Create a label with plain text
        JLabel northLabel = new JLabel("North");//creates a JLabel that displays its constructor argument—the string "North
        
        // create an icon from an image so we can put it on a JLabel
        ImageIcon labelIcon = new ImageIcon("GUItip.gif");//declares local variable labelIcon and assigns it a new ImageIcon.
        
        // create a label with an Icon instead of text
        JLabel centerLabel = new JLabel(labelIcon);
        
        // create another label with an Icon
        JLabel southLabel = new JLabel(labelIcon);
        
        // set the label to display text (as well as an icon)
        southLabel.setText("South"); //to change the text the label displays

        // create a frame to hold the labels
        JFrame application = new JFrame();

       application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

       /*We attach the labels to the JFrame by calling an overloaded version of method add that takes two parameters. The first 
       parameter is the component we want to attach, and the second is the region in which it should be placed*/  
       
       application.add(northLabel, BorderLayout.NORTH);
       application.add(centerLabel, BorderLayout.CENTER);
       application.add(southLabel, BorderLayout.SOUTH);
       
       application.setSize(300, 300);
       application.setVisible(true);
    }   
}
