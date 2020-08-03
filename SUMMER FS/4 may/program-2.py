def printVertically(s):
	words = s.split(' ')
	#print(words)
	mx = max(len(word) for word in words)
	ans = []
	for i in range(mx):
		l = []
		for word in words:
			l.append(word[i] if i < len(word) else ' ')
		ans.append(''.join(l).rstrip())
	return ans


s=input()
for i in printVertically(s):
	print(i,end='\n')
