import sys
K = int(sys.stdin.readline())
stk = []
for _ in range(K) :
    x = int(sys.stdin.readline())
    if x == 0 : 
        stk.pop()
    else : 
        stk.append(x)
print(sum(stk))