def mString(a, b):
    answer = ''
    a += '~'
    b += '~'
    i = 0
    j = 0
    while a[i] != '~' or b[j] != '~':
        if a[i] != '~' and a[i:] < b[j:]:
            answer += a[i]
            i += 1
        else:
            answer += b[j]
            j += 1
    return answer

a=input()
b=input()
print(mString(a,b))


