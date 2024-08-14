import sys
input = sys.stdin.read
data = input().splitlines()

N = int(data[0])
stack = []
result = []

for i in range(1, N + 1):
    x = list(map(int, data[i].split()))
    if x[0] == 1:
        stack.append(x[1])
    elif x[0] == 2:
        result.append(-1 if len(stack) == 0 else stack.pop())
    elif x[0] == 3:
        result.append(len(stack))
    elif x[0] == 4:
        result.append(1 if len(stack) == 0 else 0)
    elif x[0] == 5:
        result.append(-1 if len(stack) == 0 else stack[-1])

sys.stdout.write("\n".join(map(str, result)) + "\n")
