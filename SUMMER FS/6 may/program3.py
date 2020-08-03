def findErrorNums(nums):
	sall = sum(list(range(1, len(nums)+1)))
	sset = sum(set(nums))
	snum = sum(nums)
	
	miss    = sall - sset
	repeat  = snum - sset
	
	return [repeat, miss]

n=int(input())
nums=list(map(int,input().split()))
res=findErrorNums(nums)
print(res[0],res[1])
