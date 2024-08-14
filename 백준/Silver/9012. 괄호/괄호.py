import sys
N = int(sys.stdin.readline())
answer = []
for _ in range(N) :
    S = sys.stdin.readline().strip()
    stk = []

    for i in range(len(S)) :
        if S[i] == ')' and len(stk) > 0 :
            stk_last = stk.pop()
            if stk_last != '(' :
                stk.append(stk_last)
                stk.append(S[i])
        else :
            stk.append(S[i])
        
    answer.append('YES') if len(stk) == 0 else answer.append('NO')

print('\n'.join(map(str, answer)))