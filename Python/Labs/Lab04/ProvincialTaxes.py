###########################################
# Desc: Enter application description here.
#
# Author: Enter name here.
###########################################

def main():
    # Constants
    GST = 1.05
    HARMONIZED_TAX = 1.15
    # PROVINCIAL_TAX will be added onto GST to bring tax to 1.11 
    PROVINCIAL_TAX = 0.06
    #addTax is false by default, and set later on if conditions are met
    addTax = False
    continueProgram = True


    # Input
    while continueProgram:
        purchaseCost = float(input("Please enter the cost of your purchase: "))
        customerCountry = input("Please enter the country you are from: ")
        

        # Process
        totalCost = purchaseCost
        tax = 0
        customerCountry = customerCountry.lower()
        #adding tax if the country is canada
        if customerCountry == "canada":
            addTax = True

        if addTax:
            customerProvince = input("Please enter what province you are from: ")

            #if province is alberta, set tax to 5% and calculate total cost
            if customerProvince == "alberta":
                tax = GST
            #if the province is ontario, new brunswick, or nova scotia, set tax to 15% and calculate total cost
            elif customerProvince == "ontario" or customerProvince == "new brunswick" or customerProvince == "nova scotia":
                tax = HARMONIZED_TAX
        
            #if the province is not any of the provinces listed above, set tax to 11% and calculate total cost
            else:
                tax = GST + PROVINCIAL_TAX
            totalCost = purchaseCost * tax

            #changing tax from decimal to percentage
            tax = (tax - 1) * 100

        # Output
        print("\nYour total cost is ${:.2f}".format(totalCost))
        print("Tax was {:.0f}%\n".format(tax))


        #prompting user if they would like to run the program again
        userContinue = input("Would you like to run this program again? (Yes/no): ")
        userContinue = userContinue.lower()
        if userContinue != "yes":
            continueProgram = False

#PROGRAM STARTS HERE. DO NOT CHANGE THIS CODE.
if __name__ == "__main__":
    main()