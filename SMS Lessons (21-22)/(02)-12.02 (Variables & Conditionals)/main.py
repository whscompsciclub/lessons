
operation = int(input("Choose Operation:\n   1: addition\n   2: subtraction\n   3: multiplication\n   4: division\n"))
num_1 = int(input("\nEnter first integer: "))
num_2 = int(input("\nEnter second integer: "))
if operation == 1:
  print(num_1 + num_2)
elif operation == 2:
  print(num_1 - num_2)
elif operation == 3:
  print(num_1 * num_2)
elif operation == 4:
  print(num_1 / num_2)
else:
  print("operation invalid, please choose a integer between 1-4")

