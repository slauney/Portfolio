###########################################
# Desc: Enter application description here.
#
# Author: Enter name here.
###########################################

def main():
    namePosition = 0
    agePosition = 1
    guestList = []
    guest = " "
    guestCounter = 0
    while guest.upper() != "DONE":
        guest = input("Please enter the name of the guest (\"done\" to exit): ")
        while guest.isalpha() == False:
            guest = input("Please re-enter the name of the guest (\"done\" to exit): ")
        if (guest.upper() != "DONE"):
            guestList.append([])
            guestList[guestCounter].append(guest.capitalize())
            age = input("Please enter the age of {}: ".format(guestList[guestCounter][namePosition]))
            while age.isalpha():
                age = input("Please re-enter the age of {}: ".format(guestList[guestCounter][namePosition]))
            if age.isalnum():                    
                age = int(age)
            guestList[guestCounter].append(age)
            guestCounter += 1
    fileName = "guestsList.csv"
    accessMode = "w"
    with open(fileName, mode = accessMode) as fileHandler:
        for x in range(len(guestList)):
            fileHandler.write("{},{}\n".format(guestList[x][namePosition], guestList[x][agePosition]))

if __name__ == "__main__":
    main()