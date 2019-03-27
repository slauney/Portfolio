import java.util.Scanner;

/**
 *
 * @author zach slaunwhite (A00385522)
 */
public class Assignment4Modified {

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

            //setting the width
            System.out.print("Please enter the width of the rectangle (1-20): ");
            int width = kbd.nextInt();
            while (width <= 0 || width > 20) {
                System.out.print("Width = " + width + " is invalid. Try again: ");
                width = kbd.nextInt();
            }
            //setting the length
            System.out.print("Please enter the length of the rectangle (1-20): ");
            int length = kbd.nextInt();
            while (length <= 0 || length > 20) {
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

            //creates the rectangle
            int row = 1;
            while (row <= length) {
                int col = 1;
                while (col <= width) {
                    System.out.print(symbol);
                    col++;
                }
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

        }

        System.out.println("Goodbye!");

    }

}
