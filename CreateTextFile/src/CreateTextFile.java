// Fig. 15.3: Writing data to a sequential text file with class Formatter.

import java.io.FileNotFoundException;
import java.lang.SecurityException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class CreateTextFile
{
    private static Formatter output; // outputs text to a file//here ouput is Formatter class object
    
    public static void main(String[] args)
    {
        openFile();
        addRecords();
        closeFile();
    }

    // open file clients.txt
    public static void openFile()
    {
        try
        {
            output = new Formatter("clients.txt"); // open the file
            /*The Formatter object is instantiated in method openFile.The constructor used  takes one argument—a String
            containing the name of the file, including its path. 
            If no exception occurs,the file open for writing and the resulting Formatter object can be used to write data to the file.*/
        }
        
        catch (SecurityException securityException) 
        /* handle the SecurityException, which occurs if the user does not have permission to write data to the file*/
        {
            System.err.println("Write permission denied. Terminating.");
            System.exit(1); // terminate the program
        }
        
        catch (FileNotFoundException fileNotFoundException)
        /*handle the FileNotFoundException,which occurs if the file does not exist and a new file cannot be created*/
        {
            System.err.println("Error opening file. Terminating.");
            System.exit(1); // terminate the program
        }
    }
    
    // add records to file
    public static void addRecords()
    {
        Scanner input = new Scanner(System.in);//take input from CLI
        
        System.out.printf("%s%n%s%n? ","Enter account number, first name, last name and balance.",
                "Enter end-of-file indicator to end input.");
        /*prompts the user to enter the various fields for each record or the end-of-file key sequence when data entry is complete*/
        
        while (input.hasNext()) //loop until end-of-file indicator. *Scanner method hasNext to determine end-of-file 
        {
            try
            {
                //output new record to file; assumes valid input
                output.format("%d %s %s %.2f%n", input.nextInt(),input.next(), input.next(), input.nextDouble());
                /* a Scanner to read data from the user, then output the data as a record using the Formatter. */
                /* Method format outputs a formatted String to the output destination of the Formatter object—the file clients.txt*/
                
                /*we can also output data to a text file using class java.io.PrintWriter, which provides format and printf methods 
                for outputting formatted data*/
            }
            
            catch (FormatterClosedException formatterClosedException)
            /*if the Formatter object is closed, a FormatterClosedException will be thrown*/
                
            {
                System.err.println("Error writing to file. Terminating.");
                break;
            }
            
            catch (NoSuchElementException elementException)
            /*Scanner input method throws a NoSuchElementException if the data is in the wrong format(e.g.,a String when an int is expected) */
            
            {
                System.err.println("Invalid input. Please try again.");
                input.nextLine(); // discard input so user can try again
            }
            
            System.out.print("? ");   
        } // end while
    } // end method addRecords
    
    //close file
    public static void closeFile()
    {
        if (output != null)
            output.close();// closes the Formatter and the underlying output file
    }
} 