
package BASIC;

import java.util.Scanner;

public class Try_Catch_Finally {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        
        // try
        try {
            System.out.println("Nhập vào số nguyên: ");
            n = sc.nextInt();
        // catch
        } catch (Exception e) {
            System.out.println("Nhập không đúng!");
        // finally
        } finally {
            System.out.println("Nhập sô sai hoặc đúng!");
        }
        System.out.println("Số nguyên n: " + n); 
    }
}
