num = int(input("Enter a number:\n"))
print([x for x in range(1, num+1, 1) if num % x == 0])
