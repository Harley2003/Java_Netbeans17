
package BASIC;

import java.util.Scanner;

public class BangCuuChuong {

    public static void main(String args[]) {
       //        for (int i = 2; i <= 9; i++) {
//            for (int j = 1; j <= 10; j++) {
//                System.out.println(i + " * " + j + " = " + (i*j));
//            }
//            System.out.println("--------");
//        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        
        for (int i = 0; i <= 10; i++) {               
        System.out.println(n + " * " + i + " = " + (n*i));
        } 
    }
}
