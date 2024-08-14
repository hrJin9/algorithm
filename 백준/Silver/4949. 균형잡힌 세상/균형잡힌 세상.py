import sys
answer = []

def solution(S) :
    stk = []
    for s in S :
        if s in '([' :
            stk.append(s)
        elif s == ')' :
            if not stk or stk[-1] != '(' :
                return 'no'
            stk.pop()
        elif s == ']' :
            if not stk or stk[-1] != '[' :
                return 'no'
            stk.pop()
    return 'yes' if not stk else 'no'


while True :
    S = sys.stdin.readline().rstrip('\n')
    if S == '.' :
        break
    answer.append(solution(S))
    
print("\n".join(map(str, answer)))