def minEatingSpeed(piles,H):
	left=1
	right=max(piles)
	
	while left <= right:
		mid=int(left +(right-left)/2)
		if canEatInTime(piles,mid,H):
			right=mid-1
		else:
			left =mid+1
	return left

def canEatInTime(piles,k,h):
	hours=0
	for i in range(len(piles)):
		div=int(piles[i] / k)
		hours+=div
		if piles[i] %k !=0:
			hours=hours+1
	return hours <=h
	

n=int(input())
piles=list(map(int,input().split()))
H=int(input())

print(int(minEatingSpeed(piles , H)))
