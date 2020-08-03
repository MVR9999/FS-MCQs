def solveEquation(equation):
        equation += '+'
        num,flag,equation_flag = 0,1,1
        cur = 0
        n = m = 0
        for i, ch in enumerate(equation):
            if ch.isdigit():
                cur = cur * 10 + int(ch)
            elif ch == 'x':
                pre = flag * cur * equation_flag
                m += pre if (pre or equation[i-1]=='0') else equation_flag*flag
                cur  = 0
            elif ch == '+':
                n += flag * cur * equation_flag
                flag = 1
                cur = 0
            elif ch == '-':
                n += flag * cur * equation_flag
                flag = -1
                cur = 0
            elif ch == '=':
                n += flag * cur * equation_flag
                equation_flag = -1
                cur = 0
                flag = 1
        if not m and n:
            return 'No solution'
        elif not m:
            return 'Infinite solutions'
        else:
            return 'x='+str(-n//m)

equation=input()
print(solveEquation(equation))
