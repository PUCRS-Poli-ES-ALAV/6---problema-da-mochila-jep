public class Main {
    public static void main(String[] args) {
        System.out.println("# Fibonacci Recursivo");
        System.out.println("[4]" + Fibo.fiboRec(4));
        System.out.println("[8]" + Fibo.fiboRec(8));
        System.out.println("[16]" + Fibo.fiboRec(16));
        System.out.println("[32]" + Fibo.fiboRec(32));

        System.out.println("# Fibonacci Iterativo");
        System.out.println("[4]" + Fibo.fiboRec(4));
        System.out.println("[8]" + Fibo.fiboRec(8));
        System.out.println("[16]" + Fibo.fiboRec(16));
        System.out.println("[32]" + Fibo.fiboRec(32));

        System.out.println("# Fibonacci Memoizado");
        System.out.println("[4]" + Fibo.fiboRec(4));
        System.out.println("[8]" + Fibo.fiboRec(8));
        System.out.println("[16]" + Fibo.fiboRec(16));
        System.out.println("[32]" + Fibo.fiboRec(32));
        System.out.println("[128]" + Fibo.fiboRec(128));
        System.out.println("[1000]" + Fibo.fiboRec(1000));
        System.out.println("[10000]" + Fibo.fiboRec(10000));
    }
}
