###########################################
# Desc: Enter application description here.
#
# Author: Enter name here.
###########################################
import csv
def main():
    fileName = "Ottawa_Ball_Diamonds.csv"
    with open(fileName, mode="r") as myCSV:
        field = input("What field do you want to look at (softball, baseball, or T-ball)?: ").lower()
        language = input("English or French?: ").lower()
        fileData = csv.reader(myCSV)
        print(f"Here is a list of all facilities for {field.capitalize()}")
        for row in fileData:

            if field.lower() == row[3].lower():
                # F string is a simplified .format()
                if language == "english":
                    print(f"Facility ID = {row[2]}, Field Name = {row[5]}")
                if language == "french":
                    print(f"Facility ID = {row[2]}, Field Name = {row[6]}")



if __name__ == "__main__":
    main()