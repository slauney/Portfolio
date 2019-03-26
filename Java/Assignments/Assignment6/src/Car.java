/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author zach slaunwhite (A00385522)
 */
public class Car {

    private double x;//variable of x
    private double y;//variable of y
    private final int carNumber;//Car ID number
    private static int numOfCars = 1;//number of cars
    
    
    //constants
    private static final int MAX_X = 100;
    private static final int MIN_X = -100;
    private static final int MAX_Y = 200;
    private static final int MIN_Y = -200;
    
    /**
     * Constructor.
     * 
     * @param x
     * @param y
     */
    public Car(double x, double y){
        this.x = x;
        this.y = y;
        carNumber = numOfCars;
        numOfCars++;
        
        //checking validity
        if (x > MAX_X || x < MIN_X){
            this.x= 0;
            this.y= 0;
        }
        if (y > MAX_Y || y < MIN_Y){
            this.y= 0;
            this.x= 0;
        }
        
    }
    /**
     * returns the value of x
     * @return 
     */
    public double getX(){
        return x;
    }
    /**
     * returns the value of y
     * @return 
     */
    public double getY(){
        return y;
    }
    /**
     * sets x and y
     * @param x
     * @param y 
     */
    public void setCoordinate(double x, double y){
        if (x < MAX_X && x > MIN_X && y < MAX_Y && y > MIN_Y){         
        this.x = x;        
        this.y = y;
        }
    }
    
    
    /**
     * compares cars x and y with otherCar to see if they are the same
     * @param otherCar
     * @return 
     */
    public boolean collidesWith(Car otherCar){
        return this.x == otherCar.x && this.y == otherCar.y;
        
    }
    /**
     * checks to see if coordinates are valid for x and y
     * @param x
     * @param y
     * @return 
     */
    public static boolean isValidCoordinate(double x, double y){
        return MIN_X<=x && x<= MAX_X && MIN_Y<=y && y<= MAX_Y;
        
        
    }
    
    /**
     * changes carNumber, x, and y to string
     * @return 
     */
    @Override
    public String toString(){
        return "Car # " + carNumber + " at x:" + this.x + " y:" + this.y;
        
     
    }
    
    
}
