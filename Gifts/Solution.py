n = int(input())
a = list(map(int, input().split()))
res = [0] * n
for i in range(n):
  res[a[i]-1] = i
for x in res:
  print(x+1, end= " ")