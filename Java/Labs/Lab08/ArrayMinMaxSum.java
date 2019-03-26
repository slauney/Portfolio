import java.util.Scanner;
import java.util.Arrays;

/**
 * Activities to get you started for A08!
 * 
 * @author Zach Slaunwhite (A00385522)
 */
public class ArrayMinMaxSum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner kb = new Scanner(System.in);//Scanner obj
        
        
         //get the size of the array
        System.out.print("How many elements in the 1st array? ");
        int len = kb.nextInt();
        kb.nextLine();
        int[] a = new int[len];

        //get the values
        if(a.length>0){
            System.out.println("\nEnter values for the 1st array");
            for (int i = 0; i < len; i++) {
                a[i] = kb.nextInt();
            }
            kb.nextLine();
        }

        
        //pause
        System.out.print("Press enter...");
        kb.nextLine();
        System.out.println();

        
        
        
        //initialize variables
        int max = a[0];
        int min = a[0];
        int sum = 0;
        
        
        //searching for min, max, sum
        for(int i=0; i < a.length; i++) {
            //loop to find min
            if (a[i] < min){
                 min = a[i] ;
            }
            //loop to find max
            if (a[i] > max){
                max = a[i];
            }
            
            //adds up all values
            sum = sum + a[i];
                
            
        }//end for
        
        //print out the values
        System.out.printf("%10s%4d\n","The maxumum value is ",max);
        System.out.printf("%10s%4d\n","The minimum value is ",min);
        System.out.printf("%10s%4d\n","The sum is",sum);
        
        
        
        
    }
    
}
