package method;
import java.util.Scanner;
public class nGiaithua {
    public static  String checkGiaithua(int n){
        String res;
        int giai_thua = 1;
        if(n == 0 || n == 1){
            res = "So nhap vao phai khac 0 va 1";
        } else {
            for (int i = 2; i <= n; i++) {
                giai_thua *= i;
            }
            res = "Ket qua:" +giai_thua;
        }
        return res;
    }
    public static int nhap(){
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so : ");
        n = scanner.nextInt();
        return n;
    }
    public static void main(String[] args) {
        int a;
        a = nhap();
        System.out.println(checkGiaithua(a));
    }
}
