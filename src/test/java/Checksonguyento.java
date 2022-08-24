package timoday;
import java.util.Scanner;
public class Checksonguyento {
    public static boolean Check(int n){
        int i = 2;
        if(n <= 1){
            return false;
        }
        for (i = 2; i <= n / 2; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so nguyen n: ");
        n = scanner.nextInt();
        if(Check(n)){
            System.out.println(n+" la so nguyen to!");
        } else {
            System.out.println(n+" khong la so nguyen to!");
        }
    }
}
