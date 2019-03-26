###########################################
# Desc: Print's receipts for record purchases including tax and delivery costs
#
# Author: Zach Slaunwhite
###########################################

#Ready for marking

def main():
    #CONSTANTS
    COST_PER_KILOMETER = 15
    TAX_AMOUNT = 1.14

    print("Hipster's Local Vinyl Records - Customer Order Details\n")

    #input
    # prompts user for customer name
    custName = input("Enter the customer's name: ")
    # prompts the user for the distance of delivery
    distance = float(input("Enter the distance in kilometers for delivery: "))
    # prompts user for the total cost of the purchase
    cost = float(input("Enter the cost of cost of records purchased: "))

    # process

    # calculate the distance multiplied by $15 per kilometer
    distance = distance * COST_PER_KILOMETER
    cost = cost
    # calculating the total cost by multiplying by taxes, then adds the distance cost on top
    totalCost = ((cost * TAX_AMOUNT) + distance)

    # output
    print("\nPurchase summary for {}".format(custName))
    print("Deliver Cost:  ${:.2f}".format(distance))
    print("Purchase Cost: ${:.2f}".format(cost))
    print("Total cost:    ${:.2f}".format(totalCost))
    

#PROGRAM STARTS HERE. DO NOT CHANGE THIS CODE.
if __name__ == "__main__":
    main()