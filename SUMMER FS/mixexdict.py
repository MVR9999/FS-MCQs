import operator
def find(age,mon):
    
    if(max(age)>60 or max(mon)>100):
        return "-1"
    if(len(set(age))==3 and len(set(mon))==3):
        d={}
        d[age[0]]=mon[0]
        d[age[1]]=mon[1]
        d[age[2]]=mon[2]
        d=sorted(d.items(),key=operator.itemgetter(0))
        
        s1=d[0][0]+d[0][1]
        s2=d[1][0]+d[1][1]
        s3=d[2][0]+d[2][1]

        
        if(s1<s2 and s2<s3):
            return "Correct"
    if(len(set(age))==2 and len(set(mon))==2):
        if(age[0]==age[1] and mon[0]==mon[1]):
            if(age[2]>age[0] and mon[2]>mon[0]):
                return "Correct"
            if(age[2]<age[0] and mon[2]<mon[0]):
                return "Correct"    
        if(age[0]==age[2] and mon[0]==mon[2]):
            if(age[1]>age[0] and mon[1]>mon[0]):
                return "Correct"
            if(age[1]<age[0] and mon[1]<mon[0]):
                return "Correct"
        if(age[2]==age[1] and mon[2]==mon[1]):
            if(age[2]>age[0] and mon[2]>mon[0]):
                return "Correct"
            if(age[2]<age[0] and mon[2]<mon[0]):
                return "Correct"
    if(len(set(age))==1 and len(set(mon))==1):
        return "Correct"
    return "Not Correct"    
n=int(input())
age=[]
mon=[]
res=[]
for i in range(n):
   l=list(map(int,input().split(" ")))
   a=[]
   m=[]
   for j in range(3):
        a.append(l[j])
   
   for j in range(3,6):
       m.append(l[j])
   
   res.append(find(a,m))   
for i in res:
    print(i)
