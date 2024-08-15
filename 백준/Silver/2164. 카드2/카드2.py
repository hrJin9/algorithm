from collections import deque
import sys
N = int(sys.stdin.readline())
q = deque([i+1 for i in range(N)])
for _ in range(N-1) :
    q.popleft()
    x = q.popleft()
    q.append(x)
print(q.pop())
