
#GENERATE ALL PRIMES UPTO N



def seiveOfEratosthenes():
    global n
    n=1000040
    #initializing all numbers by 1
    primes=[1 for i in range(n)]
    primes[0]=0
    primes[1]=0
    curr=2
    while(curr*curr<=n):
        if(primes[curr]==0):
            curr=curr+1
            continue
        #assigning the value zero for the multiples of 2,3,5 and 7
        for i in range(curr*curr,n,curr):
            primes[i]=0
        curr=curr+1
    return primes
 arr=seiveOfEratosthenes()
 print(arr)
