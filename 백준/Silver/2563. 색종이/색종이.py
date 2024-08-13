N = int(input())
canvas = [[0] * 100 for _ in range(100)]

for _ in range(N) : 
    x, y = map(int, input().split())
    for i in range(10) : 
        for j in range(10) :
            canvas[x + i][y + j] = 1

area = 0
for row in canvas :
     area += sum(row)       

print(area)