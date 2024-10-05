N, K = map(int, input().split())
seq = list(map(int, input().split(',')))

for _ in range(K):
    for i in range(len(seq)-1):
        seq[i] = seq[i+1] - seq[i]
    seq.pop(-1)

print(','.join(map(str, seq)))