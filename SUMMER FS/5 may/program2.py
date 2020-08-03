def getHint(secret, guess):
        bull, cow = 0, 0
        s = {} # secret hashtable
        g = {} # guess hashtable
        
        for i in range(len(secret)):
            if secret[i] == guess[i]:
                bull += 1
            else:
                s[secret[i]] = s.get(secret[i], 0) + 1
                g[guess[i]] = g.get(guess[i], 0) + 1
        
        for k in s:
            if k in g:
                cow += min(s[k], g[k])
        
        return '{0}B{1}C'.format(bull, cow)

secret=input()
guess=input()
print(getHint(secret,guess))