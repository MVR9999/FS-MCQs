def smallestCommonElement(mat):
        res = set(mat[0])
        for m in mat[1:]:
            res = res & set(m)
        return -1 if not res else min(res)

m=int(input()) 
n=int(input())
mat=[]
for i in range(m):
	row=list(map(int,input().split()))
	mat.append(row)
print(smallestCommonElement(mat))

