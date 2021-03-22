import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class StudentInfoEventHandler extends JFrame 
{
    private final JTextField textField1;
    private final JTextField textField2;
    private final JPasswordField passwordField; 

    public  StudentInfoEventHandler ()
    {
       super("This is a test GUI for event handling");
       setLayout(new FlowLayout());
       
       textField1 = new JTextField("Name:");
       textField2 = new JTextField("Log in ID:");
       passwordField = new JPasswordField("Password");
       
       add(textField1); 
       add(textField2);
       add(passwordField);
      
       StudentActionListener handler = new StudentActionListener();
       textField1.addActionListener(handler); 
       textField2.addActionListener(handler); 
       passwordField.addActionListener(handler); 
    }
    
    private class StudentActionListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent ae)
        {
          String text = "";
          
          if (ae.getSource() == textField1 )
              text = String.format("textField1: %s",ae.getActionCommand());
          
          else if (ae.getSource() == textField2 )
              text = String.format("textField2: %s",ae.getActionCommand());      
          
          else if (ae.getSource() == passwordField )
               text  = String.format("passwordField: %s",ae.getActionCommand());
          
          JOptionPane.showMessageDialog(null,  text );
        }
    }
}

