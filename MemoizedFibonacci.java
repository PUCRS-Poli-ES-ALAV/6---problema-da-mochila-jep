public class MemoizedFibonacci {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(memoizedFibonacci(new int[n + 1], n));
    }

    public static int memoizedFibonacci(int[] f, int n) {
        for (int i = 0; i <= n; i++)
            f[i] = -1;

        return lookUpFibo(f, n);
    }

    public static int lookUpFibo(int[] f, int n) {
        if (f[n] >= 0) return f[n];

        if (n <= 1) f[n] = n;
        else f[n] = lookUpFibo(f, n - 1) + lookUpFibo(f, n - 2);

        System.out.println(f[n]);
        return f[n];
    }
}