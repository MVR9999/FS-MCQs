def equalStacks(h1, h2, h3):
  s1, s2, s3 = map(sum, (h1, h2, h3))
  while h1 and h2 and h3:
    m = min(s1, s2, s3)
    while s1 > m: s1 -= h1.pop(0)
    while s2 > m: s2 -= h2.pop(0)
    while s3 > m: s3 -= h3.pop(0)
    if s1 == s2 == s3: return s1
  return 0

lst=input().split()
n1=int(lst[0])
n2=int(lst[1])
n3=int(lst[2])
h1,h2,h3=list(),list(),list()
h1=list(map(int,input().split()))
h2=list(map(int,input().split()))
h3=list(map(int,input().split()))
print(equalStacks(h1,h2,h3))

def maxHeight(l1,l2,l3):
  c1,c2,c3=[],[],[]
  t=0
  for i in l1[::-1]:
    t+=i
    c1.append(t)
  t=0
  for i in l2[::-1]:
    t+=i
    c2.append(t)
  t=0
  for i in l3[::-1]:
    t+=i
    c3.append(t)
  k=set(c1).intersection(c2).intersection(c3) 
  return max(k) if k else 0

print(maxHeight(h1,h2,h3))


def maxsize(l1,l2,l3):
  while(1):
    a,b,c=sum(l1),sum(l2),sum(l3)
    if(a==b and b==c):
      return a
    else:
      m=max(a,b,c)
      if(m==a):
        l1.pop(0)
      elif(m==b):
        l2.pop(0)
      else:
        l3.pop(0)

print(maxsize(h1,h2,h3))
