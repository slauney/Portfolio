import java.util.Scanner;
/**
 * A driver program for the class Car.
 * 
 * @author yasushi akiyama
 */
public class CarDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner kbd = new Scanner(System.in);
        System.out.println("\n\nWill test the class Car");
        System.out.print("\nPress enter to continue...");
        kbd.nextLine();
        
        //create a bunch of them!
        System.out.println("------------------------------------");
        System.out.print("\n\nTesting object creations:\n");
        Car c1 = new Car(5.6, 2.3);//valid coordinate
        Car c2 = new Car(-98.2, -5);//valid
        Car c3 = new Car(-150, 0);//invalid
        Car c4 = new Car(100.,220);//invalid
        Car c5 = new Car(120,220);//invalid
        System.out.println(" ... OK!");
        System.out.print("\nPress enter to continue...");
        kbd.nextLine();
        

        //testing getters
        System.out.println("------------------------------------");
        System.out.println("\n\nTesting constructors and getters:\n");
        System.out.println("C1 should be (5.6, 2.3): " 
                + c1.getX() + ", " + c1.getY());
        System.out.println("C2 should be (-98.2, -5.0): " 
                + c2.getX() + ", " + c2.getY());
        System.out.println("C3 should be (0.0, 0.0): " 
                + c3.getX() + ", " + c3.getY());
        System.out.println("C4 should be (0.0, 0.0): " 
                + c4.getX() + ", " + c4.getY());
        System.out.println("C5 should be (0.0, 0.0): " 
                + c5.getX() + ", " + c5.getY());
        System.out.print("\nPress enter to continue...");
        kbd.nextLine();

        
        //testing isValidCoordinate()
        System.out.println("------------------------------------");
        System.out.println("\n\nTesting the isValidCoordinate() method:\n");
        System.out.println(Car.isValidCoordinate(98, 199.5) 
                + " (should be true)");
        System.out.println(Car.isValidCoordinate(-101, .5) 
                + " (should be false)");
        System.out.println(Car.isValidCoordinate(101, 5) 
                + " (should be false)");
        System.out.println(Car.isValidCoordinate(98, 200.01) 
                + " (should be false)");
        System.out.println(Car.isValidCoordinate(98, -200.01) 
                + " (should be false)");
        System.out.print("\nPress enter to continue...");
        kbd.nextLine();

        
        
        //testing the setter
        System.out.println("------------------------------------");
        System.out.println("\n\nTesting the setter:\n");
        System.out.println("C1(before) should be (5.6, 2.3): " 
                + c1.getX() + ", " + c1.getY());
        
        //now use invalid coordinate
        c1.setCoordinate(-120, 0);
        System.out.println("C1(after) should be still (5.6, 2.3): " 
                + c1.getX() + ", " + c1.getY());
        c1.setCoordinate(-98.5, 5000);
        System.out.println("C1(after) should be still (5.6, 2.3): " 
                + c1.getX() + ", " + c1.getY());
        c1.setCoordinate(120, -300);
        System.out.println("C1(after) should be still (5.6, 2.3): " 
                + c1.getX() + ", " + c1.getY());
        
        //now a valid one
        c1.setCoordinate(-98.5, 199.78567);
        System.out.println("C1(after) should be now changed to "
                + "(-98.5, 199.78567): " 
                + c1.getX() + ", " + c1.getY());
        
        //now change c5 to have the same coordinate as c1
        c5.setCoordinate(c1.getX(), c1.getY());
        System.out.println("C5(new) should be now changed to "
                + "(-98.5, 199.78567): " 
                + c5.getX() + ", " + c5.getY());
        
        System.out.print("\nPress enter to continue...");
        kbd.nextLine();
        
        
        
        //testing toString()
        System.out.println("------------------------------------");
        System.out.println("\n\nTesting the toString() method:\n");
        System.out.println("Here's the correct output:\n");
        System.out.println("Car # 1 at x:-98.5 y:199.78567\n" +
                "Car # 2 at x:-98.2 y:-5.0\n" +
                "Car # 3 at x:0.0 y:0.0\n" +
                "Car # 4 at x:0.0 y:0.0\n" +
                "Car # 5 at x:-98.5 y:199.78567\n");
        System.out.println("****\n\nNow your output:\n");
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);        
        System.out.println(c4);        
        System.out.println(c5);        
        System.out.print("\n\nPress enter to continue...");
        kbd.nextLine();
        
        
        //testing collidesWith()
        System.out.println("------------------------------------");
        System.out.println("\n\nTesting the collidesWith() method:\n");
        
        //change c2'x to be the same as c1's
        c2.setCoordinate(c1.getX(), c2.getY());
        System.out.println(c1.collidesWith(c2) + " (should be false)");
        
        //set both the same
        c2.setCoordinate(c1.getX(), c1.getY());
        System.out.println(c1.collidesWith(c2) + " (should be true)");
        
        
        //change c3'y to be the same as c1's
        c3.setCoordinate(c3.getX(), c1.getY());
        System.out.println(c1.collidesWith(c3) + " (should be false)");
        
        //set both the same
        c3.setCoordinate(c1.getX(), c1.getY());
        System.out.println(c1.collidesWith(c3) + " (should be true)");
        
        
    }
    
}
