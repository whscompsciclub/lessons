# check out our cheatsheet at 
# https://whscompsciclub.github.io/posts/python/


# this is a comment

# print function a.k.a print statements
print("Hello")          # prints out "Hello"
# ex: print your name
print("Eric Wang")      # prints out "Eric Wang"

# variables
# note: this is an example of a String (sequence of characters)
a = "hey"       # create a variable named 'a' with the value of 'hey'
print(a)        # prints the variable 'a' 

# print even numbers from 2 to 10 
# note: this is an example of an Integer (number)
even = 2        # creates a variable named "even" with the value of 2
print(even)     # prints the variable 'even' which has the value of 2
even += 2       # 'even += 2' is another way to write 'even = even + 2'
print(even)     # prints 4 because 'even' now has the value of 4  
even += 2       # adds 2 to even
print(even)     # prints 6
even += 2
print(even)
even += 2
print(even)     # prints 10

# note: this is an example of an Boolean (True or False) 
b = True        # create a variable named `b` with the value of `True`
print(b)        # prints the variable 'b'


# input function (grabs the user's input)
c = input()     # creates a variable named 'c', then grabs the user's input and assigns that to the variable
print(c)        # prints the variable 'c', which should contain the user's input

# print your name and age using input
name = str(input())     # creates a variable named 'name' and grabs the user's input and converts that to a String
age = int(input())      # creates a variable named 'age' and grabs the user's input and converts that to a Integer
# to print multiple values, use commas `,`
# note: Python automatically adds a "space" between the values
print("My name is", name, "and I am", age, "years old") 
