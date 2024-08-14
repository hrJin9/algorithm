# [Silver IV] 괄호 - 9012 

[문제 링크](https://www.acmicpc.net/problem/9012) 

## 문제 풀이
() 괄호가 하나의 짝으로, 입력값이 `)` 일때는 스택의 마지막값을 꺼내 올바른 짝인지 비교해주면 된다.

꺼낸 스택의 값이 `(` 일때는 그대로 꺼낸 채로 유지하고,
만약 값이 `)` 라면 다시 스택에 `)`를 넣어준다.

그 외의 경우는 모두 스택에 값을 추가해준다.
``` python
for i in range(len(S)) :
    if S[i] == ')' and len(stk) > 0 :
        stk_last = stk.pop()
        if stk_last != '(' :
            stk.append(stk_last)
            stk.append(S[i])
    else :
        stk.append(S[i])
```


## 알게된 점
### 1. `readline` 개행문자 입력값 주의 : `strip()`
  readline의 경우 개행문자인 \n 까지 입력되기 때문에 map함수를 쓰지 않을 경우에는 개행문자를 삭제하는 처리를 해주어야 한다.
  ``` python
  import sys
  input = sys.stdin.readline().strip()
  ```


### 성능 요약

메모리: 31252 KB, 시간: 36 ms

### 분류

자료 구조, 스택, 문자열

### 제출 일자

2024년 8월 14일 13:50:59


