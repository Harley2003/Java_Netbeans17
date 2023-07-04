
package BASIC;

public class Break_Continue {

    public static void main(String args[]) {
        // Break
        int i, j = 0;
        for (i = 0; i < 10; i++) {
            for (j = 0; j < 20; j++) {
                if (j > 10)
                    break;
            }
            System.out.println("i = " + i + ": " + "j = " + j);
        }
        System.out.println("i = " + i + ": " + "j = " + j);
        
        // Break sử dụng lebal
        loop: for (i = 0; i< 10; i++) {
            for (j = 0; j < 20; j++) {
                if (j >10)
                    break loop;
            }
            System.out.println("i = " + i + ": " + "j = " + j);
        }
        System.out.println("i = " + i + ": " + "j = " + j);
        
        // Continue
        for (i = 0; i < 100; i++) {
            if (i < 50)
                continue;
            System.out.println(i);
        }
        
        // Continue sử dụng lebal
//        loop: for (int i = 2; i <= 9; i++) {
//            for (int j = 1; j <= 10; j++) {
//                if (i < 5)
//                    continue loop;
//                System.out.println(i + " * " + j + " = " + (i*j));         
//            }               
//        }   
    }
}
