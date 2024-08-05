words = [input() for _ in range(5)]
max_len = max(len(w) for w in words)


str = ''
for i in range(max_len) :
    for j in range(5) :
        if i < len(words[j]) :
            str += words[j][i]
            
print(str)
    