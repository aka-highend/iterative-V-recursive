public class FiboIterative {
    public static void main(String[] args) {
		long start = System.currentTimeMillis();
		
        int a = 0, b = 1, c, i, count = 10000;
		System.out.print(a+ "  " +b);
		
		for (i = 2; i < count; i++) {
            c = a + b;
            System.out.print("  " +c);
            a = b;
            b = c;
		}
		
		long end = System.currentTimeMillis();
        long total = end - start;
        System.out.println("  Finisihed");
        System.out.println("Running time : " +total+ "ms");
    }
    
}