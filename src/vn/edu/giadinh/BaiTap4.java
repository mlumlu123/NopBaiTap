package vn.edu.giadinh;

public class BaiTap4 {

    public static void main(String[] args) {
        
        int a=2,b=4,c=1;

        double delta,canDelta;

        delta = Math.pow(b, 2)-4*a*c;
        System.out.println("kết quả của delta là:" + delta);

        canDelta = Math.sqrt(delta);
        System.out.printf("căn của delta là: %.3f ", canDelta);
      
    }
    
}
