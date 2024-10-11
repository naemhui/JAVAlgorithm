'''
8*8 체스판, 왕 하나
킹은 현재 위치, 알파벳은 열, 숫자는 행
열: A~H
행: 1~8

R L B T RT LT RB LB
오 왼 아 위 오위 왼위 오아 왼아
'''
arr = [[0]*9 for _ in range(9)]
King, rock, N = input().split()

alp = ['A', 'B', 'C', 'D', 'E', 'F', 'G', 'H']
move_type = ['R', 'L', 'B', 'T', 'RT', 'LT',' RB', 'LB']
dx = [1, -1, 0, 0, 1, -1, 1, -1]
dy = [0, 0, -1, 1, 1, 1, -1, -1]


for _ in range(N):
    move = input()
    