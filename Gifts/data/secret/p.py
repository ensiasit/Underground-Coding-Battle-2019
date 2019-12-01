n=int(input())
t=[int(x) for x in input().split()]
list=[0]*len(t)
for i in t:
    if i>=len(t) or i<0 :
        list[len(t)%i]=i
    else :
        list[i]=i
print(" ".join(str(x) for x in list))