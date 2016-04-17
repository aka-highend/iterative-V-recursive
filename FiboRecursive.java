public class FiboRecursive {
	static int a = 0, b = 1, c = 0;
    static void printFiboRecurs(int n) {
        if (n > 0) {
            c = a + b;
            a = b;
            b = c;
            System.out.print("  " +c);
            printFiboRecurs(n - 1);
        }
    }
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
		
        int n = 10000;
        System.out.print(a+ "  " +b);
        printFiboRecurs(n - 2);
		
        long end = System.currentTimeMillis();
        long total = end - start;
        System.out.println("  Finisihed");
        System.out.println("Running time : " +total+ "ms");
    }
    
}