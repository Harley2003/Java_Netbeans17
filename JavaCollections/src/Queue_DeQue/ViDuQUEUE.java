
package Queue_DeQue;

import java.util.LinkedList;
import java.util.Queue;

public class ViDuQUEUE {

    public static void main(String args[]) {
        Queue danhSachSV = new LinkedList();
        
        danhSachSV.offer("Nguyen Van A");
	danhSachSV.offer("Nguyen Van B");
        danhSachSV.offer("TITV 1");
	danhSachSV.offer("TITV 2");
        
        while(true) {
            String ten = (String) danhSachSV.poll();
            if(ten == null) {
                break;
            }
        // poll: lấy ra và xóa
        // peek: lấy ra nhưng không xóa
            System.out.println(ten);
        }                                  
    }
}
