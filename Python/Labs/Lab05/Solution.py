#Paint Shop Calculator
#Program to calculate the number of gallons of paint required to paint a room, if provided the room dimensions

#Import the math class, for using ceiling rounding
import math

#Declare variable for # of sq. ft. covered by one gallon of paint
global square_feet_per_gallon
square_feet_per_gallon = 150.5
global length, width, height
length = float(input("\nEnter the length of the room, in feet: "))
width = float(input("Enter the width of the room, in feet: "))
height = float(input("Enter the height of the room, in feet: "))

def main():
    #Intro messages
    introMessage()
    paintArea(length, width, height)
    output()

def introMessage():
    print("Welcome to the Paint Shop!")
    print("This program will help you calculate how many cans of paint you need to buy, based on the dimensions of your room.")

def paintArea(length, width, height):
    totalArea = (length * height * 2) + (width * height * 2)
    return totalArea

def paintNeeded(totalPaint):   
    gallons_of_paint = math.ceil(totalPaint / square_feet_per_gallon)
    return gallons_of_paint

def output():
    totalArea = paintArea(length, width, height)
    print("\nThe total wall area of your room is {} square feet.".format(totalArea))
    print("You will need {} gallon(s) of paint. \n\nHappy Painting!".format(paintNeeded(totalArea)))

if __name__ == "__main__":
    main()













