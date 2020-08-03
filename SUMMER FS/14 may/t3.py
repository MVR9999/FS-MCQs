
def printMax(arr, n, k): 
  max = 0
  
  for i in range(n - k + 1): 
    max = arr[i] 
    for j in range(1, k): 
      if arr[i + j] > max: 
        max = arr[i + j] 
    print(str(max) + " ", end = "") 

n,k=list(map(int,input().split()))
li=input().rstrip().split()

printMax(li, n, k)

