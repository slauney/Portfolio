/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author zach slaunwhite (A00385522)
 */
public class DrawRectangle {

    public static final int MAX_WIDTH = 20;
    public static final int MAX_LENGTH = 20;
    public static final int MIN_SIDE = 1;
    public static final int MIN_HOLLOW = 3;
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);

        String repeat = "yes";
        //description of program
        System.out.println("In this program, you will create a rectangle of symbols, "
                + "with the length and width of your choice");

        //loop
        while (repeat.equalsIgnoreCase("yes")) {

            System.out.println("\nPress enter to continue...");
            kbd.nextLine();//pressing enter allows you to continue

            System.out.print("Would you like to make a solid or hollow rectangle?: ");
            String answer = kbd.next();

            switch (answer) {
                //if user chose hollow rectangle, it makes the rectangle hollow
                case "hollow":

                    //setting the width
                    System.out.print("Please enter the width of the rectangle between " + MIN_HOLLOW
                            + " and " + MAX_WIDTH + ": ");
                    int width = kbd.nextInt();
                    while (width < MIN_HOLLOW || width > MAX_WIDTH) {
                        System.out.print("Width = " + width + " is invalid. Try again: ");
                        width = kbd.nextInt();
                    }
                    //setting the length
                    System.out.print("Please enter the length of the rectangle between "
                            + MIN_HOLLOW + " and " + MAX_LENGTH + ": ");
                    int length = kbd.nextInt();
                    while (length < MIN_HOLLOW || length > MAX_LENGTH) {
                        System.out.print("Length = " + length + " is invalid. Try again: ");
                        length = kbd.nextInt();
                    }
                    kbd.nextLine();//tidy up

                    //repeats length and width to user
                    System.out.println("\nWidth: " + width + "\nLength: " + length);
                    System.out.println("Please enter a character you want to make a rectangle with: ");
                    char symbol = kbd.next().charAt(0);//gets the symbol for rectangle
                    System.out.println();

                    kbd.nextLine();//clean up the scanner
                    System.out.println("Press enter to continue...");
                    kbd.nextLine();//pressing enter allows you to continue

                    //creates the rectangle hollow
                    int row = 1;
                    while (row <= length) {
                        int col = 1;
                        while (row == 1 || row == length) {
                            while (col <= width) {
                                System.out.print(symbol);
                                col++;
                            }
                            System.out.println();
                            row++;
                        }
                        //While the row is neither 1 or equal to length, it makes the space hollow
                        while (row > 1 && row < length) {
                            col = 1;
                            while (col == 1) {
                                System.out.print(symbol);
                                col++;
                            }
                            //while the colomn is between 1 and the width, it makes the middle hollow
                            while (col > 1 && col < width) {
                                System.out.print(" ");
                                col++;
                            }
                            //catchs last spot, and closes the rectangle
                            if (col == width) {
                                System.out.print(symbol);

                            }
                            System.out.println();
                            row++;
                        }

                    }

                    //ask to make another rectangle
                    System.out.print("Would you like to make another rectangle? \nType [YES] or [NO]\n");
                    repeat = kbd.next();
                    kbd.nextLine();

                    //catches any typos
                    while (!repeat.equalsIgnoreCase("no") && !repeat.equalsIgnoreCase("yes")) {
                        System.out.print("Your choice was invalid, please say again: ");
                        repeat = kbd.next();
                        kbd.nextLine();
                    }
                    break;
                case "solid":
                    //setting the width
                    System.out.print("Please enter the width of the rectangle between "
                            + MIN_SIDE + " and " + MAX_WIDTH + ": ");
                    width = kbd.nextInt();
                    while (width < MIN_SIDE || width > MAX_WIDTH) {
                        System.out.print("Width = " + width + " is invalid. Try again: ");
                        width = kbd.nextInt();
                    }
                    //setting the length
                    System.out.print("Please enter the length of the rectangle between "
                    + MIN_SIDE + " and " + MAX_WIDTH + ": ");
                    length = kbd.nextInt();
                    while (length < MIN_SIDE || length > MAX_LENGTH) {
                        System.out.print("Length = " + length + " is invalid. Try again: ");
                        length = kbd.nextInt();
                    }
                    kbd.nextLine();//tidy up

                    //repeats length and width to user
                    System.out.println("\nWidth: " + width + "\nLength: " + length);
                    System.out.println("Please enter a character you want to make a rectangle with: ");
                    symbol = kbd.next().charAt(0);//gets the symbol for rectangle
                    System.out.println();

                    kbd.nextLine();//clean up the scanner
                    System.out.println("Press enter to continue...");
                    kbd.nextLine();//pressing enter allows you to continue

                    //creates the rectangle
                    row = 1;
                    //while the row is less than the users choice of length
                    while (row <= length) {
                        int col = 1;
                        //while the colomn is less than the users choice of width
                        while (col <= width) {
                            //prints out the symbol of choice
                            System.out.print(symbol);
                            //adds one to the colomn, to continue adding symbol
                            col++;
                        }
                        //goes to next line
                        System.out.println();
                        row++;
                    }

                    //ask to make another rectangle
                    System.out.print("Would you like to make another rectangle? \nType [YES] or [NO]\n");
                    repeat = kbd.next();
                    kbd.nextLine();

                    //catches any typos
                    while (!repeat.equalsIgnoreCase("no") && !repeat.equalsIgnoreCase("yes")) {
                        System.out.print("Your choice was invalid, please say again: ");
                        repeat = kbd.next();
                        kbd.nextLine();
                    }
                    break;
                default:
                    System.out.print("That is an invalid choice");
                    break;
            }
        }

        System.out.println("Goodbye!");

    }

}
