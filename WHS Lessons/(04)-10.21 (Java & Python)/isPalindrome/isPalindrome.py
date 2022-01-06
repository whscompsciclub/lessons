# Set up initial variables and grab the basic input
a = str(input())
number = [int(i) for i in a]
# Start your code here

# A flag that will be true if the number is a palindrome. Once the program finds out that it is not a palindrome, the flag will switch to false
flag = True

# Iterates through all the digits
for i in range(len(number)):
    if(number[i]!=number[-i-1]):
        flag = False # If nth digit from the front is not equal to the nth digit from the back, then the number is not a palindrome and flag is set to false

# Print output based on results
if(flag):
    print(a + " is a palindrome")
else:
    print(a + " is not a palindrome")