n=int(input())
arr=list(map(int,input().split()))
arr.sort()
arr=sorted(arr, key=arr.count,reverse=True)
for j in arr:
	print(j,end=" ")
print()