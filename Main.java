import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("\f==========================================");
        System.out.println("# Fibonacci");

        System.out.println("## Recursivo");
        System.out.printf("[4] Res: %d, Ops: %d", Fibo.fiboRec(4), Fibo.getOperationsCounter());
        System.out.printf("\n[8] Res: %d, Ops: %d", Fibo.fiboRec(8), Fibo.getOperationsCounter());
        System.out.printf("\n[16] Res: %d, Ops: %d", Fibo.fiboRec(16), Fibo.getOperationsCounter());
        System.out.printf("\n[32] Res: %d, Ops: %d", Fibo.fiboRec(32), Fibo.getOperationsCounter());

        System.out.println("\n\n## Iterativo");
        System.out.printf("[4] Res: %d, Ops: %d", Fibo.iterativeFibo(4), Fibo.getOperationsCounter());
        System.out.printf("\n[8] Res: %d, Ops: %d", Fibo.iterativeFibo(8), Fibo.getOperationsCounter());
        System.out.printf("\n[16] Res: %d, Ops: %d", Fibo.iterativeFibo(16), Fibo.getOperationsCounter());
        System.out.printf("\n[32] Res: %d, Ops: %d", Fibo.iterativeFibo(32), Fibo.getOperationsCounter());
        System.out.printf("\n[128] Res: %d, Ops: %d", Fibo.iterativeFibo(128), Fibo.getOperationsCounter());
        System.out.printf("\n[1000] Res: %d, Ops: %d", Fibo.iterativeFibo(1000), Fibo.getOperationsCounter());
        System.out.printf("\n[10000] Res: %d, Ops: %d", Fibo.iterativeFibo(10000), Fibo.getOperationsCounter());

        System.out.println("\n\n## Memoizado");
        System.out.printf("[4] Res: %d, Ops: %d", Fibo.memoizedFibo(4), Fibo.getOperationsCounter());
        System.out.printf("\n[8] Res: %d, Ops: %d", Fibo.memoizedFibo(8), Fibo.getOperationsCounter());
        System.out.printf("\n[16] Res: %d, Ops: %d", Fibo.memoizedFibo(16), Fibo.getOperationsCounter());
        System.out.printf("\n[32] Res: %d, Ops: %d", Fibo.memoizedFibo(32), Fibo.getOperationsCounter());
        System.out.printf("\n[128] Res: %d, Ops: %d", Fibo.memoizedFibo(128), Fibo.getOperationsCounter());
        System.out.printf("\n[1000] Res: %d, Ops: %d", Fibo.memoizedFibo(1000), Fibo.getOperationsCounter());
        System.out.printf("\n[10000] Res: %d, Ops: %d", Fibo.memoizedFibo(10000), Fibo.getOperationsCounter());
        
        System.out.println("\n==========================================");
        System.out.println("# Mochila");
        System.out.println("\n## Recursivo");
        
        Item[] recItens1 = {
            new Item(23, 92),
            new Item(31, 57),
            new Item(29, 49),
            new Item(44, 68),
            new Item(53, 60),
            new Item(38, 43),
            new Item(63, 67),
            new Item(85, 84),
            new Item(89, 87),
            new Item(82, 72)
        };

        Item[] recItens2 = {
            new Item(56, 50),
            new Item(59, 50),
            new Item(80, 64),
            new Item(64,46),
            new Item(75, 50),
            new Item(17, 5)
        };
        
        System.out.printf("[N=10,C=165] Res: %d, Ops: %d", Backpack.recursiveBackpack(165, recItens1)[1], Backpack.getOperationsCounter());
        
        System.out.printf("\n[N=6,C=190] Res: %d, Ops: %d", Backpack.recursiveBackpack(190, recItens2)[1], Backpack.getOperationsCounter());
        
        System.out.println("\n\n## Dinâmico");
        List<Item> dynItems = Arrays.asList(
            null,
            new Item(23, 92),
            new Item(31, 57),
            new Item(29, 49),
            new Item(44, 68),
            new Item(53, 60),
            new Item(38, 43),
            new Item(63, 67),
            new Item(85, 84),
            new Item(89, 87),
            new Item(82, 72)
        );

        System.out.printf("[N=10,C=165] Res: %d, Ops: %d", Backpack.dynamicBackpack(10, 165, dynItems), Backpack.getOperationsCounter());

        dynItems = Arrays.asList(
            null,
            new Item(56, 50),
            new Item(59, 50),
            new Item(80, 64),
            new Item(64,46),
            new Item(75, 50),
            new Item(17, 5)
        );
            
        System.out.printf("\n[N=6,C=190] Res: %d, Ops: %d", Backpack.dynamicBackpack(6, 190, dynItems), Backpack.getOperationsCounter());
        
        System.out.println("\n==========================================");
        System.out.println("# Distância de Edição");

        String str1 = "Casablanca";
        String str2 = "Portentoso";
        
        System.out.printf("\nRecursivo: [caso 1] Res: %d, Ops: %d", EditionDistance.recursiveEditionDistance(str1, str2, str1.length() - 1, str2.length() - 1), EditionDistance.getOperationsCounter());
        System.out.printf("\nDinâmico: [caso 1] Res: %d, Ops: %d", EditionDistance.dynamicEditionDistance(str1, str2), EditionDistance.getOperationsCounter());
        
        str1 = "Maven, a Yiddish word meaning accumulator of knowledge, began as an attempt to simplify the build processes in the Jakarta Turbine project. There were several projects, each with their own Ant build files, that were all slightly different JARs were checked into CVS. We wanted a standard way to build the projects, a clear definition of what the project consisted of, an easy way to publish project informatio and a way to share JARs across several projects. The result is a tool that can now  used for building and managing any Java-based project. We hope that we have created something that will make the day-to-day work of Java developers easier and generally help with the comprehension of any Java-based project.";
        str2 = "This post is not about deep learning. But it could be might as well. This is the power of kernels. They are universally applicable in any machine learning algorithm. Why you might ask? I am going to try to answer this question in this article. Go to the profile of Marin Vlastelica Pogančić Marin Vlastelica Pogančić Jun.";
        
        // System.out.printf("\nRecursivo: [caso 2] Res: %d, Ops: %d", EditionDistance.recursiveEditionDistance(str1, str2, str1.length() - 1, str2.length() - 1), EditionDistance.getOperationsCounter());
        System.out.printf("\nDinâmico: [caso 2] Res: %d, Ops: %d", EditionDistance.dynamicEditionDistance(str1, str2), EditionDistance.getOperationsCounter());
    }
}
