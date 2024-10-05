'''
윷놀이
배(0) 등(1)
도 0111
개 0011
걸 0001
윷 0000
모 1111
'''
for _ in range(3):
    lst = list(map(int, input().split()))
    if lst.count(0) == 0:
        print('E')
    elif lst.count(0) == 1:
        print('A')
    elif lst.count(0) == 2:
        print('B')
    elif lst.count(0) == 3:
        print('C')
    else:
        print('D')