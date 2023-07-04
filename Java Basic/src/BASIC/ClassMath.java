
package BASIC;

import java.util.Scanner;

public class ClassMath {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        double a = sc.nextDouble();
        System.out.println("Enter b: ");
        double b = sc.nextDouble();
        
        // so Pi
        double pi = Math.PI;
        System.out.println("Pi = " + pi);
        
        // so Logarit = E
        double e = Math.E;
        System.out.println("e = " + e);
        
        // Giá trị tuyết đối
        System.out.println("|a| = " + Math.abs(a));
        System.out.println("|b| = " + Math.abs(b));
        
        // Ceil _ data type (double) _ tăng giá trị và làm tròn số
        System.out.println("a = " + Math.ceil(a));
        System.out.println("a = " + Math.ceil(b));
        
        // floor _ data type (double) _ giảm giá trị và làm tròn số
        System.out.println("a = " + Math.floor(a));
        System.out.println("a = " + Math.floor(b));
        
        // Min, Max
        System.out.println("Min is: " + Math.min(a, b));
        System.out.println("Max is: " + Math.max(a, b));
        
        // Số mũ
        System.out.println("a ^ b = " + Math.pow(a, b));
        
        // Căn bậc hai
        System.out.println("Căn bậc hai của a = " + Math.sqrt(a));
        System.out.println("Căn bậc hai của b = " + Math.sqrt(b));
        
        // Sin, Cos
        System.out.println("Sin a = " + Math.sin(a));
        System.out.println("Sin a = " + Math.cos(b));
        
        // Random số
        double r = (int) Math.random();
        System.out.println("Random số: " + r);
        
        // Radian -> Độ
        double d = Math.toDegrees(Math.PI/2);
        System.out.println("Độ: " + d);
        
        // Độ -> Radian
        double raDian = sc.nextDouble();
        System.out.println("Radian: " + Math.toRadians(raDian)); 
    }
}
