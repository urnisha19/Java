//fig 2.7: program that inputs two numbers then displays their sum

import java.util.Scanner;

public class Addition
{
    public static void main(String[] args) 
    {   
       //create a scanner to obtain input from the command window
       Scanner input = new Scanner(System.in);
       int number1;
       int number2;
       int sum;
         
       //int number1,number2,sum;     
       System.out.print("Enter first integer: ");//prompt
       number1 = input.nextInt();//read first number from user     
       System.out.print("Enter second integer: ");
       number2 = input.nextInt();
         
       sum = number1 + number2;
         
       System.out.printf("Sum is %d%n",sum);
      //System.out.printf("Sum is %d%n",(number1+number2));
    }   
}
