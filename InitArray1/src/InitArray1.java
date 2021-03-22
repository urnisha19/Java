
public class InitArray1
{
    public static void main(String[] args) 
    {
        //fig 7.2: Initializing the elements of an array to default values of zero.
        int[] array1 = new int[10]; // create the array object/declare variable array and initialize it with an array object
        System.out.printf("%s%8s%n", "Index1", "Value"); // column headings
        //output each array element's value
        for (int counter = 0; counter < array1.length; counter++)
             System.out.printf("%5d%8d%n", counter, array1[counter]);
         
        //fig 7.3: Initializing the elements of an array with an array initializer
        int[] array2 = { 32, 27, 64, 18, 95, 14, 90, 70, 60, 37 };// initializer list specifies the initial value for each element
        System.out.printf("%s%8s%n", "Index2", "Value"); // column headings
        // output each array element's value
        for (int counter = 0; counter < array2.length; counter++)
             System.out.printf("%5d%8d%n", counter, array2[counter]);
        
        //fig 7.4: Calculating the values to be placed into the elements of an array.        
        final int ARRAY_LENGTH = 10;// declare constant
        int[] array3 = new int[ARRAY_LENGTH]; // create array       
        // calculate value for each array element
        for (int counter = 0; counter < array3.length; counter++)
            array3[counter] = 2 + 2 * counter;
        System.out.printf("%s%8s%n", "Index3", "Value"); // column headings       
        // output each array element's value
        for (int counter = 0; counter < array3.length; counter++)
            System.out.printf("%5d%8d%n", counter, array3[counter]);
    }  
}

