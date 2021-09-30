package com.quanvm2008110028.baitaplab1;

import java.util.Scanner;

public class baiTap1 {
    public static void main(String[] args) {
        double diemTB;

        Scanner ghiDiem;
        System.out.println("nhập điểm trung binh: ");
        ghiDiem = new Scanner(System.in);

        diemTB = ghiDiem.nextDouble();

        System.out.println("Điêm trung bình là: "+ diemTB);
        
        String tenSinhVien = new String("Vũ Minh Quân");
        
        System.out.println("Họ và tên là: "+ tenSinhVien);

        
    }
    
}
