def is_sub(s):
    if len(s) >= 1:
        for word in s:
            if (s.count(word) > 1):
                return False
        return True
    else:
        return False


def get_substring(s):
    l = len(s)
    min = 3
    max = 0
    lst = list()
    for i in range(0, l):
        for j in range(i + 1, l + 1):
            sub = s[i:j]
            # print(sub)
            if is_sub(sub):
                if len(sub) > max:
                    # print(sub)
                    max = len(sub)
                    lst.append(sub)
    if lst == []:
        return -1
    else:
        return lst[-1]

s = input()
ss=get_substring(s)
print(len(ss))
