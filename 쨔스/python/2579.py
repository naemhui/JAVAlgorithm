N = int(input())
stairs = [int(input()) for _ in range(N)]
# print(stairs)

dp = [0]*N

# 계단 2개 이하면 그냥 세기
if len(stairs) <= 2:
    print(sum(stairs))

# 계단 3개 이상이면
elif len(stairs) >= 3:
    # 첫 계단 계산
    dp[0] = stairs[0]
    # 두 번째 계단 계산
    dp[1] = stairs[0] + stairs[1]
    # 세 번째 계단부터 점화식 계산
    for i in range(2, N):
        # i-3까지의 계단 점수 최댓값 + i-1 + i
        # i-2까지 계단 점수 최댓값 + i 계단 합
        dp[i] = max(dp[i-3] + stairs[i-1] + stairs[i], dp[i-2] + stairs[i])
    
    print(dp[-1])