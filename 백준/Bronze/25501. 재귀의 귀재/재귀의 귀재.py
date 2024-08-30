import sys

def recursion(str, l, r, count) :
    count = count + 1
    if l >= r :
        return 1, count
    elif str[l] != str[r] : 
        return 0, count
    else :
        return recursion(str, l+1, r-1, count)

def isPalindrom(str, count) :
    return recursion(str, 0, len(str)-1, count)
    
T = int(sys.stdin.readline())
for _ in range(T) :
    isPal, count = isPalindrom(sys.stdin.readline().rstrip(), 0)
    print(f'{isPal} {count}')