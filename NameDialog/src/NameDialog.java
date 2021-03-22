 //fig 3.13: Obtaining user input from a dialog

import javax.swing.JOptionPane; //provides prebuilt dialog boxes

public class NameDialog
{  
    public static void main(String[] args) 
    {
        // prompt user to enter name
        String name = JOptionPane.showInputDialog("What is your name?");

        // create the message
        String message = String.format("Welcome, %s, to Java Programming!", name);

        // display the message to welcome the user by name
        JOptionPane.showMessageDialog(null, message);
    }  
}
