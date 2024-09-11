package br.pucrs.poa;

public class Main {

    public static void main(String[] args) {
        System.out.println("Fibonacci Recursivo: " + Fibo.fiboRec(10));
        System.out.println("Fibonacci Iterativo: " + Fibo.fibo(10));
        System.out.println("Fibonacci Memoizado: " + Fibo.memoizedFibo(10));
    }
    
}
