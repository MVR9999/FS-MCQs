n = int(input())
l = list(map(int,input().split()))
right_min = [0]*n
left_max = l[0]
right_min[n-1] = l[n-1]
count = True
for i in range(n-2,-1,-1):
	right_min[i] = min(right_min[i+1], l[i+1])  

print(right_min)
for i in range(1,n-1):
	if l[i]<=right_min[i] and l[i]>=left_max:
		print(l[i])
		count = False
		break
	left_max = max(left_max,l[i])
if count:
	print(-1)
