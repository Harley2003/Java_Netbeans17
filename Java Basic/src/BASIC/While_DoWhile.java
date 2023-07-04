
package BASIC;

import java.util.Scanner;

public class While_DoWhile {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int x = 1;
        while (x!=0) {            
            System.out.println("Nhập x = 0 để thoát!");
            x = sc.nextInt();
        }
        int i = 0;
        while (true) {
            System.out.println(i);
            i++;
        if (i == 5)
            break;
        }
        
        int n;
        do {
            System.out.println("Enter n: ");
            n = sc.nextInt();
        }while (n <= 0);
    }
}
