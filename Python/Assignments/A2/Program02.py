###########################################
# Desc: Calculating data usage and cost
# Ready for marking
# Author: Zach Slaunwhite
###########################################

def main():
    # Main function for execution of program code.
    # Make sure you tab once for every line.

    # Input
    #prompt user for amount of data used
    dataUsage = float(input("\nEnter data usage (Mb): "))

    # Process
    #calculating the total cost based on data used
    totalCost = dataCost(dataUsage)

    # Output
    print("\nTotal charge is ${:.2f}".format(totalCost))

def dataCost (data):
    #using magic numbers as it seems redundant and unnecessary 
    #returning flat rate of $20 if usage is 200 mb or below
    if data <= 200:
        return 20

    #returning a rate of charge based on usage between 200 and 500
    elif data > 200 and data <= 500:
        return data * 0.105
    #returning a rate of charge based on usage between 500 and 1000
    elif data > 500 and data <=1000:
        return data * 0.110
    #returning a flat rate of $118 if usage is over 1000
    elif data > 1000:
        return 118
    #return 0 to catch errors
    else:
        return 0



#PROGRAM STARTS HERE. DO NOT CHANGE THIS CODE.
if __name__ == "__main__":
    main()