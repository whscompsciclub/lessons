# Start your code here
n = int(input())                                    # grab int n
num = [int(i) for i in str.split(str(input()))]     # grab the next n integers as an array

# calculate the sum from 1 to n
# alg 1 formula: n*(n+1)/2
sum = int(n * (n+1) / 2)  

# loop through every integer in num (int array)
for x in num:
    # set sum equal to sum - x (x is the number in the array)
    # basically subtract each number in num (int array) from sum
    sum -= x
    
# after subtracting all the numbers, sum is going to be left with the missing number
print(sum)

# 5
# 1 2 4 5

# 5 * 6 / 2 = 15
# 15 - 1 = 14
# 14 - 2 = 12
# 12 - 4 = 8
# 8 - 5 = 3