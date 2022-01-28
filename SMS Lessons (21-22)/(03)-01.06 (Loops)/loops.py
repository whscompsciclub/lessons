# for loops | useful if you how many iteration
for i in range(5):
    print("test")

sum = 0
for counter in range(1, 101):
    # print(counter)
    sum = sum + counter
    # print(sum)
print(sum)

str = "hello"
for char in str:
    print(char)


# while loops | useful if you are unsure about how many iterations
num = 0
while num < 5:
    print(num)
    num += 1

sum = 0
counter = 1
while counter <= 100:
    sum += counter 
    counter += 1

print(sum)

# str = "hello"
# counter = 0
# # print(len(str))
# while counter < len(str):
#     print(str[counter])
#     counter += 1

