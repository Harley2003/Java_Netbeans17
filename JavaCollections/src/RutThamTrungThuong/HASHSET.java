
package RutThamTrungThuong;

import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
public class HASHSET {
    Set<String> tapHopPhieuDuThuong = new HashSet<String>();

    public HASHSET() {
        this.tapHopPhieuDuThuong = tapHopPhieuDuThuong;
    }
    
    public boolean themPhieu (String giaTri) {
        return this.tapHopPhieuDuThuong.add(giaTri);
    }
    
    public boolean xoaPhieu (String giaTri) {
        return this.tapHopPhieuDuThuong.remove(giaTri);
    }
    
    public boolean kiemTraPhieuTonTai (String giaTri) {
        return this.tapHopPhieuDuThuong.contains(giaTri);
    }
    
    public void xoaHetPhieu () {
        this.tapHopPhieuDuThuong.clear();
    }
    
    public int laySoLuong () {
        return this.tapHopPhieuDuThuong.size();
    } 
    
    public String rutTham () {
        String ketQua = "";
        Random rd = new Random();
        int viTri = rd.nextInt(this.tapHopPhieuDuThuong.size());
        ketQua = (String) this.tapHopPhieuDuThuong.toArray()[viTri];
        return ketQua;
    }
    
    public void inTatCa () {
        System.out.println(Arrays.toString(this.tapHopPhieuDuThuong.toArray()));
    }

    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int luaChon = 0;
      HASHSET rutTham = new HASHSET();
      do {
        System.out.println("-----Rút Thăm Trúng Thương-----");
        System.out.println("1. Thêm mã số dự thưởng.");
	System.out.println("2. Xóa mã số dự thưởng.");
	System.out.println("3. Kiểm tra mã số dự thưởng có tồn tại hay không?");
	System.out.println("4. Xóa tất cả các phiếu dự thưởng.");
	System.out.println("5. Số lượng phiếu dự thưởng.");
	System.out.println("6. Rút thăm trúng thưởng.");
	System.out.println("7. In ra tất cả các phiếu.");
	System.out.println("0. Thoát khỏi chương trình");
        luaChon = sc.nextInt();
        sc.nextLine();
        if(luaChon == 1 || luaChon == 2 || luaChon == 3) {
            System.out.println("Nhập vào mã phiếu dự thưởng: ");
            String giaTri = sc.nextLine();
            if (luaChon == 1) {
                rutTham.themPhieu(giaTri);
            } else if (luaChon == 2) {
                rutTham.xoaHetPhieu();
            } else {
                System.out.println("Kết quả kiểm tra: " + rutTham.kiemTraPhieuTonTai(giaTri));
            }
        } else if (luaChon == 4) {
            rutTham.xoaHetPhieu();
        } else if (luaChon == 5) {
            System.out.println("Số lượng phiếu: " + rutTham.laySoLuong());
        } else if (luaChon == 6) {
            System.out.println("Mã số trúng thưởng: " + rutTham.rutTham());
        } else if (luaChon == 7) {
            System.out.println("Các mã phiếu dự thưởng là: ");
            rutTham.inTatCa();
        }
      }while(luaChon != 0);        
    }
}
