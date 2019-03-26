###########################################
# Desc: Converts Imperial measurements into metric measurements
#
# Author: Zach Slaunwhite
###########################################

#Ready for marking

def main():
    # CONSTANTS
    TONSCONVERTED = 35840
    STONESCONVERTED = 224
    POUNDSCONVERTED = 16
    KILOSCONVERTED = 35.274
    # example of unit converter is meters to kilo meters
    UNITCONVERTER = 1000

    print("Imperial To Metric Conversion\n")

    # Input
    # prompt user for the input of imperial measurements
    inputTons = float(input("Enter the number of tons: "))
    inputStone = float(input("Enter the number of stone: "))
    inputPounds = float(input("Enter the number of pounds: "))
    inputOunces = float(input("Enter the number of ounces: "))

    
    # Process
    # convert all values into ounces to unify the variables

    # formula given for ounces conversion is totalOunces = 35840 * inputTons + 224 * inputStone + 16 * inputPounds + inputOunces
    totalOunces = TONSCONVERTED * inputTons + STONESCONVERTED * inputStone + POUNDSCONVERTED * inputPounds + inputOunces
    # divide total ounces by 35.274 for kilos // totalKilos = totalOunces/35.274
    totalKilos = totalOunces/KILOSCONVERTED
<<<<<<< HEAD
    #take the remainder of the kilos to get the kilo amount
    kiloRemainder = totalKilos %1000
    #take the metric tons value
    metricTons = int(totalKilos/1000)
    #take the remainder of the kilograms, multiply by 1000 to get left over grams
    gramsRemainder = (kiloRemainder%1) * 1000
    #cast remainder to int
=======
    # take the remainder of the kilos to get the kilo amount
    kiloRemainder = totalKilos%UNITCONVERTER
    # take the metric tons value
    metricTons = int(totalKilos/UNITCONVERTER)
    # take the remainder of the kilograms, multiply by 1000 to get left over grams
    gramsRemainder = (kiloRemainder%1) * UNITCONVERTER
    # cast remainder to int
>>>>>>> 093b776cb98442ab2ef8ff29c17fd20c6815576e
    kiloRemainder = int(kiloRemainder)
 
    
    # Output receipt
    print("\nThe metric weight is {} metric tons, {} kilos, and {} grams".format(str (metricTons), str(kiloRemainder), str(round(gramsRemainder,1))))

#PROGRAM STARTS HERE. DO NOT CHANGE THIS CODE.
if __name__ == "__main__":
    main()
