public class DynamicEditionDistance {
    public static int contOp;

    public static void main(String[] args) {
        long start = System.nanoTime();
        System.out.println(dynamicEditionDistance("opoderosochefao", "vincenzoinroma"));
        long end = System.nanoTime();
        System.out.println("Tempo: " + (double)(end - start)/1000000);
        System.out.println("Operações: " + contOp);
    }

    public static int dynamicEditionDistance(String A, String B) {
        int m = A.length();
        int n = B.length();

        int matriz[][] = new int[m + 1][n + 1];
        matriz[0][0] = 0;
        for (int i = 1; i <= m; i++) {
            contOp++;
            matriz[i][0] = matriz[i-1][0] + 1;
        }
        for (int i = 1; i <= n; i++) {
            contOp++;
            matriz[0][i] = matriz[0][i-1] + 1;
        }
        int custoExtra;
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                contOp++;
                if (A.charAt(i - 1) == B.charAt(j - 1)) custoExtra = 0;
                    else custoExtra = 1;

                matriz[i][j] = Math.min(matriz[i-1][j] + 1, Math.min(matriz[i][j-1] + 1, matriz[i-1][j-1] + custoExtra));
            }
        }
        return matriz[m][n];
    }

    /*

    casa, meta

           m  e  t  a
       [0][1][2][3][4]
     c [1][1][2][3][4]
     a [2][2][2][3][3]
     s [3][3][3][3][4]
     a [4][4][4][4][3]
     */
}
