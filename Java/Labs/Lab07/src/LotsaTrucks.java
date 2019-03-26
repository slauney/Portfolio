/**
 * A program to create lots of Trucks with VINs
 *
 * @author Mark Young
 * @author Yasushi (modified Feb 28. 2015)
 */

public class LotsaTrucks {
    public static void main(String[] args) {
        // create a few trucks
        Truck truck1 = new Truck(45.0, 7.5);
        Truck truck2 = new Truck(45.0, 6.8);
        Truck truck3 = new Truck(40.0, 6.2);

        // create a few more trucks
        for (int i = 4; i <= 53; i++) {
            Truck truckToForget = new Truck(65.0, 11.4);
        }

        // create one more truck
        Truck truck54 = new Truck(50.0, 8.4);

        // print out some VINs
        System.out.println("\n\n"
            + "Lots of Trucks\n"
            + "------------\n\n"
            + "Truck #1's VIN is " + truck1.VIN + "\n"
            + "Truck #2's VIN is " + truck2.VIN + "\n"
            + "Truck #3's VIN is " + truck3.VIN + "\n"
            + "Truck #54's VIN is " + truck54.VIN + "\n");
    }
}

