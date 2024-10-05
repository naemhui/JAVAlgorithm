M = int(input())
N = int(input())


lst = []
for i in range(M,  N+1):
    root = i**0.5
    if i == int(root) ** 2:
        lst.append(i)

print(lst)
if len(lst) == 0:
    print(-1)
else:
    print(sum(lst))
    print(min(lst))