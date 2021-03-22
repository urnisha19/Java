//fig 8.19: Creating a JFrame to display a DrawPanel

import javax.swing.JFrame;

public class TestDraw 
{
    public static void main(String[] args)
    {
        DrawPanel2 panel = new DrawPanel2();
        JFrame app = new JFrame();
        
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.add(panel);
        app.setSize(300, 300);
        app.setVisible(true);
    }
}
