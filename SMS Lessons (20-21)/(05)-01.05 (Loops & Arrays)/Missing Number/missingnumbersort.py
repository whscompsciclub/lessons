# Start your code here
n = int(input())                                    # grab int n
num = [int(i) for i in str.split(str(input()))]     # grab the next n integers as an array

# sort num (int array) in ascending order using builtin sort() function
num.sort()  

# ind keeps track of the supposed numbers if the array WASNT missing a number
ind = 1

# loop through every integer in num (int array)
for x in num:
    # check if the current element is not equal to ind
    if x != ind:
       # print the missing number
       print(x-1)
       break

    # increment ind by 1
    ind += 1

# 5
# 5 4 2 1
# 1 2 4 5
# 1 != 1
# 2 != 2
# 4 != 3


# you can replicate the above solution with a while loop
# uses the same concepts but much more efficient code

# i is used to increment and loop through num (int array)
i = 0
while i < len(num):
    # check if num[i] (the element in the array) is not equal to i+1 (would indicate a gap and a missing number)
    if num[i] != i+1:
        print(x-1)
        break 

    # increment i
    i += 1