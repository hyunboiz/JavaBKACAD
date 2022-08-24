import java.util.Scanner;
public class ex2 {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so nguyen n: ");
        n = scanner.nextInt();
        int total = 1;
        int i = 1;
        for(i = 1; i <= n; i++){
            total *= i; // tich cua tat ca i
        }
        System.out.println("Giai thua cua n la: " +total);
    }
}
