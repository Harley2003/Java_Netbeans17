
package BASIC;

import java.util.Scanner;

public class ChuyenDoiSo {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        // hệ 10 -> 2        
        String nhiPhan = "";
        while (n > 0) {
            nhiPhan = (n%2) + nhiPhan;
            n = n/2;           
        }
        System.out.println("Số Nhị Phân là: " + nhiPhan);  
    }
}
