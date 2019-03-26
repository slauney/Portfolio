###########################################
# Desc: number of hours worked in a work week of 5 days
# Ready for marking
# Author: Zach Slaunwhite w0414242
###########################################

def main():
    #number of days worked is constant as 5
    numOfDaysWorked = 5
    #calling each function to get the employee hours, max hours worked that week, and the total hours
    employeeHours = daysWorked(numOfDaysWorked)
    maxHours(employeeHours, numOfDaysWorked)
    totalHours = totalHoursWorked(employeeHours, numOfDaysWorked)

    #getting the average of hours worked by dividing total by 5
    average = totalHours/numOfDaysWorked
    print("The total number of hours worked was: {}".format(int(totalHours)))
    print("The average number of hours worked each day was {}".format(average))

    #function to see which days were slacked
    slackedOff(employeeHours, numOfDaysWorked)

#function for creating a list of hours worked
def daysWorked(num1):
    rangeOffSet = 1
    #initialize list
    numOfHoursWorked = []
    #loop to append hours worked to list for each day
    for x in range(num1):
        numOfHoursWorked.append(int(input("Enter hours worked on day #{}: ".format(x + rangeOffSet))))
    #return the list of hours worked
    return numOfHoursWorked

#function to get the max hours worked
def maxHours(list1, hours):
    #initialize offset
    rangeOffSet = 1
    print("-" * 100 + "\nThe most hours you worked was on:")
    #loop to check each day to find the most hours worked
    for x in range(hours):
        maxHours = max(list1)
        #if the hours worked that day equal the max hours, print it
        if list1[x] == maxHours:
            print("Day #{} when you worked {} hours".format((x + rangeOffSet), maxHours))

#function to get the total hours worked
def totalHoursWorked(list1, hours):
    print("-" * 100)
    #initialize average as 0
    average = 0
    #loop to add all the hours worked
    for x in range(hours):
        average = average + list1[x]   
    #return average
    return average

#function to check if the user slacked off
def slackedOff(list1, hours):
    #initialize range offset
    rangeOffSet = 1
    print("-" * 100)
    print("Days you slacked off (i.e. worked less than 7 hours):")
    #loop to check if the hours worked each day was less than 7
    for x in range(hours):
        #if its less than 7, print
        if (list1[x] < 7):
            print("Day #{}: {} hours".format((x + rangeOffSet), list1[x]))


#PROGRAM STARTS HERE. DO NOT CHANGE THIS CODE.
if __name__ == "__main__":
    main()