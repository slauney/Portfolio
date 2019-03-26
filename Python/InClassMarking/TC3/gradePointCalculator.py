###########################################
# Desc: Enter application description here.
#
# Author: Enter name here.
###########################################



def main():
    #setting boolean grade validation to true until user input is invalid
    validGrade = True

    # Input
    #prompt user for the letter grade they received
    gradeLetter = input("What letter grade did you receive: ")
    #prompt user for the modifier (+ or -)
    gradeModifier = input("If there was a modifier, what was it (+ or -): ")

    #setting grade letter to lower case to avoid capital letter issues
    gradeLetter.lower()
    # Process
    #setting grade point based on letter received
    if gradeLetter == "a":
        gradePoint = 4    
    elif gradeLetter == "b":
        gradePoint = 3
    elif gradeLetter == "c":
        gradePoint = 2
    elif gradeLetter == "d":
        gradePoint = 1
    elif gradeLetter == "f":
        gradePoint = 0
        #setting modifier to blank since there is no modifier for an F
        gradeModifier = "" 

    #if letter does not match conditions, setting the validation of grade to false and gradepoint to 0
    else:
        validGrade = False
        gradePoint = 0

    #setting gradePoint to float value
    gradePoint = float(gradePoint)
    
    #depending on if the grade letter was valid, adding/subtracting multiplier
    if validGrade:
        if gradeModifier == "+":
            gradePoint = gradePoint + 0.3
            #if letter grade is a, it cannot go higher than 4. Setting value to 4 if the modifier is +
            if gradeLetter == "a":
                gradePoint = 4
        elif gradeModifier == "-":
            gradePoint = gradePoint - 0.3

    # Output


    if validGrade == False:
        print("You entered an invalid letter grade")
    print("The numaric value is: {}".format(gradePoint))

#PROGRAM STARTS HERE. DO NOT CHANGE THIS CODE.
if __name__ == "__main__":
    main()