package Tuan2;

import java.util.Scanner;

public class chuongTrinhMenu {
    public static void main(String[] args) {
        System.out.println("=============MENU============");
        System.out.println("1.Giải phương trình bậc 1:");
        System.out.println("2.=============MENU============");
        System.out.println("3.=============END MENU============");

        System.out.print("hãy chọn một chức năng: ");
        Scanner bienNhap = new Scanner(System.in);
        int giaTriNhap = bienNhap.nextInt();
        switch(giaTriNhap){
            case 1: giaiPhuongTrinhBacI();;break;
            case 2: ;break;
            case 3: ;break;
            default: System.out.println("chọn chức năng khác: ");
        }
    }
    

    static void giaiPhuongTrinhBacI(){
        int a,b;

        double nghiem;
    

        Scanner pTBac1;

        pTBac1 = new Scanner(System.in);
        System.out.println("Để Giải PT bậc I:");
        System.out.println("Hãy Nhập Một Số Vào a: ");
        a = pTBac1.nextInt();
        System.out.println("Hãy Nhập Một Số Vào b: ");
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
