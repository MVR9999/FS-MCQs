def countNegatives(grid):
	count = 0
	for i in range(len(grid)):
		for j in range(len(grid[0])):
			if grid[i][j]<0:
				count +=1
	return(count)


n=int(input())
grid=[ list(map(int,input().split())) for _ in range(n)]
print(countNegatives(grid))
