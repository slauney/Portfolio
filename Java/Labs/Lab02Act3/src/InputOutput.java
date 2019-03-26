/*
 * This program shows many different types of input and output statements.
 */

/**
 *
 * @author Zach Slaunwhite (A00385522)
 */
import java.util.Scanner;

public class InputOutput {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a Scanner object
        Scanner Input = new Scanner(System.in);

        //define variables
        String sentence, word1, word2;
        int num1, num2, num3;

        System.out.println("Enter a sentence below and press enter.");
        sentence = Input.nextLine();//get a line of text

        //print back the sentence
        System.out.println("You typed: ");
        System.out.println("    " + sentence);

        System.out.println();//print an empty line

        System.out.println("Enter 2 words below in one line and press enter.");
        word1 = Input.next();//get the 1st word
        word2 = Input.next();//get the 2nd word
        Input.nextLine();//flush the input stream

        System.out.println("You typed: \n    " + word1 + " " + word2 + "\n");

        /*
         System.out.println("Word 1: " + word1);
         System.out.println("Word 2: " + word2);
         */
        
        System.out.println();//print an empty line

        //you can split a long line into 2
        System.out.println("Enter 3 whole numbers below in one line "
                + "and press enter.");

        num1 = Input.nextInt();//get the 1st number
        num2 = Input.nextInt();//get the 2nd number
        num3 = Input.nextInt();//get the 3rd number
        Input.nextLine();//flush the input stream

        //print back the sum of the 2 numbers
        System.out.println("The sum of " + num1 + ", "
                + num2 + " and " + num3 + " is " + (num1 + num2 + num3) + ".");

    }

}
