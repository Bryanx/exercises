num = int(input("Enter a number:\n"))
div = [n for n in range(2, num) if num % n == 0]

def prime(num):
    if len(div) == 0 and num > 1:
        print("Prime")
    else:
        print("Not prime")

prime(num)
