def camelCase(s):
	count = 0
	for i in range(1,len(s)):
		if s[i]<='Z':
			count=count+1
	print(count+1)




s=input()
camelCase(s)