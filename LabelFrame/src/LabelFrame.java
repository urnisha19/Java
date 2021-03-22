//Fig. 12.6: JLabels with text and icons

import java.awt.FlowLayout; //specifies how components are arranged
import javax.swing.JFrame; 
import javax.swing.JLabel; //displays text and images
import javax.swing.SwingConstants; //common constants used with Swing(left,right,center)
import javax.swing.Icon; //interface used to manipulate images
import javax.swing.ImageIcon; //loads images

public class LabelFrame extends JFrame
{
    private final JLabel label1; // JLabel with just text
    private final JLabel label2; // JLabel constructed with text and icon
    private final JLabel label3; // JLabel with added text and icon
    
    // LabelFrame constructor adds JLabels to JFrame
    public LabelFrame()
    {
        super("Testing JLabel"); //calls superclass JFrame’s constructor with the argument 
        setLayout(new FlowLayout()); // set frame layout

        // JLabel constructor with a string argument
        label1 = new JLabel("Label with text");
        label1.setToolTipText("This is label1"); 
        
        // method setToolTipText (inherited by JLabel from JComponent) to specify  the tool tip that’s displayed when the user positions 
        //the mouse cursor over the JLabel in the GUI. 
        
        add(label1); //attaches label1 to the LabelFrame by passing label1 to the add method, which is inherited indirectly from class Container.
        
        // JLabel constructor with string, Icon and alignment arguments
        Icon bug = new ImageIcon(getClass().getResource( "bug.jpg"));
        
        label2 = new JLabel("Label with text and icon", bug,SwingConstants.LEFT);
        
        //The last constructor argument indicates that the label’s  contents  are left justified, or left aligned 
        
        label2.setToolTipText("This is label2");//specifies the tool-tip text for label2
        add(label2); // add label2 to JFrame
        
        label3 = new JLabel(); // JLabel constructor no arguments
        label3.setText("Label with icon and text at bottom");
        label3.setIcon(bug); // add icon to JLabel
        label3.setHorizontalTextPosition(SwingConstants.CENTER);
        label3.setVerticalTextPosition(SwingConstants.BOTTOM);
        
        //JLabel methods setHorizontalTextPosition and setVerticalTextPosition to specify the text position in the label.
        // text will be centered horizontally and will appear at the bottom of the label.
        
        label3.setToolTipText("This is label3");
        add(label3); // add label3 to JFrame
    }  
}
