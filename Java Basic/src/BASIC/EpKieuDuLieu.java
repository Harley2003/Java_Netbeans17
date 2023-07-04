package BASIC;

import java.util.Scanner;

public class EpKieuDuLieu {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        // Ép kiểu ngầm định (thủ công)
        // Chuyển từ dữ liệu nhỏ -> lớn
//        System.out.println("Enter a: ");
//        int a = sc.nextInt();
//        System.out.println("Enter b: ");
//        int b = sc.nextInt();
        
//        C1
//        float c = (float) a;
//        float d = (float) b;

//        C2
//        float c = a;
//        float d = b;
//        System.out.println("c = " + c);
//        System.out.println("d = " + d);
             
        // Ép kiểu tường minh (hẹp)
        // Chuyển từ dữ liệu lớn -> nhỏ
        System.out.println("Enter e: ");
        float e = sc.nextFloat();
        System.out.println("Enter f: ");
        float f = sc.nextFloat();
        
        int g = (int) e;
        int h = (int) f;
        
        System.out.println("g = " + g);
        System.out.println("h = " + h);   
    }
}