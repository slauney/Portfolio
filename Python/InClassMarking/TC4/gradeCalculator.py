###########################################
# Desc: Enter application description here.
#
# Author: Enter name here.
###########################################

def main():
    # Main function for execution of program code.
    # Make sure you tab once for every line.
    intro()

    # Input
    courseCode1 = input("Please enter the course you will be receiving the grade for: ").upper()
    courseCode2 = input("Please enter the course you will be receiving the grade for: ").upper()
    courseCode3 = input("Please enter the course you will be receiving the grade for: ").upper()
    courseCode4 = input("Please enter the course you will be receiving the grade for: ").upper()
    courseCode5 = input("Please enter the course you will be receiving the grade for: ").upper()
    courseCode6 = input("Please enter the course you will be receiving the grade for: ").upper()
    # Process

    #calling gradeCalculator function to process each letter into a grade point
    grade1 = gradeCalculator(courseCode1)
    grade2 = gradeCalculator(courseCode2)
    grade3 = gradeCalculator(courseCode3)
    grade4 = gradeCalculator(courseCode4)
    grade5 = gradeCalculator(courseCode5)
    grade6 = gradeCalculator(courseCode6)
    #calculating average grade point
    totalGrade = (grade1 + grade2 + grade3 + grade4 + grade5 + grade6) / 6
    # Output
    print("\n " + "*" * 38 +"\n")
    print("The numeric value for {} is: {}".format(courseCode1, grade1))
    print("The numeric value for {} is: {}".format(courseCode2, grade2))
    print("The numeric value for {} is: {}".format(courseCode3, grade3))
    print("The numeric value for {} is: {}".format(courseCode4, grade4))
    print("The numeric value for {} is: {}".format(courseCode5, grade5))
    print("The numeric value for {} is: {}".format(courseCode6, grade6))
    print("#" * 51)
    print("Your grade point average for the semester is : {:.2f}".format(totalGrade))
    print("#" * 51)

def gradeCalculator(courseCode):
    letter = input("Please enter a letter grade for {} : ".format(courseCode)).upper()
    modifier = input("Please enter a modifier (+, - or nothing) : ")
    print()

    numericGrade = 0.0

    # Determine base numeric value of the grade
    if letter == "A":
        numericGrade = 4.0
    elif letter == "B":
        numericGrade = 3.0
    elif letter == "C":
        numericGrade = 2.0
    elif letter == "D":
        numericGrade = 1.0
    elif letter == "F":
        numericGrade = 0.0
    else:
        print("You entered an invalid letter grade.")
    
    # Determine whether to apply a modifier
    if modifier == "+":
        if letter != "A" and letter != "F": # Plus is not valid on A or F
            numericGrade += 0.3
    elif modifier == "-":
        if letter != "F":     # Minus is not valid on F
            numericGrade -= 0.3

    # Output final message and result, with formatting
    return numericGrade

#function to display the intro in main code
def intro():
    print("Grade Point Calculator\n")
    print("Valid letter grades that can be entered: A, B, C, D, F.")
    print("Valid grade modifiers are +, - or nothing.")
    print("All letter grades except F can include a + or - symbol.")
    print("Calculated grade point value cannot exceed 4.0.\n")

#PROGRAM STARTS HERE. DO NOT CHANGE THIS CODE.
if __name__ == "__main__":
    main()

############################################
# Tech Check 4 - Provided Starter File
############################################

#FUNCTION
