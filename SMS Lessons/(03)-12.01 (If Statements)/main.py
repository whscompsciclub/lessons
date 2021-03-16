# checking if the door should be open

# ... prior code not shown ...

# you've got:

# most secure:
iris_scanner_passed = True

# require both to be true
smartcard_passed = False
pw_check_passed = True

# make a decision
open_door = iris_scanner_passed or (smartcard_passed and pw_check_passed)

# ... more code below ...

# ---------------------------------------------------------------------

# boolean variables
a = True
b = False

# if statements
if a:
    print("a is true")
elif b:
    print("b is true")
elif a == b:
    print("a = b")
else:
    print("neither is true")