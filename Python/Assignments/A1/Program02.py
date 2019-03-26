###########################################
# Desc: Application to calculate weekly payments for a loan
#
# Author: Zach Slaunwhite
###########################################

#Ready for marking

def main():
    # CONSTANTS 
    INTEREST_CONVERTED = 5200
    WEEKS = 52

    print("Weekly Loan Calculator\n")

    # input
    # prompt user for the amount of loan
    loanAmount = float(input("Enter the amount of loan: "))
    # prompt user for interest rate
    interestRate = float(input("Enter the interest rate (%) "))
    # prompt the user for how many years the loan will be paid off in
    totalYears = float(input("Enter the number of years: "))
    
    #process
    # i = interest rate divided by 5200
    i = interestRate/INTEREST_CONVERTED
    # weekly payments = (i / (1-(1+i) **-52(total years))) * loan amount
    weeklyPayment = (i / (1-(1+i)**(-WEEKS * totalYears))*loanAmount)


    # output weekly payment amount
    print("\nYour weekly payment will be: ${:.2f}".format(weeklyPayment))


    

#PROGRAM STARTS HERE. DO NOT CHANGE THIS CODE.
if __name__ == "__main__":
    main()