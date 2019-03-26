###########################################
# Desc: mad libs
#READY FOR MARKING
# Author: Zach
###########################################

import csv

def main():
    #initialize the story file name
    storyFile = "the_story_file.txt"
    choicesFile = "the_choices_file.csv"
    #initialize lists needed for program
    choicesList = []
    userChoice = []
    #opening required files for data
    with open(storyFile, mode = "r") as fileHandler:
        dataFromStory = fileHandler.read().splitlines()
    with open(choicesFile, mode = "r") as fileHandler:
        dataFromChoices = csv.reader(fileHandler)
        #putting choices data into a list
        for row in dataFromChoices:
            choicesList.append(row)
    #adding options a-e for user choices
    choicesList.append(["a", "b", "c", "d", "e"])
    #calling choices function
    choices(choicesList, userChoice)
    #calling convertion function to change the letter choice into the number equivilent 
    convertLetterToNumber(userChoice)
    #loop to replace _#_ into the users choices
    for line in range(len(dataFromStory)):
        for row in range(len(choicesList) - 1):            
            dataFromStory[line] = dataFromStory[line].replace(f"_{row + 1}_", choicesList[row][userChoice[row]].upper()) 
    newStory(dataFromStory)
        
#function to convert letters to numbers (a = 1)
def convertLetterToNumber(choice):
    counter = 0
    for x in choice:
        choice[counter] = ord(x) - 96
        counter+=1


#function to print out the new story
def newStory(data):
    print("Your Complete Story:\n")
    for line in data:
        print(line)

#function to gather users choices
def choices(choicesList, userChoice):
    #loops through the 2d list going through each option and saving the choice to a new list
    for listPosition in range(len(choicesList) - 1):
        counter = 0
        print(f"Please choose {choicesList[listPosition][0]}:")
        #loop to print out all the options the user can pick from
        for choice in range(0, len(choicesList[0]) - 1):
            print(f"{choicesList[-1][counter]}) {choicesList[listPosition][choice + 1]}")
            counter += 1
        #error checking if the user choice exists
        while True:
            choice = input("Enter choice (a-e): ")
            if (choice == "a") or (choice == "b") or (choice == "c") or (choice == "d") or (choice == "e"):
                userChoice.append(choice)
                break

if __name__ == "__main__":
    main()