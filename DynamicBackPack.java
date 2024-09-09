import java.util.Arrays;
import java.util.List;

public class DynamicBackPack {
    public static void main(String[] args) {
        List<Item> itens = Arrays.asList(
            null,
            new Item(10,5),
            new Item(5,2),
            new Item(2,1),
            new Item(1,1),
            new Item(4,3),
            new Item(5,6)
        );
        System.out.println("Result: " + backPackPD(itens.size() - 1, 50, itens));
    }

    public static int backPackPD(int N, int C, List<Item> itens) {
        int[][] maxTab = new int[N+1][C+1];
        for (int i = 0; i < maxTab.length; i++) {
            maxTab[0][i] = 0;
            maxTab[i][0] = 0;
        }

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= C; j++) {
                if (itens.get(i).peso <= j) {
                    maxTab[i][j] = Math.max(maxTab[i-1][j], itens.get(i).valor + maxTab[i-1][j-itens.get(i).peso]);
                } else {
                    maxTab[i][j] = maxTab[i-1][j];
                }
            }
        }

        // for (int i = 0; i < maxTab.length; i++) {
        //     for (int j = 0; j < maxTab[0].length; j++) {
        //         System.out.printf("%d ", maxTab[i][j]);
        //     }
        //     System.out.println("\n");
        // }

        return maxTab[N][C];
    }

    /*
     * Inteiro backPackPD(Inteiro N, Inteiro C, Tupla<Inteiro, Inteiro> itens)

   maxTab[N+1][C+1];

   Inicialize com 0 toda a linha 0 e também a coluna 0;
   para i = 1 até N
      para j = 1 até C
         se item itens[i].peso <= j // se o item cabe na mochila atual
            maxTab[i][j] = Max(maxTab[i-1][j], 
                               itens[i].valor + 
                                 maxTab[i-1][j – itens[i].peso]);
         senão
            maxTab[i][j] = maxTab[i-1][j];

   retorne maxTab[N][C] // valor máximo para uma mochila de capacidade C e 		         
                        //que pode conter itens que vão do item 1 até o item N.
     */
}