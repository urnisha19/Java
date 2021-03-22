// Fig. 15.2: File class used to obtain file and directory information.

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileAndDirectoryInfo
{
    public static void main(String[] args) throws IOException
    {
        Scanner input = new Scanner(System.in);   
        
        System.out.println("Enter file or directory name:");//rompting the user for a file or directory 
        
       // create Path object based on user input
       Path path = Paths.get(input.nextLine());
       /*inputs the filename or directory name and passes it to Paths static method get,this method converts the String to a Path*/
       
       if (Files.exists(path)) // if path exists, output info about it
       {
           //display file (or directory) information
           System.out.printf("%n%s exists%n",path.getFileName());
           System.out.printf("%s a directory%n",Files.isDirectory(path) ? "Is" : "Is not");
           System.out.printf("%s an absolute path%n",path.isAbsolute() ? "Is" : "Is not");
           /*An absolute path contains all directories, starting with the root directory, that lead to a specific file or directory*/
           
           System.out.printf("Last modified: %s%n",Files.getLastModifiedTime(path) );
           System.out.printf("Size: %s%n", Files.size(path));
           System.out.printf("Path: %s%n", path);
           System.out.printf("Absolute path: %s%n",path.toAbsolutePath() );
           
           if (Files.isDirectory(path) ) // output directory listing
           {
               System.out.printf("%nDirectory contents:%n");
               
               //object for iterating through a directory's contents
               DirectoryStream<Path> directoryStream =Files.newDirectoryStream(path);
               /*Files static method newDirectoryStream get a DirectoryStream<Path> containing Path objects for the directory’s 
               contents*/
               
               for (Path p : directoryStream)
                   System.out.println(p);
               /*display the String representation of each Path in the DirectoryStream<Path> */
           }
       }
       else // not file or directory, output error message
       {
           System.out.printf("%s does not exist%n", path);
       }
    }
}