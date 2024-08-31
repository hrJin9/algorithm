import sys, heapq
N = int(sys.stdin.readline())

hq = []
for _ in range(N) :
    x = int(sys.stdin.readline().rstrip())
    if x == 0 :
        print(heapq.heappop(hq) if hq else 0)
    else :
        heapq.heappush(hq, x)
    