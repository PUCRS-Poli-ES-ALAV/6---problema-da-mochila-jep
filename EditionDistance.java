public class EditionDistance {
    public static int ED(String str1, String str2, int i, int j) {

        if(str1.isEmpty() && str2.isEmpty()) return 0;
        if(str1.isEmpty() || str2.isEmpty()) return Math.max(str1.length(), str2.length());

        if(str1.charAt(i) == str2.charAt(j)) ED(str1, str2, i-1, j-1);
        int subCost = ED(str1, str2, i-1, j-1) + 1;
        int addCost = ED(str1, str2, i, j-1) + 1;
        int removeCost = ED(str1, str2, i-1, j) + 1;

        return Math.min(subCost, Math.min(addCost, removeCost));
    }

    public static void main(String[] args) {
        String str1 = "casa";
        String str2 = "meta";
        System.out.println(ED(str1, str2, str1.length(), str2.length()));
    }
}
