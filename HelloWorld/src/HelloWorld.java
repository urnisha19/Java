
import java.util.Scanner;
//import java.util.* ; //.staric means all..here all classes of util pakage will import;but we do not use it cz loading all class will increase the size) so we only import needed classes to make it fast or more efficient
import javax.swing.JOptionPane;

import javax.swing.JFrame;

public class HelloWorld 
{
    public static void main(String[] arge)
    {     
        Scanner input = new Scanner(System.in);
   
       /*System.out.printf("Welcome to world of JAVA !\n");
        
        Student.counter=0;//calling class variable
        
        Student student = new Student(); 
        student.setId("191-115-051");
        student.setName("Urnisha");
        student.setBatch(47);        
        student.display();   
        
        Student st2 = new Student();
        st2.setId("191-115-052");
        st2.setName("Anika");
        st2.setBatch(47);             
        st2.display();
        
       //System.out.println("\nThe batch of the student "+st2.getName()+" is:"+st2.getBatch());//display only batch
        
       Student st3 = new Student("CSE",47,'A');
       st3.setId("191-115-075");
       st3.setName("Bithi");
       st3.display();
       
       Student st4 = new Student("CSE",47,true);
       st4.setId("191-115-077");
       st4.setName("Bushra");
       st4.display();
      
       Student st5 =new Student("CSE",47,'A');
       System.out.println("Please enter the id: ");
       st5.setId(input.nextLine());
       System.out.println("Please enter the name: ");
       st5.setName(input.nextLine());
       st5.display();    
      
       //st5.displayDialogbox();
       //JOptionPane.showMessageDialog(null,"The information of "+st5.getId()+" is \nName: "+st5.getName()+"\nBatch: "+st5.getBatch()+"\nSection: "+st5.getSection()+"\nProgram: "+st5.getProgram());
        
       //the below portion is for taking input and showing output with dialog box 
       String id=JOptionPane.showInputDialog("What is the id number?");
       String name=JOptionPane.showInputDialog("What is the name?");
       String  batch=JOptionPane.showInputDialog("What is the batch?");
       String section=JOptionPane.showInputDialog("What is the section?");
       String program=JOptionPane.showInputDialog("Which program?");
       
       String msg=String.format("The information of %s is \nName: %s \nBatch: %s \nSection: %s \nProgram: %s",id,name,batch,section,program);
       JOptionPane.showMessageDialog(null,msg);
       
       StudentCSE cse1 = new StudentCSE("CSE",47,'B',true);
       cse1.setId("191-115-051");
       cse1.setName("Urnisha");
       cse1.display();
       
       StudrentBBA bba1=new StudrentBBA();
       bba1.display();  
       
       /* 
       Student st1= new Student("CSE",47,'A');
       boolean continueLoop = true;
       
       do{
           try{
               
               System.out.println("Enter Numerator:");
               int numerator = input.nextInt();
               
               System.out.println("Enter Denominator:");
               int denominator = input.nextInt();
               
               System.out.printf("this is the Quotient:"+st1.quotient(numerator,denominator));
               continueLoop = false;
           }
           catch(InputMismatchException e)
           {
               System.err.println("Exception is:"+e);
           }
           catch(ArithmaticException e)
           {
               System.err.println("Exception is:"+e);
               System.out.println("Zero not a valid denominator.");
           }           
       }while(continueLoop);*/
       
       StudentInfoEventHandler sieh = new StudentInfoEventHandler();
       sieh.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       sieh.setSize(450, 150);
       sieh.setVisible(true); 
    }
}
              