import math

def divisor(x):
    return [i for i in range(3, int(math.sqrt(x)), 2) if x % i == 0]

def prime_factors(x):
    e = []
    for a in divisor(x):
        if divisor(a) == []:
            e.append(a)
    return e

print(prime_factors(600851475143))
