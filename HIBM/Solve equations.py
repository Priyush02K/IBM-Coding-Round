# Question 22 : Solve equations
# Solve the given equations: You will be given an array, and T number of equations. Solve that equation and update the array for every equation you solve
# Input Example:
# 2 3 4 5 1 → input array
# 3 → number of equations
# x*x
# x+x
# 3*x+x

# Output:
# 32 72 128 200 8
# Explanation :

# For first case array becomes arr=[ 4 9 16 25 1]
# For second case array becomes arr=[8 18 32 50 2]
# For third case array becomes arr=[32 72 128 200 8]
# Output will be : 32 72 128 200 8

n=int(input())
arr=list(map(int,input().split()))
t=int(input())
Lam=[]
for i in range(t):
    Lam.append(input())
for k in range(t):
    for i in range(n):
        x=arr[i]
        arr[i]=eval(Lam[k])
print(*arr)