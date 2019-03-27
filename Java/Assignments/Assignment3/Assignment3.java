import java.util.Scanner;

/**
 *
 * @author zach slaunwhite (A00385522)
 */
public class Assignment3 {

    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);

        System.out.println("In this program, you will type out a list of grades.\n"
                + "The program will than see how many of each letter grade you recieved,\n"
                + "and present the highest grade, the lowest grade, and the average grade.\n"
                + "(A negative grade indicated you are done the list)");

        //defining variables
        double num = 0;
        double max = Double.MIN_VALUE;//start with the smallest value
        double min = Double.MAX_VALUE;//start with the largest value
        double sum = 0;//start with zero
        int sum1 = 0;

        //defining the letter grade variables
        int A = 0;
        int B = 0;
        int C = 0;
        int D = 0;
        int F = 0;

        System.out.println("\nPlease enter a list of grades based on percentage, "
                + "followed by a negative.");

        //allows you to continue to enter numbers until a negative one is entered
        while (num > -1) {
            num = kbd.nextDouble();
            if (num > -1) {

                max = Math.max(num, max);
                min = Math.min(num, min);
                sum += num;
                sum1++;

                //assigning a grade value to each number you enter until a negative number
                if (num >= 80) {
                    A++;
                } else if (num >= 70) {
                    B++;
                } else if (num >= 60) {
                    C++;
                } else if (num >= 50) {
                    D++;
                } else {
                    F++;
                }

            }

        }

        System.out.println();
        System.out.println();

        kbd.nextLine();//clean up the scanner
        System.out.println("Press enter to continue...");
        kbd.nextLine();//pressing enter allows you to continue
        System.out.println();

        //calculate the average
        double ave = sum / sum1;

        //prints out the letter grades and how many you got of each
        System.out.println("Total number of grades = " + sum1);
        System.out.println("Total number of A's = " + A);
        System.out.println("Total number of B's = " + B);
        System.out.println("Total number of C's = " + C);
        System.out.println("Total number of D's = " + D);
        System.out.println("Total number of F's = " + F);

        // in case no values were entered
        if (sum == 0) {
            max = 0;
            min = 0;
            ave = 0;
        }
        //print out the final values
        System.out.println("\nhighest grade: " + max);
        System.out.println("lowest grade: " + min);
        System.out.println("average grade: " + ave);

    }

}
