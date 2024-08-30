import sys, heapq
N = int(sys.stdin.readline())
max_heap = []
for _ in range(N) :
    x = int(sys.stdin.readline().rstrip()) * -1
    if x == 0 :
        print(heapq.heappop(max_heap) * -1 if max_heap else 0)
    else :
        heapq.heappush(max_heap, x)
        