###########################################
# Desc: Enter application description here.
#
# Author: Enter name here.
###########################################

def main():
    namePosition = 0
    agePosition = 1
    guestList = []
    guestCounter = 0
    guest = " "
    while guest.upper() != "DONE":
        guest = input("Please enter the name of the guest (\"done\" or blank to exit): ").capitalize()
        if (guest.upper() != "DONE"):
            guestList.append([])
            guestList[guestCounter].append(guest)
            try:
                age = int(input("Please enter the age of {}: ".format(guestList[guestCounter][namePosition])))
                guestList[guestCounter].append(age)
                guestCounter += 1
            except:
                print(f"{guest} was removed due to invalid age.")
                guestList.pop(-1)

    while True:
        try:        
            fileName = input("Please enter the name of the file: ")
            accessMode = "w"
            with open(fileName, mode = accessMode) as fileHandler:
                for x in range(len(guestList)):
                    fileHandler.write("{},{}\n".format(guestList[x][namePosition], guestList[x][agePosition]))
            break

        except PermissionError:
            print("You do not have permission to store your file here")
        except FileNotFoundError:
            print("Please check the file name and directory")
        except OSError:
            print("Please change the filepath to match your OS")
    


if __name__ == "__main__":
    main()