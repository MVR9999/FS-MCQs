def minOpers(interns, target):
  count = 0
  for curr in interns:
    if curr - target >= 5:
      count += (curr - target) // 5
      curr = target + (curr - target) % 5
    if curr - target >= 2:
      count += (curr - target) // 2
      curr = target + (curr - target) % 2
    if curr - target == 1:
      count += 1
  return count

n = int(input().strip())
interns = input().strip().split(' ')
interns = sorted([int(i) for i in interns])
target = interns[0]
scores = [minOpers(interns, target)]
if target >= 2:
	scores.append(minOpers(interns, target - 2))
if target >= 1:
	scores.append(minOpers(interns, target - 1))
print(min(scores))

