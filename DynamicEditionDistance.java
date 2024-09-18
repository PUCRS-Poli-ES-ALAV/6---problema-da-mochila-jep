public class DynamicEditionDistance {
    public static int contOp;

    public static void main(String[] args) {
        long start = System.nanoTime();
        System.out.println("Resultado: " + dynamicEditionDistance("Maven, a Yiddish word meaning accumulator of knowledge, began as an attempt to simplify the build processes in the Jakarta Turbine project. There were several projects, each with their own Ant build files, that were all slightly different JARs were checked into CVS. We wanted a standard way to build the projects, a clear definition of what the project consisted of, an easy way to publish project informatio and a way to share JARs across several projects. The result is a tool that can now  used for building and managing any Java-based project. We hope that we have created something that will make the day-to-day work of Java developers easier and generally help with the comprehension of any Java-based project.", "This post is not about deep learning. But it could be might as well. This is the power of kernels. They are universally applicable in any machine learning algorithm. Why you might ask? I am going to try to answer this question in this article. Go to the profile of Marin Vlastelica Pogančić Marin Vlastelica Pogančić Jun."));
        long end = System.nanoTime();
        System.out.println("Iterações: " + contOp);
        System.out.println("Tempo: " + (double)(end - start)/1000000);
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
