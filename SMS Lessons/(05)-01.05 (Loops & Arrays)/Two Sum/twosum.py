num = [int(i) for i in str.split(str(input()))] # grab integers as an array
target = int(input())                           # grab target integer

# Start your code here
for i in range(len(num)):                       # loop through num (int array) starting at i 
    for j in range(i+1,len(num)):               # loop through num but starting at i+1
                                                # this allows us to loop through every possible pair of numbers in the array
                                                # commonly known as a two pointer approach
        if(num[i]+num[j]==target):              # check if the two numbers = target, then print indices if they equal
            print("[" + str(i) + ", " + str(j) + "]")