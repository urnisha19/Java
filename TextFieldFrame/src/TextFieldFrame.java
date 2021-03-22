//Fig. 12.9: JTextFields and JPasswordFields

import java.awt.FlowLayout; //arrange the components in a line,one after another
import java.awt.event.ActionListener; //this is a interface
import java.awt.event.ActionEvent; //this is a class
import javax.swing.JFrame; 
import javax.swing.JTextField; //allows editing of a single line of text
import javax.swing.JPasswordField; //allows editing of a single line of text but it does not show the typed charecters
import javax.swing.JOptionPane;

public class TextFieldFrame extends JFrame //Class TextFieldFrame extends JFrame 
{
    private final JTextField textField1; // text field with set size
    private final JTextField textField2; // text field with text
    private final JTextField textField3; // text field with text and size
    private final JPasswordField passwordField; // password field with text

    // TextFieldFrame constructor adds JTextFields to JFrame
    public TextFieldFrame()
    {
       super("Testing JTextField and JPasswordField");
       setLayout(new FlowLayout());
       
       // construct text field with 10 columns
       textField1 = new JTextField(10);
       add(textField1); // add textField1 to JFrame
       
       // construct text field with default text
       textField2 = new JTextField("Enter text here");
       add(textField2); // add textField2 to JFrame
       
       // construct text field with default text and 21 columns
       textField3 = new JTextField("Uneditable text field", 21);//here 21 is for 21words
       textField3.setEditable(false); // disable editing
       add(textField3); // add textField3 to JFrame
       
       // construct password field with default text
       passwordField = new JPasswordField("Hidden text");
       add(passwordField); // add passwordField to JFrame
       
       // register event handlers
       TextFieldHandler handler = new TextFieldHandler();
       textField1.addActionListener(handler);
       textField2.addActionListener(handler);  
       textField3.addActionListener(handler); 
       passwordField.addActionListener(handler); 
       
       // The application calls JTextField method addActionListener to register the event handler for each component. 
       //This method receives as its argument an ActionListener object
       //The object handler is an ActionListener, becauseclass TextFieldHandler implements ActionListener.***
    }
    
    // private inner class for event handling
    //inner class TextFieldHandler implements interface ActionListener and declares the only method in that interface—actionPerformed
    private class TextFieldHandler implements ActionListener
    {
        // process text field events
        @Override
        public void actionPerformed(ActionEvent event)//actionPerformed is a method of ActionListener
        {
          String string = "";
          
          // user pressed Enter in JTextField textField1
          if (event.getSource() == textField1 )
              string = String.format("textField1: %s",event.getActionCommand());
          
          // user pressed Enter in JTextField textField2
          else if (event.getSource() == textField2 )
              string = String.format("textField2: %s",event.getActionCommand());
          
          // user pressed Enter in JTextField textField3
          else if (event.getSource() == textField3 )
              string = String.format("textField3: %s",event.getActionCommand());
          
          // user pressed Enter in JTextField passwordField
          else if (event.getSource() == passwordField )
              string = String.format("passwordField: %s",event.getActionCommand());
          
          //ActionEvent method getActionCommand to obtain the text the user typed in the text field that generated the event***
        
        
          // display JTextField content
          JOptionPane.showMessageDialog(null, string);
        }
    }// end private inner class TextFieldHandler
}// end class TextFieldFrame

// Class JPasswordField method getPassword returns the password’s characters as an array of type char**
