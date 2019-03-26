###########################################
# Desc: Enter application description here.
# Ready for marking
# Author: Enter name here.
###########################################



def main():
    #asking user for the amount of girl guides
    numOfGirlGuides = int(input("Enter the number of guides selling cookies: "))


    listOfGirlGuides = createList(numOfGirlGuides)

    #getting the average boxes sold by using the getTotal function and dividing by total number of girls
    average = getTotalBoxes(numOfGirlGuides, listOfGirlGuides) / numOfGirlGuides
    #average = totalBoxes/numOfGirlGuides
    print("\nThe average number of boxes sold by each guide was {:.2f}".format(average))

    #visual table
    print("\nGuide\t\tPrizes Won\n" + "-" * 50)

    #running the prizes function, passing in the list length, the list, and the average boxes sold
    output = prizes(len(listOfGirlGuides), listOfGirlGuides, average)
    
    #loop to print out results
    for x in range(len(listOfGirlGuides)):
        print("{}\t\t- {}".format(output[x][0], output[x][1]))

#function to get the total boxes 
def getTotalBoxes(num1, list1):
    totalBoxes = 0
    boxes = 1
    for x in range(num1):
        totalBoxes += list1[x][boxes]
    return totalBoxes

#function to determin which girl gets which prize
def prizes(num1, listOf, averageSold):
    mostSold = 0
    prizePosisiton = 1
    noneSold = 0

    #loop to find out the most cookies sold
    for x in range(num1):
        if mostSold < listOf[x][prizePosisiton]:
            mostSold = listOf[x][prizePosisiton]
    
    #loop to assign the prizes based on cookies sold
    for x in range(num1):
        if (listOf[x][prizePosisiton] == noneSold):
            prize = " "
        elif (listOf[x][prizePosisiton] == mostSold):
            prize = "Trip to girl guide jamboree in Aruba!"
        elif (listOf[x][prizePosisiton] > averageSold):
            prize = "Super Seller Badge"
        elif (listOf[x][prizePosisiton] > noneSold):
            prize = "Left over cookies"
        #replacing the number of boxes sold with the prize
        listOf[x][1] = prize

    return listOf

#function to create the list
def createList(num1):
    offSet = 1
    #initializing the list
    listOfGirlGuides = []

    #loop to create list
    for x in range(num1):
        #append a new list for every girl
        listOfGirlGuides.append([])
        #get the name of the guide
        name = input("\nEnter the name of guide #{}: ".format(x + offSet))
        #append the name to the inner list (list of lists)
        listOfGirlGuides[x].append(name.capitalize())
        #get the amount of boxes
        boxesSold = int(input("Enter the number of boxes sold by {}: ".format(listOfGirlGuides[x][0])))
        #append the amount of boxes sold
        listOfGirlGuides[x].append(boxesSold)

    return listOfGirlGuides
if __name__ == "__main__":
    main()



