'''
알 유충 번데기 성충
A B C D
알: 1일도 안됨
나머지: 일주일
다음 단계로 가는 것 항상 일요일
모기 : E개의 알을 낳고 죽음 - 1마리 유충이 부화
유충 중 일부는 죽거나 잡아먹힘 -> R번째 유충만 일요일에 번데기
5번째 번데기 성충 -> 나머지 말라죽음
'''
while True:
    try:
        M, P, L, E, R, S, N = map(int, input().split())
        # 모기 / 번데기 / 유충 / 알 개수 / 살아남는 유충 : 번데기 / 모기 수를 구하는 시점
        for i in range(N):
            total = M
            M = P//S
            P = L//R
            L = total*E
        print(M)
    except:
        break