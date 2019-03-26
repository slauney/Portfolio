/**
 * A class that represents a single truck
 *
 * @author Mark Young
 * @author Yasushi (modified Feb 28. 2015)
 * @modified by Zach Slaunwhite (A00385522)
 */
public class Truck {

    //constants 
    public static final double MIN_TANK_SIZE = 10.0;
    public static final double MIN_CONSUMPTION = 0.01;

    // Truck information (instance constants)
    public final double L_PER_100KM;
    public final double FUEL_CAPACITY;

    // State information (instance variables)
    private double odometer;
    private double fuelLeft;
    
    
    //Unique ID information
    public final String VIN;
    private static int vinNumber = 0001;

    // constructor
    /**
     * Create a Truck with the given fuel tank size and gas consumption.
     *
     * @param tankSize the size of the fuel tank (in litres)
     * @param fuelConsumption the rate of fuel use (in litres per 100 km)
     */
    public Truck(double tankSize, double fuelConsumption) {

        // use given values, or class mimimums
        FUEL_CAPACITY = Math.max(MIN_TANK_SIZE, tankSize);
        L_PER_100KM = Math.max(MIN_CONSUMPTION, fuelConsumption);

        // new Truck starts with no mileage or fuel
        odometer = 0.0;
        fuelLeft = 0.0;
        VIN = String.format("CSCI1226" + "%04d", vinNumber);
        
        vinNumber++;

    }

    // getters
    /**
     * Get the number of kilometres shown on the odometer.
     *
     * @return odometer reading (in km)
     */
    public double getOdometer() {
        return odometer;
    }

    /**
     * Get the amount of fuel left in the tank
     *
     * @return the amount of fuel in the tank (in litres)
     */
    public double getFuelLeft() {
        return fuelLeft;
    }

    /**
     * Get remaining range of this Truck, in km. The range depends on the fuel
     * left in the truck and its fuel rating (litres per 100km):
     * <blockquote>
     * range = 100.0 * (litres of fuel left) / (litres per 100km).
     * </blockquote>
     *
     * @return the range of this truck (in km)
     */
    public double getRange() {
        return 100 * (fuelLeft / L_PER_100KM);
    }

    // other methods (this class has no "setters" per se)
    /**
     * Drive the truck. Will continue the given distance or until run out of
     * fuel.
     *
     * @param distance the distance the client would like to drive
     */
    public void drive(double distance) {
        // calculate & print current range of truck
        double range = this.getRange();

        // update odometer and fuel gauge
        if (distance < range) {
            odometer += distance;
            fuelLeft -= distance * L_PER_100KM / 100.0;
        } else {
            odometer += range;
            fuelLeft = 0.0;
            System.out.println("You ran out of gas!");
        }
    }

    /**
     * Fill the truck with gas.
     *
     * @param pricePerLitre the price per litre for fuel.
     * @return the price to fill the Truck's tank.
     */
    public double fillUp(double pricePerLitre) {
        // calculate cost
        double cost = pricePerLitre * (FUEL_CAPACITY - fuelLeft) / 100.0;

        // fill truck & return cost
        fuelLeft = FUEL_CAPACITY;
        return cost;
    }

    //method that shows the dashboard
    public void showDashBoard() {
        double range = this.getRange();
        System.out.println("Odometer: " + odometer);
        System.out.println("Fuel Left: " + fuelLeft);
        System.out.println("Range: " + range);
    }

}
