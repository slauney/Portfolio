####################
# Desc: In class work with variables
# Author: Zach Slaunwhite
# W0414242
####################



'''
About 12% of the restaurants in the US are pizzerias, 
and there are about 70,000 pizzerias in the US. 
Estimate the total number of restaurants in the US. 
Write code in a console application which calculates and then 
displays the estimated number of restaurants.
'''


def main():
    # input: pizzerias = 70000
    num_pizzerias = 70000
    percentage_of_total = 0.12
    total_num_restaurants = (num_pizzerias *percentage_of_total) * 100
    # process pizzerias = 12% of total
    # output: 
    print("total number of restaurants in the the US = " + str (total_num_restaurants))


# Main startup call
if __name__ == "__main__":
    main()
