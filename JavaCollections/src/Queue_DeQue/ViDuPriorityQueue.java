
package Queue_DeQue;

import java.util.PriorityQueue;
import java.util.Queue;

public class ViDuPriorityQueue {

    public static void main(String args[]) {
       Queue danhSachSV = new PriorityQueue();
		
	danhSachSV.offer("TITV 2");
	danhSachSV.offer("Nguyen Van C");
	danhSachSV.offer("Nguyen Van B");
	danhSachSV.offer("TITV 1");
		
	while(true) {
	String ten = (String) danhSachSV.poll();  // => lấy ra và xóa
	if(ten==null) {
	break;
        }
	//peek => lấy ra nhưng không xóa.
	System.out.println(ten);
      } 
   }
}
