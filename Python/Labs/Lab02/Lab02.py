###########################################
# Desc: Enter application description here.
#
# Author: Enter name here.
###########################################

def main(): 
    userInput1 = input("Please enter a phrase: ")
    print(userInput1)
    print("This is your phrase in upper case: " + userInput1.upper())
    print("This is your phrase in lower case: " + userInput1.lower())
    print("Your phrase has " + str(userInput1.count("o")) + " o's")
    print(userInput1.isalnum())
    print(userInput1.replace("s","z"))

#PROGRAM STARTS HERE. DO NOT CHANGE THIS CODE.
if __name__ == "__main__":
    main()