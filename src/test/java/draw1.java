import java.util.Scanner;
public class draw1 {
    public static void main(String[] args) {
        int i, n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so nguyen n: ");
        n = scanner.nextInt();
        for (i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
