def solution(v) : 
    if v <= 1 :
        return 1
    else :
        return solution(v-1) * v
    
N = int(input())
print(solution(N))
