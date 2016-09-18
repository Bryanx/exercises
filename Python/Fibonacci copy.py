def fibonacci(x):
    x -= 2
    f = [0, 1]
    if x < 0:
        return[0]
    elif x < 1:
        return f
    else:
        for i in range(x):
            f.append(f[len(f) - 2] + f[len(f) - 1])
        return f

print(fibonacci(int(input("Enter the amount of Fibonacci numbers:\n"))))
