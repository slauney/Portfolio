import java.util.Scanner;

/**
 * A class to test the Truck class.
 *
 * @author Mark Young
 * @author Yasushi (modified Feb 28. 2015)
 */

public class TestDrive {
    public static void main(String[] args) {
        // create variables
        Scanner kbd = new Scanner(System.in);
        Truck myTruck = new Truck(45.0, 7.5);
        double trip, price, cost;

        // introduce yourself
        System.out.println("This program tests the Truck instance methods "
            + "that I have provided you, "
            + "and also\nthe ones I'll have you create.");
        System.out.print("Press ENTER to continue...");
        kbd.nextLine();
        
        

        // Get ready for the trip
        System.out.print("How much is gas "
            + "(in cents per litre) "
            + "at the dealership? ");
        price = kbd.nextDouble();
        kbd.nextLine();
        System.out.printf("\n"
            + "It costs you $%4.2f to fill your truck.\n\n",
            myTruck.fillUp(price));
        System.out.print("Press ENTER to continue...");
        kbd.nextLine();
        
        

        
        ////uncomment the following lines for Activity 2        
        // get the trip parameters
        System.out.printf("Your truck has a range of %3.1fkm.\n", 
            myTruck.getRange());
        
        System.out.print("How far do you want to drive? ");
        trip = kbd.nextDouble();
        kbd.nextLine();

        // take the trip
        myTruck.drive(trip);
        System.out.println("\nAt the end of the trip your dash board reads:");
        myTruck.showDashBoard();
        System.out.print("Press ENTER to continue...");
        kbd.nextLine();

        // fill up again
        System.out.print("How much is gas "
            + "(in cents per litre) "
            + "out here? ");
        price = kbd.nextDouble();
        kbd.nextLine();
        System.out.printf("\n"
            + "It costs you $%4.2f to fill your truck.\n\n",
            myTruck.fillUp(price));
        System.out.print("Press ENTER to continue...");
        kbd.nextLine();

        System.out.println("Test drive over.");
        
    }
}

