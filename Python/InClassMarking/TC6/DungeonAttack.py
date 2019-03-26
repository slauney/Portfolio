###########################################
# Desc: Enter application description here.
#
# Author: Enter name here.
###########################################


import csv
def main():
    name = 0
    attack = 1
    damage = 2
    userHealth = 0
    gameContinue = True
    userContinue = ""

    while (gameContinue):
        print("Welcome to the Dungeon applicaion where none shall survive. Simply try to live as long as you can.\n")
        while(0 >= userHealth or userHealth > 200):
            try:
                userHealth = int(input("Please enter your initial hitpoints (1-200): "))
                if (userHealth == 9001):
                    print("Nappa: Vegeta! What does the scouter say about his power level?")
                    print("Vegeta: removes his scouter and crushes it) It's over 9000!")
                    print("Nappa: What!? 9000!? There's no way that can be right! Could it!?\n")
                if (userHealth < 1):
                    print("Suicide is not an option, please try again.")
                if (userHealth > 200):
                    print("Just because you want more health doesn't mean you can have it, please try again.")
            except: 
                print("Numbers only")
        print("=" * 110)

        fileName = "TC6_monsters.csv"
        with open(fileName, mode = "r") as fileHandler:
            fileData = csv.reader(fileHandler)
            for row in fileData:
                print(f"You were attacked by a(n) {row[name]} with a(n) {row[attack]} attack for {row[damage]} damage.", end = "")
                userHealth -= int(row[damage])
                if (userHealth <= 0):
                    userHealth = 0
                    print(f" Current hit points: {userHealth}")
                    break
                print(f"Current hit points: {userHealth}", end = "")
                input()
            print("All heros must fall at some point. It's too bad you weren't a hero though... A hero would have survived that.")
        userContinue = input("Press any key to continue (Q to quit)").lower()
        print()
        if (userContinue == "q"):
            gameContinue = False
    print("That's it. Retreat in fear and warn your friends!")


if __name__ == "__main__":
    main()