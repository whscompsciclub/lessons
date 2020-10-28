n = int(input())
#Takes the input for the number of lines
answer = 0.0
#This will be stored for 2-character operations where we need the previous answer
for i in range(n):
    a = input()
    a = a.split(" ")
    # Takes input & splits to check if 2-character or 3-character
    if len(a) == 3:
        first = float(a[0])
        second = float(a[2])
        if a[1] == "+":
            answer = first + second
        if a[1] == "-":
            answer = first + second
        if a[1] == "*":
            answer = first + second
        if a[1] == "/":
            answer = first + second
    #If length is 3, preform the operation with two numbers given
        print(answer)
    else:
        second = float(a[1])
        if a[0] == "+":
            answer += second
        if a[0] == "-":
            answer -= second
        if a[0] == "*":
            answer *= second 
        if a[0] == "/":
            answer /= second 
    #If length is 2, preform operation with previous answer
        print(answer)