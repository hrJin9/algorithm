# [Silver V] 색종이 - 2563 

[문제 링크](https://www.acmicpc.net/problem/2563) 


##  문제 풀이

1. 입력받은 x,y의 값 중 최대값을 알아온 뒤, 색종이의 크기를 고려해 10씩 더한 값으로 canvas의 크기를 초기화한다.
   이 때, 2차원 배열에서 입력받은 x값은 열이며 y값은 행에 해당한다.

 ``` python
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

 result = [[0] * (max_y + 10) for _ in range(max_x + 10)]
 ```

2. 이후, 색종이의 크기가 10 x 10이므로 2중 for문을 통해 x와 y 인덱스부터 10번씩 1로 채워준다.
   (2중 for문이어도 정해진 상수값만큼 반복하기때문에 시간복잡도는 O(N)에 해당한다)

``` python
for i in range(N) : 
    x = array[i][0]
    y = array[i][1]
    for j in range(10) : 
        for k in range(10) :
            result[x-1+j][y-1+k] = 1
```
3. 2차원 배열 값을 모두 더해줌
``` python
sum_ = 0
for a in result :
     sum_ += sum(a)       

print(sum_)
```


## 알게 된 사실
- 파이썬의 얕은 복사
 ``` python3
 result = [[0] * (max_y+10)] * (max_x+10) 
 ```
 위처럼 리스트를 생성할 때 파이썬은 얕은 복사를 통해 각 행이 동일한 참조를 가지게 된다. 
 따라서 하나의 행을 변경하면 모든 행이 동일하게 변경된다.
 
 ``` python3
 result =  [[0] * (max_y+10) for _ in range((max_x+10))]
 ```
 이를 방지하기 위해서, 위와 같이 for문 안에서 리스트를 선언해주어야한다. 



## 아쉬운 점
- 애초에 100x100으로 초기화하는 것이 더 간단한 방법
  - 시간차이는 나지 않지만 x와 y의 max값을 따로 구해서 배열을 초기화할 필요가 없다.
  - 굳이 index를 맞추겠다고 canvas에 접근할 때 index를 1개씩 뺄 필요도 없다!

<br>

---


### 성능 요약

메모리: 31120 KB, 시간: 44 ms

### 분류

구현

### 제출 일자

2024년 8월 13일 15:50:28


