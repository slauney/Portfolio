###########################################
# Desc: rewrote for loop (for i in range (1,10))
#
# Author: zach
###########################################

def main():
    # Main function for execution of program code.
    # Make sure you tab once for every line.
    s = 0
    # Input
    
    #for loop that i am rewriting
    for i in range(1,10):
        s = s + i
    print(s)
    # Process
    i = 0
    s = 0
    #new while loop
    while (i < 9):
        i+=1
        s += i
    print(s)
    # Output

#PROGRAM STARTS HERE. DO NOT CHANGE THIS CODE.
if __name__ == "__main__":
    main()