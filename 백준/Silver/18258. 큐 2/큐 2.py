import queue, sys
q = queue.Queue()
N = int(sys.stdin.readline().rstrip('\n'))
answer = []
for _ in range(N) :
    a = sys.stdin.readline().rstrip('\n')
    if a.startswith('push') :
        _, y = a.split()
        q.put(y)
    elif a == 'pop' :
        if q.empty() :
            answer.append(-1)
        else : 
            answer.append(q.get())
    elif a == 'size' :
        answer.append(q.qsize())
    elif a == 'empty' :
        if q.empty() :
            answer.append(1)
        else :
            answer.append(0)
    elif a == 'front' :
        if not q.empty() :
            answer.append(q.queue[0])
        else :
            answer.append(-1)
    elif a == 'back' :
        if not q.empty() :
            answer.append(q.queue[-1])
        else :
            answer.append(-1)
print("\n".join(map(str, answer)))        
        