public class Welcome1 
{
    public static void main(String[] args)//main method begins execution of java Application
    {
      //fig 2.1: display a line of text
      
      System.out.println("Welcome to Java Programming!");
      
      //fig 2.3: display a line of text with multiple statements
      
      System.out.print("Welcome to ");
      System.out.println("Java programming!");
      
      //fig 2.3: display multiple lines with a single statement
      System.out.println("Welcome\nto\nJava\nProgramming!");
      
      //fig 2.6: display multiple lines with method printf
      System.out.printf("%s%n%s%n","Welcome to","Java Programming!");//instead of \n, we used the %n format specifier,which is a line separator,we can only use it in printf method
    }//end of method main
}//end of class Welcom1
