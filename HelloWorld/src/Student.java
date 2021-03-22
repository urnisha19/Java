//import javax.swing.JOptionPane;

public class Student
{
    public static int counter;//class variable 
    
    //& all these variable below are instance variable
    private String id;
    private String name;
    //private static String name; //class variable
    private int batch;
    private char section;
    private String program;
    // private String dob;
    private boolean status;
    //private String bloodGroup;
    
    public Student() //<<constructor>>
    {
        counter++;
        System.out.printf("\n"+counter +".This is a Student Information-\n");
    }
    public Student(String program,int batch, char section) //<<costructor>>
    {
        counter++;
        this.program=program;
        this.batch=batch;
        this.section=section;
        this.status=true; //here i didnt set any parameter for status.but when we call this constructor by default weset here the status true
        System.out.printf("\n"+counter +".This is a Student Information-\n");
        
        if(!this.status)
        {
            System.out.print("This is a regular student\n");
        }
        else
        {
             System.out.print("This student has been passed out\n");
        }
    }
    public Student(String program,int batch, boolean status) //<<costructor>>
    {
        counter++;
        this.program=program;
        this.batch=batch;
        this.section=section;
        this.status=true; //here i didnt set any parameter for status.but when we call this constructor by default weset here the status true
        System.out.printf("\n"+counter +".This is a Student Information-\n");
        
        if(!this.status)
        {
            System.out.print("This is a regular student\n");
        }
        else
        {
             System.out.print("This student has been passed out\n");
        }
    }
    
    public void setId(String id) //(instance method)to set value to the id attribute
    {
        this.id = id;
    }   
    public String getId() //(instance method)to get value from the id attribute
    {
        return id;
        //return this.id;
    }    
     /*public static void setName(String name) //class method to set name 
    {
        Student.name = name; //here we can't use this.name cz it is a class variable so we must call it with class name
    }    */
    public void setName(String name) //instance method to set name 
    {
        this.name = name; //here we can't use this.name cz it is a class variable so we must call it with class name
    }    
    public String getName() //instance method to get name
    {
        return name;
        //return this.name; 
    }    
     public void setBatch(int batch) //instance method set batch
    {
        this.batch = batch;
    }   
    public int getBatch() //instance method to get batch
    {
        return batch;
        //return this.batch
    }
    public char getSection() //instance method to get section
    {
       /* if(this.section!= '')
        {
            return this.section;
        }
        else
        {
                return 'N/A';
        } */
        return this.section;
    }
 
    public String getProgram() //instance method to get program
    {
        if(this.program!= null)
        {
            return this.program;
        }
        else
        {
                return "N/A";
                }
    }
    public void display() //instance method to display to console
    {
        System.out.println("The information of "+this.getId()+" is:");
        System.out.println("Name:"+this.getName());
        System.out.println("Batch:"+this.getBatch());
        System.out.println("Section:"+this.getSection());
        System.out.println("Program:"+this.getProgram());
    }
   /* public void displayDialogbox() //display to dialogbox
    {
        JOptionPane.showMessageDialog(null,"The information of "+this.getId()+" is \nName: "+this.getName()+"\nBatch: "+this.getBatch()+"\nSection: "+this.getSection()+"\nProgram: "+this.getProgram());
    }*/
    
    public int quotient(int numerator, int denominator)
    {
        return numerator/denominator;
    }
}
