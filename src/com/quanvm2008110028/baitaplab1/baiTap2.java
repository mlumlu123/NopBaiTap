package com.quanvm2008110028.baitaplab1;

public class baiTap2 {
    public static void main(String[] args) {
        int chieuDai = 2, chieuRong = 6 ,chuVi,DienTich,canhNhoNhat;

        double canhnhoNhat;

        chuVi = (chieuDai + chieuRong)*2;

        DienTich = (chieuDai * chieuRong);

        canhNhoNhat = Math.min(chieuDai, chieuRong);     
        
        System.out.println("kết quả lần lượt của chu vi là: "+chuVi);
        System.out.println("kết quả lần lượt của diện tích là: "+DienTich);
        System.out.println("kết quả lần lượt của canhNhoNhat là: "+canhNhoNhat);

    }
    
        
    
    
}
