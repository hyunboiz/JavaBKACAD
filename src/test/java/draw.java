import java.util.Scanner;
public class draw {
    public static void main(String[] args) {
        int i, n, n2 = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so nguyen n: ");
        n = scanner.nextInt();
        for (i = 1; i <= n; i++) { // dem so dong
            for (int j = 1; j <= i; j++) { // dem so phan tu in ra tren dong
                    System.out.print(n2 + " "); // in ra phan tu tang tu 1
                   n2++; // tang bien so in ra man hinh 1 don vi
            }
            System.out.println();
        }
    }
}
