
package BASIC;

import java.util.Scanner;

public class Array {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double arr[];
        arr = new double[10];
        System.out.println("Nhập phần tử: ");
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextDouble();
        }
        
            double sum = 0;
            for (int i = 0; i < arr.length; i++) {
            sum += arr[i];           
        }
            System.out.println("Sum = " + sum);

        System.out.println("Nhập phần tử: ");
        double[] arr2;
        arr2 = new double[] {1, 2, 3, 4, 5};
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);            
        }       
    }
}
