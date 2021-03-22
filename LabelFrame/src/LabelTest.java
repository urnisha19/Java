//Fig. 12.7: Testing LabelFrame

import javax.swing.JFrame;

public class LabelTest 
{
    public static void main(String[] args)
    {
        LabelFrame labelFrame = new LabelFrame();
        labelFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        labelFrame.setSize(600, 500);
        labelFrame.setVisible(true);
    }
}

