// Fig. 15.6:  This program reads a text file and displays each record

import java.io.IOException;
import java.lang.IllegalStateException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ReadTextFile
{
    private static Scanner input;
    
    public static void main(String[] args)
    {
        openFile();
        readRecords();
        closeFile();
    }

    // open file clients.txt
    public static void openFile()
    {
        try
        {
            input = new Scanner(Paths.get("clients.txt"));
            /*opens the file for reading by instantiating a Scanner object.
            /*We pass a Path object to the Scanner constructor, which specifies that the Scanner object will read from the file
            "clients.txt" located in the directory from which the application executes.*/
        }

        catch (IOException ioException)
        /*If the file cannot be found, an IOException occurs*/    
        {
            System.err.println("Error opening file. Terminating.");
            System.exit(1);
        }
    }
    
    // read record from file
    public static void readRecords()
    {
        System.out.printf("%-10s%-12s%-12s%10s%n", "Account","First Name", "Last Name", "Balance");
        /* display headers for the columns in the application’s output*/
        
        try
        {
            while (input.hasNext()) //read and display data from the file until the end-of-file marker is reached
            {
                //display record contents
                System.out.printf("%-10d%-12s%-12s%10.2f%n", input.nextInt(),input.next(), input.next(), input.nextDouble());
                /* Scanner methods nextInt to input an int(the account number),next to input two Strings(the first and lastnames)
                and nextdouble to input a double value(the balance)*/
            }
        }
        
        catch (NoSuchElementException elementException)
        /* If the information in the file is not properly formed (e.g.,there’s a last name where there shouldbe a balance),
            a NoSuchElementException occurs when the record is input*/
            
        {
            System.err.println("File improperly formed. Terminating.");
        }
        
        catch (IllegalStateException stateException)
        /*If the Scanner was closed before the data was input, an IllegalStateException occurs */   
            
        {
            System.err.println("Error reading from file. Terminating.");
        }
    } // end method readRecords

    // close file and terminate application
    public static void closeFile()
    {
        if (input != null)
            input.close();//method closeFile closes the Scanner
    }
}