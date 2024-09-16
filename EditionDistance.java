public class EditionDistance {
    public static int contOp = 0;

    public static void main(String[] args) {
        String str1 = "opoderosochefao";
        String str2 = "vincenzoinroma";
        long start = System.nanoTime();
        System.out.println(ED(str1, str2, str1.length() - 1, str2.length() - 1));
        long end = System.nanoTime();
        System.out.println("Tempo: " + (double)(end - start)/1000000);
        System.out.println("Operações: " + contOp);
    }

    public static int ED(String str1, String str2, int i, int j) {
        contOp++;
        if(i == -1) return i + 1;
        if(j == -1) return j + 1;
        if(str1.charAt(i) == str2.charAt(j)) ED(str1, str2, i-1, j-1);
        int subCost = ED(str1, str2, i-1, j-1) + 1;
        int addCost = ED(str1, str2, i, j-1) + 1;
        int removeCost = ED(str1, str2, i-1, j) + 1;
        
        return Math.min(subCost, Math.min(addCost, removeCost));
    }
}
