###########################################
# Desc: Calculates the total amount of tax withheld from an employee's weekly salary (income tax?)
#
# Author: Zach Slaunwhite
###########################################

def main():
    # Main function for execution of program code.
    # Make sure you tab once for every line.

    # Input
    #prompt user for pre-tax weekly salary amount, and the number of dependants they wish to claim
    salaryAmount = float(input("Please enter the full amount of your weekly salary: $"))
    totalDependants = int(input("How many dependants do you have?: "))


    # Process

    #program calculates the provincial tax withheld, the federal tax withheld, the total tax withheld, and the users take home amount
    #provincial tax: 6.0%
    provTaxWithheld = salaryAmount*0.06
    #federal tax: 25.0%
    fedTaxWithheld = salaryAmount*0.25
    #deduction amount: 2.0% of salary per dependant
    taxDeduction = salaryAmount * (totalDependants * 0.02)
    #calculate total tax withheld
    totalTaxWithheld = provTaxWithheld + fedTaxWithheld - taxDeduction
    #calculate total take home pay
    takeHomePay = salaryAmount - totalTaxWithheld

    # Output
    print("Provincial Tax Withheld ${:.2f}".format(provTaxWithheld))
    print("Federal Tax Withheld ${:.2f}".format(fedTaxWithheld))
    print("Dependant deduction for {} dependants: {:.2f}".format(totalDependants, taxDeduction))
    print("Total Withheld: ${:.2f}".format(totalTaxWithheld))
    print("Total Take-Home Pay: ${:.2f}".format(takeHomePay))
    
    

#PROGRAM STARTS HERE. DO NOT CHANGE THIS CODE.
if __name__ == "__main__":
    main()





