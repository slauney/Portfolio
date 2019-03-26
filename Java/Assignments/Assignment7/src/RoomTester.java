import java.util.Scanner;

/**
 * A driver for class Room.
 * @author yasushi akiyama
 */
public class RoomTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner kb = new Scanner(System.in);
        System.out.println("Will test a class Room:");
        
        System.out.print("Press ENTER to continue...");kb.nextLine();
        System.out.print("\n\n");
       
        

        System.out.println("----------------------------");
        System.out.println("Checking the constructors:");
        System.out.println("----------------------------\n");
        //default constructor
        Room r1 = new Room("la",178,200,false);
        
        //4-param constructor, bad number, bad capacity
        Room r2 = new Room("should be truncated to 3 letters",-155,-300,true);
        
        //2-param constructor, bad building and number
        Room r3 = new Room("",-3);
        
        //4-param, bad number, bad capacity, computer room
        Room r4 = new Room("sb",-155,-200,true);

        
        System.out.print("OK...\n\n");
        System.out.print("Press ENTER to continue...");kb.nextLine();
        System.out.print("\n\n");
       
        

        
        //getters
        System.out.println("----------------------------");
        System.out.println("Checking the getters:");
        System.out.println("----------------------------\n");
        
        System.out.println(r1.getBuilding() + "  (should print \"LA\")");
        System.out.println(r2.getBuilding() + "  (should print \"SHO\")");
        System.out.println(r3.getBuilding() + "  (should print \"TBD\")");
        System.out.println(r4.getBuilding() + "  (should print \"SB\")\n\n");
        
        System.out.println(r1.getRoomNumber() + "  (should print \"178\")");
        System.out.println(r2.getRoomNumber() + "  (should print \"0\")");
        System.out.println(r3.getRoomNumber() + "  (should print \"0\")");
        System.out.println(r4.getRoomNumber() + "  (should print \"0\")\n\n");
        
        System.out.println(r1.getCapacity() + "  (should print \"200\")");
        System.out.println(r2.getCapacity() + "  (should print \"1\")");
        System.out.println(r3.getCapacity() + "  (should print \"1\")");
        System.out.println(r4.getCapacity() + "  (should print \"1\")\n\n");
        
        System.out.println(r1.isComputerRoom() + "  (should print \"false\")");
        System.out.println(r2.isComputerRoom() + "  (should print \"true\")");
        System.out.println(r3.isComputerRoom() + "  (should print \"false\")");
        System.out.println(r4.isComputerRoom() + "  (should print \"true\")\n\n");
        
        
        
        System.out.print("Press ENTER to continue...");kb.nextLine();
        System.out.print("\n\n");
       
        

        
        //setters
        System.out.println("----------------------------");
        System.out.println("Checking the setters:");
        System.out.println("----------------------------\n");
        
        //this should not change the existing values!
        r1.setRoom(r1.getBuilding(), -5, -5, r1.isComputerRoom());
        System.out.println(r1.getBuilding() + "  (should print \"LA\")");
        System.out.println(r1.getRoomNumber() + "  (should print \"178\")");
        System.out.println(r1.getCapacity() + "  (should print \"200\")");
        System.out.println(r1.isComputerRoom() + "  (should print \"false\")\n\n");
        
        //this should change only the capacity and computer room!
        r2.setRoom(r2.getBuilding(), -5, 255, !r2.isComputerRoom());
        System.out.println(r2.getBuilding() + "  (should print \"SHO\")");
        System.out.println(r2.getRoomNumber() + "  (should print \"0\")");
        System.out.println(r2.getCapacity() + "  (should print \"255\")");
        System.out.println(r2.isComputerRoom() + "  (should print \"false\")\n\n");
        
        //this should change the building and the room number!
        r3.setRoom("SCI", 122, -500, r3.isComputerRoom());
        System.out.println(r3.getBuilding() + "  (should print \"SCI\")");
        System.out.println(r3.getRoomNumber() + "  (should print \"122\")");
        System.out.println(r3.getCapacity() + "  (should print \"1\")");
        System.out.println(r3.isComputerRoom() + "  (should print \"false\")\n\n");
        
        System.out.print("Press ENTER to continue...");kb.nextLine();
        System.out.print("\n\n");
        
        
        //toString()
        System.out.println("----------------------------");
        System.out.println("Checking the toString():");
        System.out.println("----------------------------\n");
        System.out.println(r1 + "  (should print \"LA178 capacity: 200\")");
        System.out.println(r2 + "  (should print \"SHO0 capacity: 255\")");
        System.out.println(r3 + "  (should print \"SCI122 capacity: 1\")");
        System.out.println(r4 
                + "  (should print \"SB0 capacity: 1 (Computer room) \")");
        
    }
    
}
