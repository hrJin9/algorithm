# [Silver IV] 균형잡힌 세상 - 4949 

[문제 링크](https://www.acmicpc.net/problem/4949) 

## 문제 풀이
저번 문제와 다른 점이 있다면 짝의 종류에 대괄호가 추가된 것인데, `in` 키워드를 이용해서 `([`를 공통적으로 처리할 수 있다.
``` python
if s in '([' :
   stk.append(s)
```


## 알게된 점
### 1. 빈 리스트 검사 : `not {리스트}`
빈 리스트 여부를 검사할 때는 `not` 키워드를 쓰면 `len({리스트})` 보다 간단하게 나타낼 수 있다.
``` python
list = []
if not list :
```

### 2. 구체적인 입력값 개행문자 처리 : `lstrip({문자})` / `rstrip({문자})`
단순히 `strip()`을 쓰는 것 보다 왼쪽/오른쪽 순서와 어떤 문자를 없앨 것인지 명확하게 처리해주는 것이 좋다.

특히 이번 문제의 경우 마지막 입력값인 .에 왼쪽 공백이 있었어서...

``` python
import sys
S = sys.stdin.readline().rstrip('\n')
```

<br>

---


### 성능 요약

메모리: 31120 KB, 시간: 52 ms

### 분류

자료 구조, 스택, 문자열

### 제출 일자

2024년 8월 14일 14:34:48
