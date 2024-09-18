public class EditionDistance {
    public static int contOp = 0;

    public static void main(String[] args) {
        String str1 = "Maven, a Yiddish word meaning accumulator of knowledge, began as an attempt to simplify the build processes in the Jakarta Turbine project. There were several projects, each with their own Ant build files, that were all slightly different JARs were checked into CVS. We wanted a standard way to build the projects, a clear definition of what the project consisted of, an easy way to publish project informatio and a way to share JARs across several projects. The result is a tool that can now  used for building and managing any Java-based project. We hope that we have created something that will make the day-to-day work of Java developers easier and generally help with the comprehension of any Java-based project.";
        String str2 = "This post is not about deep learning. But it could be might as well. This is the power of kernels. They are universally applicable in any machine learning algorithm. Why you might ask? I am going to try to answer this question in this article. Go to the profile of Marin Vlastelica Pogančić Marin Vlastelica Pogančić Jun.";
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