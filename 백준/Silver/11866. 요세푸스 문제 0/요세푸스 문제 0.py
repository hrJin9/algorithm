from collections import deque

N, K = map(int, input().split())

dq = deque([i+1 for i in range(N)])
result = []

for i in range(N) : 
    for j in range(K) : 
        if j == K-1 :
            result.append(dq.popleft()) # 결과로 송출
        else : 
            dq.append(dq.popleft()) # 오른쪽에 붙인다

print(f"<{', '.join(map(str,result))}>")
