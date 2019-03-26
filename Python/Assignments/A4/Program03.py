###########################################
# Desc: definitely not battle ship
#READY FOR MARKING
# Author: Zach
###########################################

def main():
    #initializing variables needed throughout the program
    mapOfShips = "map.txt"
    mapLength = 10
    mapWidth = 10
    gameMap = []
    shipPositions = 17
    shotsHit = 0
    shotsTaken = 0
    shotsRemaining = 30
    newMap = []
    shotsAlreadyCalled = []

    #loop to create game board
    for row in range(mapLength):
        gameMap.append([])
        #using underscore as placeholder to generate game board efficiently
        for _ in range(mapWidth):
            gameMap[row].append(" ")


    #open map file to get ship locations
    with open(mapOfShips, mode = "r") as fileHandler:
        mapToList = fileHandler.read().splitlines()
    
    #initialize counter to 0
    counter = 0
    #loop to split the lists into individual game positions
    for row in mapToList:
        newMap.append([])
        newMap[counter].append(row)
        newMap[counter] = row.split(",")
        counter += 1
    

    print("Let's play Battleship!")
    #while you have missles and all ships are yet to be restroyed, continue playing.
    while (shotsRemaining > 0) and (shotsHit < shipPositions):
        print(f"You have {shotsRemaining} missles remaining")
        printBoard(gameMap)
        try:
            while True:
                #initialing already shot variable to false
                alreadyShot = False
                userGuess = input("Choose your target (Ex. A1): ")
                #checking if user guess has already been used
                for x in range(len(shotsAlreadyCalled)):
                    #if match is found, already shot changes to true
                    if shotsAlreadyCalled[x].lower() == userGuess.lower():
                        alreadyShot = True
                #if no match is found, the true loop breaks, continuing the try/except
                if alreadyShot == False:
                    break
            #appending the users guess to a list (later to be checked again)
            shotsAlreadyCalled.append(userGuess)

            #changing userguess into a list, so the letter and number combination is separated
            userGuess = list(userGuess)
            #taking the letter from the guess and converting it to the number equivilent of the alphabet
            userGuessLetter = userGuess.pop(0)
            userGuessLetter = ord(userGuessLetter.lower()) - 96
            #joining the list back (used for when the number is 10 (otherwise the list is [1,0] and not [10]))
            userGuessNumber = int("".join(userGuess))
            #getting the game map and shots hit from function hitDetection()
            gameMap, shotsHit = hitDetection(newMap, gameMap, userGuessNumber, userGuessLetter, shotsHit)
            shotsTaken += 1
            shotsRemaining -= 1

        except:
            print("Please enter a valid coordinate")

    #error catch to display 0 missles when game ends
    if shotsRemaining == 0:
        print(f"You have {shotsRemaining} missles remaining")

    #print map one last time
    printBoard(gameMap)
    #check if game was one
    winDetection(shotsHit, shipPositions)

#function for dectecting if the player won
def winDetection(shotsHit, ships):
    if (shotsHit == ships):
        print("YOU SANK MY ENTIRE FLEET!")
        print(f"You had {shotsHit} of 17 hits, which sank all the ships")
        print("You won, congratulations!")
    else: 
        print("GAME OVER")
        print(f"You had {shotsHit} of 17 hits, but didnt sink all the ships")
        print("Better luck next time.")

#function for printing game board
def printBoard(gameMap):
    print("\tA B C D E F G H I J")
    counter = 1
    for row in range(len(gameMap)):
        print(f"{counter}\t", end = "")
        for column in range(len(gameMap[row])):
            print(f"{gameMap[column][row]}", end = " ")
        print()
        counter += 1
    print()    

#function for checking if the guess hit or missed
def hitDetection(newGameMap, gameBoard, number, letter, shotsHit):
    if (newGameMap[number - 1][letter - 1] == "1"):
        print("hit")
        gameBoard[letter - 1][number - 1] = "x"
        shotsHit += 1
            
    else:
        print("miss")
        gameBoard[letter - 1][number - 1] = "o"
    return gameBoard, shotsHit


if __name__ == "__main__":
    main()