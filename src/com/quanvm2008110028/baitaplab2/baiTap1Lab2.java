package com.quanvm2008110028.baitaplab2;

import java.util.Scanner;

public class baiTap1Lab2 {
    public static void main(String[] args) {
         
        int a,b;

        double nghiem;

        Scanner pTBac1;

        pTBac1 = new Scanner(System.in);

        System.out.println("Nhập a: ");
        a = pTBac1.nextInt();
        System.out.println("nhập b: ");
        b = pTBac1.nextInt();
        System.out.println("phương trình bạn vừa nhập là: "+ a+"x+"+b + "= 0");
            if(a == 0){
                if(b == 0){
                    System.out.println("phương trình này có vô số nghiệm.");

                }else{
                    System.out.println("phương trình vô nghiệm.");
                }
            }else{
                nghiem = (double)-b/a;
                System.out.println("phương trình có nghiệm x =" + nghiem);
            }
    }
    
}
