"""
Student Name:  Ronan O'Driscoll  
Program Title:  Energy Calculator - BROKEN
Description:   Debugging practice
"""

def main(): #<-- Don't change this line!
    #constants
    #kwh price is in cents, not dollars.
    kwhPrice = 0.1265
    avgDaysInAMonth = 30.42
    monthsInYear = 12
    kiloWattsConverted = 1000

    print("Energy Calculator")
    print("\nThis program will calculate how much you pay for electricity for")
    print("a particular device, based on the wattage of the device and how")
    print("many hours the device was in use.")
    print("\nCalculations are based on a cost of 12.65 cents per kiloWatt hour.")


    deviceWattage = float(input("\nEnter the wattage of the device: "))
    hoursUsedPerDay = float(input("Enter how many hours per day the device is in use: "))

    #got rid of the magic numbers
    #moved kwhPerDay up so it calculates before cost
    
    costPerHour = (deviceWattage /kiloWattsConverted) * kwhPrice
    #costPerDay is kwhperday multiplied by cost
    costPerDay = hoursUsedPerDay * costPerHour
    costPerMonth = avgDaysInAMonth * costPerDay 
    costPerYear = monthsInYear * costPerMonth
    kwhPerDay = (deviceWattage /kiloWattsConverted) * hoursUsedPerDay
    

    print("\nElectrical cost for a device using {0:.2f} watts for {1} hour per day:".format(deviceWattage, hoursUsedPerDay))
    print("\tCost Per Hour:\t${0:.4f}".format(costPerHour))
    print("\tCost Per Day:\t${0:.4f}".format(costPerDay))
    print("\tCost Per Month:\t${0:.5f}".format(costPerMonth))
    #changed to cost per year
    print("\tCost Per Year:\t${0:.2f}".format(costPerYear))
    print("\tkWh Per Day:\t{0:.2f}".format(kwhPerDay))

    #Your code ends on the line above

#Do not change any of the code below!
if __name__ == "__main__":
    main()