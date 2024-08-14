import sys
N = int(sys.stdin.readline())
stack = []
result = []

for i in range(N):
    x = sys.stdin.readline().split()
    if x[0] == '1':
        stack.append(x[1])
    elif x[0] == '2':
        result.append(-1 if len(stack) == 0 else stack.pop())
    elif x[0] == '3':
        result.append(len(stack))
    elif x[0] == '4':
        result.append(1 if len(stack) == 0 else 0)
    elif x[0] == '5':
        result.append(-1 if len(stack) == 0 else stack[-1])

sys.stdout.write("\n".join(map(str, result)) + "\n")
