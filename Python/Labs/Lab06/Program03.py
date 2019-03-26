###########################################
# Desc: loops for removing list value
#
# Author: Zach Slaunwhite
###########################################

def main():
    # Main function for execution of program code.
    # Make sure you tab once for every line.

    # Input
    #gather the length of the list
    listLength = int(input("How long do you want the list?: "))
    myList = []
    # Process
    #appending the list to create the list length
    for x in range(listLength):
        myList.append(x)
    removeValue1 = int(listLength/2)
    removeValue2 = int((listLength/2) - 1)
    #if the value is even, you must remove the two middle elements
    if (listLength%2 == 0):
        
        #deleting the middle elements
        del myList[removeValue1]
        del myList[removeValue2]
    else:
        del myList[removeValue1]
    # Output
    print(myList)

#PROGRAM STARTS HERE. DO NOT CHANGE THIS CODE.
if __name__ == "__main__":
    main()