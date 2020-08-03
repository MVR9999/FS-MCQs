n=int(input())
a=list(map(int,input().split()))
s=a[-1]
a[-1]=-1
for i in range(n-2,-1,-1):
	temp=a[i]
	a[i]=s
	if temp>s:
		s=temp
print(*a)