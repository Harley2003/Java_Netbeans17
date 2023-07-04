package BASIC;

import java.util.Scanner; // phần bắt buộc để scan

public class Scan {
    public static void main(String args[]) {
        // Khởi tạo 1 đối tượng scanner
        Scanner sc = new Scanner(System.in);
        
        // Nhập chuỗi
        System.out.println("Mời nhập chuỗi: ");
        String str = sc.nextLine();
        System.out.println("Chuỗi là: " + str);
        
        // Nhập số nguyên
        System.out.println("Mời nhập vào 1 số nguyên: ");
        int a = sc.nextInt();
        System.out.println("Số nguyên là: " + a);
        
        // Nhập số thập phân
        System.out.println("Mời nhập vào 1 số thực: ");
        float b = sc.nextFloat();
        System.out.println("Số thực là: " + b);
        
        // Khai báo riêng từng đối tượng cho mỗi lần nhập
        System.out.println("Mời nhập chuỗi lần thứ 2: ");
        String ten = new Scanner(System.in).nextLine();
        System.out.println("Chuỗi lần thứ 2 là: " + str);
    }
}