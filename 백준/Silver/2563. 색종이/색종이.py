N = int(input())
max_x = 0
max_y = 0
array = []
for _ in range(N) :
    x,y = map(int, input().split())
    array.append([x,y])
    if x > max_x : 
        max_x = x
    if y > max_y :
        max_y = y

# 아래처럼 하면 파이썬의 얕은 복사 -> 모두 같은 참조값을 가지게 된다.
# result = [[0] * (max_y+10)] * (max_x+10) 
result = [[0] * (max_y + 10) for _ in range(max_x + 10)]
for i in range(N) : 
    x = array[i][0]
    y = array[i][1]
    for j in range(10) : 
        for k in range(10) :
            result[x-1+j][y-1+k] = 1

sum_ = 0
for a in result :
     sum_ += sum(a)       

print(sum_)