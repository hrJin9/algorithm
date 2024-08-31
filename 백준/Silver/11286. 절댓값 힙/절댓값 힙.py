import sys, heapq
N = int(sys.stdin.readline())
min_hq = []
max_hq = []
for _ in range(N) :
    x = int(sys.stdin.readline().rstrip())
    if x == 0 :
        if min_hq and max_hq :
            if min_hq[0] < max_hq[0] : 
                print(heapq.heappop(min_hq))
            else : 
                print(-heapq.heappop(max_hq))
        elif min_hq :
            print(heapq.heappop(min_hq))
        elif max_hq : 
            print(-heapq.heappop(max_hq))
        else :
            print(0)
    else :
        if x > 0 : # 양수 -> 최소힙
            heapq.heappush(min_hq, x)
        else : # 음수 -> 최대힙
            heapq.heappush(max_hq, -x)
        