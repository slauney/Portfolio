import java.util.Scanner;

/**
 *
 * @author Zach Slaunwhite (A00385522)
 */
public class Assignment1 {

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);//allows you to put in input
        String First, Last;//First and last name variables 
        int Age, yearBorn, yearBorn2;//Age and year you were born variables

        //Description of the code
        System.out.print("In this program, you will be asked to input your name (first and family)"
                + "\nand your age, and it will then display your birth year!");

        //Spaces to make program look nicer
        System.out.println("\n");

        //Asking you to enter First and Last name
        System.out.println("Please enter you name (First and Last please, on seperate lines)");
        //program askes you to enter your first name and last name
        System.out.print("First name followed by your last name: ");

        //enter first name
        First = Input.next();
        //enter last name
        Last = Input.next();

        //Enter age
        System.out.print("How old are you?: ");
        Age = Input.nextInt();

        //Random space to make program look nicer
        System.out.println("\n");

        //calculates the year you are born
        yearBorn = 2015 - Age;//must update the year when it changes 
        yearBorn2 = yearBorn - 1;
        //final output for code.
        System.out.println(Last + ", " + First + " was born in either " + yearBorn2 + " or " + yearBorn);

    }

}
