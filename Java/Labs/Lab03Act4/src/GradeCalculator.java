/*
 * Asks the user to enter a percent grade and prints out
 * message(s) based on the grades.
 */

/**
 *
 * @author Zach Slaunwhite (A00385522)
 */
import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {

        //define Scanner object
        Scanner Input = new Scanner(System.in);

        //asks the user to enter a percent-grade
        System.out.print("Enter a grade (0-100%): ");
        double grade = Input.nextDouble();
        Input.nextLine();

        System.out.println("Your grade was " + grade + "%.\n\n");

        //checking to see if grades are too high or too low
        if (grade < 0) {
            System.out.println("Oh it can't be that bad!\n");
            grade = 0;
            System.out.println("Your grade was changed to " + grade + "\n\n");
        }
        if (grade > 100) {
            System.out.println("No way! I don't believe that!\n");
            grade = 100;
            System.out.println("Your grade was changed to " + grade);
        }

        //checking to see if user passed or failed
        boolean pass = (grade >= 50);

        //displays if user passed or failed
        if (pass) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }

    }

}
