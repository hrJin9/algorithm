# [Silver IV] 카드2 - 2164 

[문제 링크](https://www.acmicpc.net/problem/2164) 

## 문제 풀이


## 알게된 점
이전에 사용했던 `queue` 를 사용하는것보다 `deque`를 사용하면 stack과 queue 기능을 동시에 사용할 수 있다.

``` python
from collections import deque

dq = deque([값1, 값2])

# queue
dq.popleft() 
dq.append() 

# stack
dq.pop()

# 왼쪽삽입
dq.appendleft()

# 반전
dq.reverse()

# 길이
dq.maxlen()

# 해당 원소 개수
dq.count(값)
```




### 성능 요약

메모리: 55032 KB, 시간: 172 ms

### 분류

자료 구조, 큐

### 제출 일자

2024년 8월 15일 18:34:58


