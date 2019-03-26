###########################################
# Desc: Highest Common Divisor
#
# Author: Zach Slaunwhite
###########################################

def main():
    #initialize the continue condition 
    continueLoop = "y"
    #while continue loop is equal to y, repeat the program
    while(continueLoop == "y"):
        #get the first number from the user
        num1 = input("Enter the first number: ")
        #if the input is not a number, ask the user until it is a number
        while (not num1.isnumeric()):
            print("ERROR! Enter a valid first number.")
            num1 = input("Enter the first number: ")
        #cast the input to an int (this is because we cannot initialize the input as an int, or else the while loop wouldn't work)
        num1 = int(num1)
        
        #get the second number from the user
        num2 = input("Enter the second number: ")
        #if the input is not a number, ask the user until it is a number
        while (not num2.isnumeric()):
            print("ERROR! Enter a valid second number.")
            num2 = input("Enter the second number: ")
        #cast the input to an int 
        num2 = int(num2)

        #sort the min and max numbers (could use sort() instead?)
        minNumber = min(num1, num2)
        maxNumber = max(num1, num2)
        #calling highest divisor function and catching the result
        highestDivisor = getHighestCommonDivisor(minNumber, maxNumber)

        
        print("The Highest Common Divisor of {} and {} is {}.\n".format(num1, num2, highestDivisor))

        #ask user to repeat program
        continueLoop = input("Would you like to try again? (y/n)").lower()
    #End message once loop is exited
    print("\nThank you for using HCD program.")

#this function is to get the highest common divisor of two numbers
def getHighestCommonDivisor(num1, num2):
    #initialize variable for checking if there is a remainder
    noRemainder = 0
    rangeOffSet = 1
    #initialize highest divisor
    highestDivisor = 0
    #loop to go through all possible divisors
    for x in range(num1 + rangeOffSet):
        #if the number is 0, continue (cannot divide by 0 or it breaks program)
        if x == 0:
            continue
        #if the lowest number divided by x has no remainder, continue to second if statement
        if (num1 % x) == noRemainder:
            #if the highest number divided by x has no remainder, set highest divisor to x
            if (num2 % x) == noRemainder:
                highestDivisor = x
    #returns the highest divisor
    return highestDivisor
if __name__ == "__main__":
    main()