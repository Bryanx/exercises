# If we list all the natural numbers below 10 that are multiples of 3 or 5,
# we get 3, 5, 6 and 9. The sum of these multiples is 23.
# Find the sum of all the multiples of 3 or 5 below 1000.

def sum_multiples(x, multiples):
    result = 0
    for i in range(1, x, 1):
        for a in multiples:
            if i % a == 0:
                result += i
                break
    return result

print("Oprdacht 1")
if 23 == sum_multiples(10, [3, 5]):
    print("Goed gedaan Bryan!")
else:
    print("Oeps")

# print "Oprdacht 2"
# if 210 == sum_multiples(100, [25, 50, 60]):
#     print "Goed gedaan Bryan!"
# else:
#     print "Oeps"
#
# print "Oprdacht 3"
# if 5 == sum_multiples(10, [5]):
#     print "Goed gedaan Bryan!"
# else:
#     print "Oeps"
#
# print "Oprdacht 4"
# if 233168 == sum_multiples(1000, [3, 5]):
#     print "Goed gedaan Bryan!"
# else:
#     print "Oeps"