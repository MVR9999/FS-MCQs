s = input()
s2 = s.lower()
li = []
ans = ""
for i in range(len(s)):
		if s2[i] not in li:
				ans += s[i]
				li.append(s2[i])
		else:
			li.remove(s2[i])
print(ans)