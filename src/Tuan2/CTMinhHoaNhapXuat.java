package Tuan2;

import java.util.Scanner;

public class CTMinhHoaNhapXuat {
    public static void main(String[] args) {
       // System.out.println("Gia định");
      //  System.out.print("Đào Tạo");
      //  System.out.printf("%d nghề",12);

        Float diemKTKiThuatLapTrinh;

        Scanner bienNhapLieu; //cái remote

        bienNhapLieu = new Scanner(System.in);

        System.out.println("Nhập điểm môn kĩ thuật lập trinh: ");
        
        diemKTKiThuatLapTrinh = bienNhapLieu.nextFloat();

        System.out.println("điểm kt kĩ thuật lập trình là:  "+ diemKTKiThuatLapTrinh);


        // 1 ví dụ khác
        

        String tenSinhVien = new String("Vũ Minh Quân");
        
        System.out.println("Họ Tên sinh viên là: "+ tenSinhVien);



    }
    
}
