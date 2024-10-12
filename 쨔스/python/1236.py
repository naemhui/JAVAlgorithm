N, M = map(int, input().split())
castle = [input() for _ in range(N)]

cnt_r, cnt_c = 0, 0

for r in range(N):
    if 'X' not in castle[r]:
        cnt_r += 1

for c in range(M):
    if 'X' not in [castle[r][c] for r in range(N)]:
        cnt_c += 1

print(max(cnt_r, cnt_c))