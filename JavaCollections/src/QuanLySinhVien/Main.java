
package QuanLySinhVien;

import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        DanhSachSinhVien dssv = new DanhSachSinhVien();
        int luaChon = 0;
        do {
            System.out.println("--Danh Sách Quản Lý Sinh Viên--");

            System.out.println(
            "1. Thêm sinh viên vào danh sách.\n"
          + "2. In danh sách sinh viên ra màn hình.\n"
	  + "3. Kiểm tra danh sách có rỗng hay không.\n"
	  + "4. Lấy ra số lượng sinh viên trong danh sách.\n"
	  + "5. Làm rỗng danh sách sinh viên.\n"
	  + "6. Kiểm tra sinh viên có tồn tại trong danh sách hay không, dựa trên mã sinh viên.\n"
	  + "7. Xóa một sinh viên ra khỏi danh sách dựa trên mã sinh viên.\n"
	  + "8. Tìm kiếm tất cả sinh viên dựa trên Tên được nhập từ bàn phím.\n"
	  + "9. Xuất ra danh sách sinh viên có điểm từ cao đến thấp.\n"
	  + "0. Thoát khỏi chương trình"
        );
            System.out.println("Vui lòng chọn chức năng: ");
            luaChon = sc.nextInt();
            sc.nextLine();
            switch (luaChon) {
                case 1:
                    System.out.println("Nhập mã sinh viên: ");
                    String maSinhVien = sc.nextLine();
                    System.out.println("Nhập Họ Tên sinh viên: ");
                    String hoVaTen = sc.nextLine();
                    System.out.println("Nhập năm sinh sinh viên: ");
                    int namSinh = sc.nextInt();
                    System.out.println("Nhập điểm trung bình của sinh viên: ");
                    double diemTrungBinh = sc.nextDouble();
                    SinhVien sv = new SinhVien(maSinhVien, hoVaTen, namSinh, namSinh);
                    dssv.themSinhVien(sv);
                    break;
                case 2:
                    dssv.inDanhSachSinhVien();
                    break;
                case 3:
                    System.out.println("Danh sách rỗng: " + dssv.kiemTraDanhSachRong());
                    break;
                case 4:
                    System.out.println("Số lượng hiện tại: " + dssv.laySoLuongSinhVien());
                    break;
                case 5:
                    dssv.lamRongDanhSach();
                    break;
                case 6:
                    System.out.println("Nhập mã sinh viên: ");
                    maSinhVien = sc.nextLine();
                    sv = new SinhVien(maSinhVien);
                    System.out.println("Kiểm tra sinh viên có trong danh sách: " + dssv.kiemTraTonTai(sv));
                    break;
                case 7:
                    System.out.println("Nhập mã sinh viên: ");
                    maSinhVien = sc.nextLine();
                    sv = new SinhVien(maSinhVien);
                    System.out.println("Xóa sinh viên có trong danh sách " + dssv.xoaSinhVien(sv));
                    break;
                case 8:
                    System.out.println("Nhập họ và tên: ");
                    hoVaTen = sc.nextLine();
                    System.out.println("Kết quả tìm kiếm: ");
                    dssv.timSinhVien(hoVaTen);
                    break;
                case 9:
                    dssv.sapXepDanhSachSinhVien();
                    dssv.inDanhSachSinhVien();
                    break;
                default: 
                    break;
            }  
        }while(luaChon != 0);
    }
}
