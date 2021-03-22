
public class StudentCSE extends Student //extend Student implies StudentCSE is a child of Student class 
{
    private boolean acmStatus;
   public StudentCSE(String program, int batch, char section, boolean acmStatus)
   {
       super(program,batch,section);//super implies Studet(parent) class's constuctor
       
       this.acmStatus=acmStatus; //this imples StudentCSE(child) lass
       
   }
   public void display() //overrided mrthod// this overrides the display method of Student class.it is called polymorphism(same method defined differently)
   {
       super.display();
       System.out.println("ACM Status: "+acmStatus);
   }
}
