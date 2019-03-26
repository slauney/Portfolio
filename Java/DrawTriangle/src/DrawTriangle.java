
import java.util.Scanner;

/**
 * This program draws a triangle!
 *
 * @author Zach Slaunwhite (A00385522)
 */
public class DrawTriangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Scanner obj
        Scanner kbd = new Scanner(System.in);

        
        System.out.println("\n\nThis program draws a triangle!");

        System.out.print("\n\nPress enter to continue...");
        kbd.nextLine();

        //base of the triangle
        System.out.print("\n\nWhat's the size of the triangle? ");
        int size = kbd.nextInt();//no size limit, so use at your own risk
        kbd.nextLine();

        System.out.println("\n\nNow I will draw a triangle of the size "
                + size);
        System.out.print("\n\nPress enter to continue...");
        kbd.nextLine();

        //a few empty lines
        System.out.print("\n\n\n");

        //outer loop
        for (int row = 1; row <= size; row++) {

            //inner loop
            for (int col = 1; col <= row; col++) {
                System.out.print('*');
                
                    
            }//end for col  
            System.out.print("\n");
        }//end for row
        
        for (int row = 1; row < size; row++){
            for (int  col = size - 1; col >= row; col--){
                System.out.print("*");
            }
            System.out.println();
        }
        

    }//end main

}//end class
