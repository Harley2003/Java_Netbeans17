
package BASIC;

import java.util.Scanner;

public class ToanTu3Ngoi {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vaò 1 số nguyên: ");
        int a = sc.nextInt();
        
        // Điều Kiện
        String xetSo = (a % 2 == 0)?"Chẵn": "Lẻ";
        System.out.println(xetSo); 
    }
}
