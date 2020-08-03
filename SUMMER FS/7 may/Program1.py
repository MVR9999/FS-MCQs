def removeRepeats(s):
  lst = list(s)
  i = 0 
  while i < len(lst)-1:
    if lst[i]==lst[i+1]:
      del lst[i]
      del lst[i]
      i = 0
      if len(lst) == 0:
        print('-1')
        break
    else:
      i+=1
  return ''.join(lst)

def decompose(s):
  for i in range(len(s)-1):
    if s[i]==s[i+1]:
      return decompose(s[:i]+s[i+2:])
  return s if s else -1

s=input()
print(removeRepeats(s))
print(decompose(s))
