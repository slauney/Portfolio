###########################################
# Desc: The A-Teamn
#Ready for marking
# Author: Zach
###########################################
import random
def main():
    #initializing counter to 1
    counter = 1
    #initializing random number
    randomNumber = random.randint(1,10)
    #initializing file names
    fileName = "ateam_Original.txt"
    myFile = "ateam_Edited.txt"

    #opening file to extract data
    with open(fileName, mode = 'r') as fileHandler:
        dataFromFile = fileHandler.read().splitlines()
    #calling function to print out original text from file
    originalText(dataFromFile, counter)

    #creating 2d list
    textToList = create2dList(dataFromFile)

    #changing the case sensitivity based on length of sentance
    changeCaseSensitivity = upperLower(textToList)
    #removing random line
    removeLine = alteredText(changeCaseSensitivity, counter, randomNumber)
    #writing to new file
    with open(myFile, mode = 'w') as fileHandler:
        #loop to write lines to file, and once it hits the last line, it doesnt print a new line
        for row in range(len(removeLine)):
            if removeLine[row] == removeLine[-1]:
                fileHandler.write(f"{removeLine[row][1]}")
            else:
                fileHandler.write(f"{removeLine[row][1]}\n")
    
#function to create a 2d list from file data
def create2dList(fileData):
    #initialize list and counter
    textToList = []
    counter = 0
    #loop to append a list to original list, append the row number, and finally append the line data associated
    for row in fileData:
        textToList.append([])
        textToList[counter].append(counter + 1)
        textToList[counter].append(row)
        counter += 1
    return textToList

#function for original text to be printed
def originalText(fileData, counter):  
    print('-' * 50)
    print("Original Text")
    print('-' * 50)
    #basic loop to print each line
    for row in fileData:   
        print("{}: {}".format(counter, row))
        counter += 1
    print()

#function to print out the altered file text
def alteredText(fileData, counter, randomNum):
    print('-' * 50)
    print("Altered Text")
    print('-' * 50)
    #loop to compare random number with the list of file data, removing the line of the random number
    for row in range(0, len(fileData)):
        if (randomNum == counter):
            fileData[row] = ["",""]
            #prints a blank line if number matched
            print()
        #prints out line if the number didnt match
        else:
            print(f"{fileData[row][0]}: {fileData[row][1]}")
        counter += 1
    return fileData

#function to change case sensitivity
def upperLower(fileData):
    for x in range(0, len(fileData)):
        if (len(fileData[x][1]) > 20):
            fileData[x][1] = fileData[x][1].lower()
        elif (len(fileData[x][1]) <= 20):
            fileData[x][1] = fileData[x][1].upper()
    return fileData

if __name__ == "__main__":
    main()