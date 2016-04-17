/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fiborecursive;

/**
 *
 * @author fachrur_122
 */
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
        // TODO code application logic here
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
