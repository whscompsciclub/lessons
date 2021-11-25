# bonus answer code
operation = int(input("Enter 1 for addition, 2 for subtraction, 3 for multiplication, and 4 for division: "))

if operation != 1 and operation != 2 and operation != 3 and operation != 4:
    print("The number you entered does not match an operation")
    
num_1 = int(input("Enter first number: "))
num_2 = int(input("Enter second number: "))

if operation == 1:
    print("The sum is", num_1 + num_2)

elif operation == 2:
    print("The difference is", num_1 - num_2)

elif operation == 3:
    print("The product is", num_1 * num_2)

else:
    print("The quotient is", num_1 / num_2)