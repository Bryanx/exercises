def even_fibonacci_sum(x):
    f = [1, 2]
    e = []
    while f[len(f) - 2] + f[len(f) - 1] < x:
        f.append(f[len(f) - 2] + f[len(f) - 1])
    for i in f:
        if i % 2 == 0:
            e.append(i)
    return sum(e)


print(even_fibonacci_sum(4000000))
