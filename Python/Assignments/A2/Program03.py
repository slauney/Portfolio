###########################################
# Desc: Calculates car insurance cost based on gender and age (seems kinda sexist)
# Ready for marking
# Author: Zach Slaunwhite
###########################################

def main():
    # Main function for execution of program code.
    # Make sure you tab once for every line.

    # Input
    #prompt user for input on gender, age, and price of vehicle respectively
    profOak = input("\nAre you 'Male' or 'Female': ").lower() #pokemon joke, please ignore my var name on this one
    age = int(input("\nEnter your age: "))
    carPrice = float(input("\nEnter the purchase price of the vehicle: "))


    # Process
    #calling upon the insurance multiplier function to calculate the monthly insurance cost
    costMult = insuranceMultiplier(profOak, age)

    # Output
    #calls upon the totalCost function inside the .format() to get the final price
    print("\nYour monthly insurance will be ${:.2f}".format(totalCost(carPrice, costMult)))

def insuranceMultiplier(sex, age):
    #defining months in a year as constant
    monthsInYear = 12
    #initializing insurance cost to 0
    insuranceCost = 0
    #setting male boolean to true
    isMale = True
    #checking if female and setting to correct value
    if sex == "female":
        isMale = False
       
    #checking age and assigning insurance price appropriately 
    if age >= 15 and age < 25:
        if isMale:
            #insurance % is 25, divided by months is a year
            insuranceCost = 0.25 / monthsInYear
        elif isMale == False:
            #insurance % is 20, divided by months is a year
            insuranceCost = 0.20 / monthsInYear
    elif age >= 25 and age < 40:
        if isMale:
            #insurance % is 17, divided by months is a year
            insuranceCost = 0.17 / monthsInYear
        elif isMale == False:
            #insurance % is 15, divided by months is a year
            insuranceCost = 0.15 / monthsInYear
    elif age >= 40 and age < 70:
        #insurance % is 10, divided by months is a year
        insuranceCost = 0.10 / monthsInYear
    return insuranceCost
            
def totalCost(carPrice, multiplier):
    #car price * multiplier from insuranceMultiplier function
    cost = carPrice * multiplier
    return cost

#PROGRAM STARTS HERE. DO NOT CHANGE THIS CODE.
if __name__ == "__main__":
    main()