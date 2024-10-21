public class Main {
    public static void main(String[] args) {
        System.out.println("\f\n\n# Fibonacci Recursivo");
        System.out.printf("[4] Res: %d, Ops: %d", Fibo.fiboRec(4), Fibo.getOperationsCounter());
        System.out.printf("\n[8] Res: %d, Ops: %d", Fibo.fiboRec(8), Fibo.getOperationsCounter());
        System.out.printf("\n[16] Res: %d, Ops: %d", Fibo.fiboRec(16), Fibo.getOperationsCounter());
        System.out.printf("\n[32] Res: %d, Ops: %d", Fibo.fiboRec(32), Fibo.getOperationsCounter());

        System.out.println("\n\n# Fibonacci Iterativo");
        System.out.printf("[4] Res: %d, Ops: %d", Fibo.iterativeFibo(4), Fibo.getOperationsCounter());
        System.out.printf("\n[8] Res: %d, Ops: %d", Fibo.iterativeFibo(8), Fibo.getOperationsCounter());
        System.out.printf("\n[16] Res: %d, Ops: %d", Fibo.iterativeFibo(16), Fibo.getOperationsCounter());
        System.out.printf("\n[32] Res: %d, Ops: %d", Fibo.iterativeFibo(32), Fibo.getOperationsCounter());
        System.out.printf("\n[128] Res: %d, Ops: %d", Fibo.iterativeFibo(128), Fibo.getOperationsCounter());
        System.out.printf("\n[1000] Res: %d, Ops: %d", Fibo.iterativeFibo(1000), Fibo.getOperationsCounter());
        System.out.printf("\n[10000] Res: %d, Ops: %d", Fibo.iterativeFibo(10000), Fibo.getOperationsCounter());

        System.out.println("\n\n# Fibonacci Memoizado");
        System.out.printf("[4] Res: %d, Ops: %d", Fibo.memoizedFibo(4), Fibo.getOperationsCounter());
        System.out.printf("\n[8] Res: %d, Ops: %d", Fibo.memoizedFibo(8), Fibo.getOperationsCounter());
        System.out.printf("\n[16] Res: %d, Ops: %d", Fibo.memoizedFibo(16), Fibo.getOperationsCounter());
        System.out.printf("\n[32] Res: %d, Ops: %d", Fibo.memoizedFibo(32), Fibo.getOperationsCounter());
        System.out.printf("\n[128] Res: %d, Ops: %d", Fibo.memoizedFibo(128), Fibo.getOperationsCounter());
        System.out.printf("\n[1000] Res: %d, Ops: %d", Fibo.memoizedFibo(1000), Fibo.getOperationsCounter());
        System.out.printf("\n[10000] Res: %d, Ops: %d", Fibo.memoizedFibo(10000), Fibo.getOperationsCounter());
    }
}
