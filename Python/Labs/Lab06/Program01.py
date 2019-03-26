###########################################
# Desc: sum of numbers 2-100
#
# Author: Zach Slaunwhite
###########################################

def main():
    # Main function for execution of program code.
    # Make sure you tab once for every line.
    additionSum()

    # Input
    # Process
    
    

    
    # Output
    
#adding all the even numbers between 2 and 100, including 2 and 100
def additionSum():
    loopSum = 0
    for x in range(2, 101):
        #if the remainded of x/2 = 0, add to sum
        if (x%2) == 0:
            loopSum += x

    print(loopSum)
#PROGRAM STARTS HERE. DO NOT CHANGE THIS CODE.
if __name__ == "__main__":
    main()



