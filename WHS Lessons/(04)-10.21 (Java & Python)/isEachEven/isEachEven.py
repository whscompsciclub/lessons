#setting up an array with 2 elements in it
initialValues = [0,0]

#changing the value of index 0 and index 1 to be 1 and 1 as the start of the sequence
initialValues[0] = 1
initialValues[1] = 1

#iterate from 2 to 9, appending to the end of the initialValues array. Each subsequent element will be the sum of the previous two elements.
for i in range(2,10):
    initialValues.append(initialValues[i-2]+initialValues[i-1])

#creating a count variable
count = 0

#while the count variable is less than 10, check the index corresponding with the count variable in the initialValues array and determine if it is even or odd using %2. Output the answer
while count < 10:
    if initialValues[count]%2==0:
        print(str(initialValues[count]) + " even")
    else:
        print(str(initialValues[count]) + " odd")
    count+=1