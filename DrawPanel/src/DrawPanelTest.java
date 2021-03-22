 //fig 4.19: Creating JFrame to display DrawPanel

import javax.swing.JFrame; //create an window to dispaly on screen

public class DrawPanelTest 
{
    public static void main(String[] args)
    {
       // create a panel that contains our drawing
       DrawPanel panel = new DrawPanel(); //DrawPanel's object(panel)contains our drawing
       
       // create a new frame to hold the panel
       JFrame application = new JFrame(); //JFrame's object application create a window to display the panel***
       
       application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//the application should terminate when the user closes the window. 
       application.add(panel); //JFrame’s add method attach the DrawPanel to the JFrame
       application.setSize(250, 250); //Method setSize takes two parameters that represent the width and height of the JFrame
       application.setVisible(true); //  displays the JFrame by calling its setVisible method
    }   
}
