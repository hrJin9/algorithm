import sys

def count(board, x, y) :
    w_count = 0
    b_count = 0
    for i in range(8) :
        for j in range(8) :
            if (i+j)%2 == 0 : # 합이 짝수 -> 첫칸의 색과 같아야 함 -> 반대인 값을 칠해줌
                if board[x+i][y+j] == 'B' :
                    w_count += 1
                else : 
                    b_count += 1
            else : # 홀수칸 -> 첫 칸의 색과 달라야 함 -> 같은 색의 값을 칠해줌
                if board[x+i][y+j] == 'B' :
                    b_count += 1 
                else :
                    w_count += 1
    return min(w_count, b_count)

def solution(N, M, board) :
    arr = []
    for i in range(N-7) :
        for j in range(M-7) :
            arr.append(count(board, i, j))
    return min(arr)


N, M = map(int, sys.stdin.readline().split())
board = [sys.stdin.readline().rstrip() for _ in range(N)]
print(solution(N, M, board))
