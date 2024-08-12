def solution(array) :
    answer = ''
    for i in range(max(len_array)) :
        for j in range(5) :
            if i < len(array[j]) :
                answer += array[j][i]
    return answer

array = []
len_array = []
for _ in range(5) :
    S = input()
    array.append(S)
    len_array.append(len(S))

print(solution(array))
