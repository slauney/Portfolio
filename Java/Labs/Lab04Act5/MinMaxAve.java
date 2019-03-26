
import java.util.Scanner;

/**
 * Calculates maximum, minimum, and average values of the numbers entered.
 *
 * @author zach slaunwhite (A00385522)
 */
public class MinMaxAve {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a Scanner object
        Scanner kbd = new Scanner(System.in);

        //declare vairables and initialize
        double num = 0;
        double max = Double.MIN_VALUE;//start with the smallest value
        double min = Double.MAX_VALUE;//start with the largest value
        double count = 0;
        double sum = 0;//start with zero
        int sum1 = 0;
        String choice = "yes";

        //ask for input
        System.out.println("Enter numbers below \n(put a negative number to "
                + "identify that the list is done):");

        //While the number is greater than -1, it keeps on recording
        while (num > -1) {
            num = kbd.nextDouble();
            max = Math.max(num, max);
            if (num > -1) {
                min = Math.min(num, min);
                sum += num;
                sum1++;
            }
        }

        //calculate average
        System.out.println("Please enter either A, X, or N (Average, Max, Min)");
        //print out the results
        
        //calculates the average, using a new variable called sum1 instead of sum/5
        double ave = sum / sum1;
        
        //while loop for each catagory 
        while (choice.equalsIgnoreCase("yes")){
            String answer = kbd.next();
            switch (answer.toLowerCase()){
                case "a": 
                    System.out.println ("Average is :" + ave);
                    break;
                case "x":
                    System.out.println ("Maximum is :" + max);
                    break;
                case "n":
                    System.out.println ("Minimum is :" + min);
                    break;
                default:
                    System.out.println ("That is an invalid answer.");
                    break;
            }
        /*if (answer.equalsIgnoreCase("A")) {
            System.out.println("Average is " + ave);
        } else if (answer.equalsIgnoreCase("X")) {
            System.out.println("Maximum value is " + max);
        } else if (answer.equalsIgnoreCase("N")) {
            System.out.println("Minimum value is " + min);
        } else {
            System.out.println("your choice was invalid!");
        }
                */
        //get a different menu option
        System.out.print("would you like to see the other values? (yes/no)");
        choice = kbd.next();
        }
        
        

    }

}
