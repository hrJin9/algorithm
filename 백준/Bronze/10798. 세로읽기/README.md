# [Bronze I] 세로읽기 - 10798 

[문제 링크](https://www.acmicpc.net/problem/10798) 

## 문제 풀이
> 파이썬은 간단하게 문자열을 index로 접근할 수 있다. (char방식)

``` py
for i in range(max(len_array)) :
    for j in range(5) :
        if i < len(array[j]) :
            answer += array[j][i]
```

j는 행, i는 열이다.

열의 길이가 모두 다르므로 모두 탐색하기 위해서는 입력받은 값의 길이가 최대인 것을 사용한다. (`max(len_array)`)

이 때, 접근하려는 열(i)이 j행에 해당하는 문자열의 길이(j행의 열)보다 크면 indexOutOfBound 오류가 발생한다.

이를 고려하여 2차원배열형식으로 문자를 가져온다.

<br>

## 아쉬운 점
- 입력값 보완 : 가독성
 - `len_array = []`로 선언하여 input값을 구했던 방식을 `max_len = max(len(x) for x in array)`와 같은 방식으로 간단하게 구현할 수 있을 것 같다. (for문을 사용한다는것은 똑같음. 단순 가독성)

<br>

---


### 성능 요약

메모리: 31120 KB, 시간: 36 ms

### 분류

구현, 문자열

### 제출 일자

2024년 8월 5일 15:45:30

