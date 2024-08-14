# [Silver IV] 스택 2 - 28278 

[문제 링크](https://www.acmicpc.net/problem/28278) 

## 문제풀이
### 파이썬의 stack 구현체
list는 stack으로 구현되어있다.
- stack 쌓기
  
  	`list.append(값)`
- stack에서 (마지막값)뽑아내기
  
	`list.pop()`

list에서 인덱스로 접근할때, 음수를 이용하면 마지막 인덱스부터 접근할 수 있다.
- 마지막 인덱스값 접근
  
  	`list[-1]` 



<br>

## 주의할 점

### input() 시간초과 이슈
기본적으로 input()을 통해 입력값을 받게되면 시간초과오류가 날 수 있다.

좀 더 효율적인 sys라이브러리를 통해 입력값을 받는 습관을 들이면 좋을 것 같다.

```python
import sys
input = sys.stdin.readline()
```

### 3항연산자 사용
파이썬의 경우 다른 언어에서 사용하는 것과 다르게 삼항연산자를 사용한다.
``` python
True값 if Ture조건문 else False값
```


<br>

---


### 성능 요약

메모리: 111944 KB, 시간: 588 ms

### 분류

자료 구조, 스택

### 제출 일자

2024년 8월 14일 12:34:27

