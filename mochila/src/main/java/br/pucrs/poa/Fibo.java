package br.pucrs.poa;

public class Fibo{
    public static int fiboRec(int n){
        if(n <= 1){
            return n;
        }
        return fiboRec(n-1) + fiboRec(n-2);
    }

    public static int fibo(int n){
        int[] f = new int[n+1];
        f[0] = 0;
        f[1] = 1;
        for(int i = 2; i <= n; i++){
            f[i] = f[i-1] + f[i-2];
        }
        return f[n];
    }

    public static int memoizedFibo(int n){
        int[] f = new int[n+1];
        for(int i = 0; i <= n; i++){
            f[i] = -1;
        }
        return lookupFibo(f, n);
    }

    public static int lookupFibo(int[] f, int n){
        if(f[n] >= 0){
            return f[n];
        }
        if(n <= 1){
            f[n] = n;
        }else{
            f[n] = lookupFibo(f, n-1) + lookupFibo(f, n-2);
        }
        return f[n];
    }
    
}
