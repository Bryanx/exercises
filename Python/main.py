import time; from functools import reduce

start_time = time.time()


def factorial(f):
    result = []
    for i in range(1, f+1):
        result.append(i)
    return reduce(lambda x,y: x*y, result)

print(sum(int(i) for i in str(factorial(100))))

print("--- %s seconds ---" % (time.time() - start_time))