###########################################
# Desc: Enter application description here.
# Ready for marking
# Author: Enter name here.
###########################################

def main():
  # Main function for execution of program code.
  # Make sure you tab once for every line.

  #declaring constants
  baseCharge = 1000
  costOfTree = 100
  # Input

  #prompting user for all variable inputs
  houseNum = input("\nEnter House Number: ")
  yardL = float(input("\nEnter property depth (feet): "))
  yardW = float(input("\nEnter property width (feet): "))
  grassType = input("\nEnter type of grass (fescue, bentgrass, campus): ").lower()
  numOfTrees = int(input("\nEnter the number of trees: "))


  # Process

  #calculating the area of the yard
  yardArea = yardDim(yardL, yardW)
  #grabbing the multiplier based on the type of grass chosen
  grassMultiplier = typeOfGrass(grassType)
  #calculating total cost by adding the basecharge to 
  #((grass * area of the yard) + (number of trees * tree cost) + extra cost if yard is too large)
  totalCost = totalCharge(baseCharge, yardArea, grassMultiplier, (numOfTrees * costOfTree), addCharge(yardArea))
  

  # Output
  print("Total cost for house {} is: ${:.2f}".format(houseNum, totalCost))

def typeOfGrass(grass):
  #declaring constants
  fescue = 0.05
  bentgrass = 0.02
  campus = 0.01
  #returning cost multiplier based on grass choice
  if grass == "fescue":
    return fescue
  elif grass == "bentgrass":
    return bentgrass
  elif grass == "campus":
    return campus
  #return 0 if choice was incorrect
  else:
    return 0


def yardDim(length, width):
  #calculating the area of the yard
  yardArea = length * width
  return yardArea

def addCharge(area):
  #checking if extra fee of $500 is applied
  if area > 5000:
    return 500
  else:
    return 0

def totalCharge(baseCost, area, grass, treeCost, extraFee):
  #calculating total cost
  totalCost = baseCost + ((area * grass) + treeCost + extraFee)
  return totalCost

#PROGRAM STARTS HERE. DO NOT CHANGE THIS CODE.
if __name__ == "__main__":
    main()