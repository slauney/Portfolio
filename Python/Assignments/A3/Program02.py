###########################################
# Desc: message redactor
# Ready for marking
# Author: zach slaunwhite
###########################################

def main():

    #while loop to continue unless user quits
    while(True):
        #prompt user for phrase
        userPhrase = input("Type a phrase (or \"quit\" to exit program): ")

        #if input is quit, quits program
        if userPhrase.lower() == "quit":
            break
        
        #calling the three functions
        lettersToReplace = redactionLetters()
        letterCount = redaction(userPhrase, lettersToReplace)
        redactedPhrase = replace(userPhrase, lettersToReplace)

        #print results
        print("Number of letters redacted: {}".format(letterCount))
        print("Redacted phrase: {}\n".format(redactedPhrase))

#function to split letters into list, split by a comma
def redactionLetters():
    #prompt user for letters to redact
    lettersRedacted = input("\nType a comma-separated list of letters to redact: ")
    #split by a comman, and put into list
    lettersToReplace = lettersRedacted.split(",")
    #return list
    return lettersToReplace

#function to count how many letters are redacted
def redaction(phrase, letters):
    lettersReplaced = 0
    #loop for every letter in phrase
    for x in range(len(phrase)):
        #loop for compare letter in phrase with each letter that you are redacting
        for i in letters:
            #if they match, counter increases by 1
            if phrase[x].lower() == i.lower():
                lettersReplaced += 1
    #return total number or letters redacted
    return lettersReplaced

#function to replace the letters in the phrase with an "_"
def replace(phrase, letters):
    #variable to off set the loop range
    counterOffset = -1

    #loop to replace a redacted letter with an "_"
    for x in range(counterOffset, len(letters)):
        #checking if the letter is lower case and upper case to redact
        newPhrase = phrase
        phrase = newPhrase.replace(letters[x].lower(),"_")
        newPhrase = phrase
        phrase = newPhrase.replace(letters[x].upper(),"_")
    #return redacted phrase
    return phrase

if __name__ == "__main__":
    main()