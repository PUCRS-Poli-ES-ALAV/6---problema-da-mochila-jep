public class EditionDistance {
    public static int operationsCounter = 0;

    public static int recursiveEditionDistance(String str1, String str2, int i, int j) {
        operationsCounter++;
        if(i == -1) return i + 1;
        if(j == -1) return j + 1;
        if(str1.charAt(i) == str2.charAt(j)) recursiveEditionDistance(str1, str2, i-1, j-1);
        int subCost = recursiveEditionDistance(str1, str2, i-1, j-1) + 1;
        int addCost = recursiveEditionDistance(str1, str2, i, j-1) + 1;
        int removeCost = recursiveEditionDistance(str1, str2, i-1, j) + 1;
        
        return Math.min(subCost, Math.min(addCost, removeCost));
    }

    public static int dynamicEditionDistance(String A, String B) {
        int m = A.length();
        int n = B.length();

        int matriz[][] = new int[m + 1][n + 1];
        matriz[0][0] = 0;
        for (int i = 1; i <= m; i++) {
            operationsCounter++;
            matriz[i][0] = matriz[i-1][0] + 1;
        }
        for (int i = 1; i <= n; i++) {
            operationsCounter++;
            matriz[0][i] = matriz[0][i-1] + 1;
        }
        int custoExtra;
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                operationsCounter++;
                if (A.charAt(i - 1) == B.charAt(j - 1)) custoExtra = 0;
                    else custoExtra = 1;

                matriz[i][j] = Math.min(matriz[i-1][j] + 1, Math.min(matriz[i][j-1] + 1, matriz[i-1][j-1] + custoExtra));
            }
        }
        return matriz[m][n];
    }

    public static int getOperationsCounter() {
        int aux = operationsCounter;
        operationsCounter = 0;
        return aux;
    }
}