package Assignment2;
import java.util.Scanner;

/**
 *
 * @author zach slaunwhite (A00385522)
 */
public class Assignment2 {

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);//allows you to put in input
        //Declaring the variables needed
        double num1, num2, num3, num4, num5, exam1, exam2,
        averageAssignments, averageExams, finalGrade;

        //Description of program
        System.out.print("In this program, your final grades will be calculated.\n\n");

        //Enter your grades for each assignment
        System.out.println("Please enter the grades you recieved on 5 assignments (out of 100):");
        System.out.print("Please enter your 5 marks here: ");
        num1 = Input.nextInt();
        num2 = Input.nextInt();
        num3 = Input.nextInt();
        num4 = Input.nextInt();
        num5 = Input.nextInt();
        
        //checking if any of the grades are out of range
        System.out.print("\n");
        if (num1<0 || num1>100){
            System.out.println(num1 + " is out of range.");
        }
        if (num2<0 || num2>100){
            System.out.println(num2 + " is out of range.");
        }
        if (num3<0 || num3>100){
            System.out.println(num3 + " is out of range.");
        }
        if (num4<0 || num4>100){
            System.out.println(num4 + " is out of range.");
        }
        if (num5<0 || num5>100){
            System.out.println(num5 + " is out of range.");
        }
        System.out.print("\n");
        //Calculates the average of the assignments
        averageAssignments = (num1 + num2 + num3 + num4 + num5) / 5;

        //Enter your grades from both finals
        System.out.println("Please enter the grades of your 2 exams (out of 100)");
        System.out.print("Exam 1: ");
        exam1 = Input.nextInt();
        System.out.print("Exam 2: ");
        exam2 = Input.nextInt();
        if (exam1 < 0 || exam1 >100){
            System.out.print(exam1 + " is out of range.");
        }
        if (exam2 < 0 || exam2 >100){
            System.out.print(exam2 + " is out of range.");
        }

        //calculates the average of both exams
        averageExams = (exam1 + exam2) / 2;

        //adds both averages together, to produce a final mark
        finalGrade = (averageAssignments * 0.4) + (averageExams * 0.6);

        //Assigning a letter grade to the mark you recieved.
        if (finalGrade >= 80) {
            System.out.println("You got an A (" + finalGrade + ")");
        } else if (finalGrade >= 70) {
            System.out.println("You got a B (" + finalGrade + ")");
        } else if (finalGrade >= 60) {
            System.out.println("You got a C (" + finalGrade + ")");
        } else if (finalGrade >= 50) {
            System.out.println("You got a D (" + finalGrade + ")");
        } else {
            System.out.println("You got an F (" + finalGrade + ")");
        }
    }
}
