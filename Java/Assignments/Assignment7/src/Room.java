/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zach slaunwhite (A00385522)
 */
public class Room {

    //constants
    private static final int MAX_BUILDING_LEN = 3;
    private static final int DEFAULT_ROOM_NUMBER = 0;
    private static final int MINIMUM_CAPACITY = 1;
    private static final String DEFAULT_BUILDING_ID = "TBD";
    private static boolean DEFAULT_IS_COMPUTER_ROOM = false;

    
    String building; // building identification 1-3 letters
    int roomNumber; //room number
    int capacity; //specifies how many persons are allowed
    boolean computerRoom; //indicates whether it's equipped with computers

    
    /**
     * default constructor
     */
    public Room() {
        this(Room.DEFAULT_BUILDING_ID,Room.DEFAULT_ROOM_NUMBER,
                Room.MINIMUM_CAPACITY,Room.DEFAULT_IS_COMPUTER_ROOM);

    }

    /**
     * 2-parameter constructor
     * 
     * @param building
     * @param roomNumber 
     */
    public Room(String building, int roomNumber) {
        this(building,roomNumber,Room.MINIMUM_CAPACITY,Room.DEFAULT_IS_COMPUTER_ROOM);

        
    }

    /**
     * 4-parameter constructor
     * 
     * @param building
     * @param roomNumber
     * @param capacity
     * @param computerRoom 
     */
    public Room(String building, int roomNumber, int capacity, boolean computerRoom) {
        this.building = building;
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.computerRoom = computerRoom;

        if (building.length() == 0) {
            building = this.DEFAULT_BUILDING_ID;
        } else {
            this.building = building.substring(0, Math.min(building.length(), Room.MAX_BUILDING_LEN)).toUpperCase();
        }
        if (roomNumber < 0){
            this.roomNumber = DEFAULT_ROOM_NUMBER;
        }
        if (capacity < MINIMUM_CAPACITY){
            this.capacity = MINIMUM_CAPACITY;
        }
    }

    /**
     * gets the building and sets it to upper case
     * @return 
     */
    public String getBuilding() {
        return building.toUpperCase();
    }

    /**
     * gets the room number
     * @return 
     */
    public int getRoomNumber() {
        return roomNumber;
    }

    /**
     * gets the minimum capacity
     * @return 
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * checks if it is a computer room
     * @return 
     */
    public boolean isComputerRoom() {
        return computerRoom;
        
    }

    /**
     * Sets values for room
     * 
     * @param building
     * @param roomNumber
     * @param capacity
     * @param computerRoom 
     */
    public void setRoom(String building, int roomNumber, int capacity, boolean computerRoom) {
            this.building = building;
        
        if (roomNumber >= 0) {
            this.roomNumber = roomNumber;
        }
        if (capacity > MINIMUM_CAPACITY) {
            this.capacity = capacity;
        }
        if (computerRoom == false) {
            this.computerRoom = computerRoom;
        }
        

    }

    /**
     * changing all variables to string to print out
     * @return 
     */
    @Override
    public String toString() {
        if (computerRoom == true){
            return building + roomNumber + " " + "capactiy: " + capacity + " (computer room)";
        }
        else{
            return building + roomNumber + " " + "capactiy: " + capacity;
        }
        
    }

}
