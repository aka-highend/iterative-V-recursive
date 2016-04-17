/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fiboiterative;

/**
 *
 * @author fachrur_122
 */
public class FiboIterative {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
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
