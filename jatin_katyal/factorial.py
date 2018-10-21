def fact(x):
    if x == 1 or x == 0:
        return 1
    return x * fact(x-1)

if __name__ == "__main__":
    x = int(input())

    print(fact(x))
