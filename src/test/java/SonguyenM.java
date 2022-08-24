import java.util.Scanner;

public class SonguyenM {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so nguyen n: ");
        n = scanner.nextInt();
        int i = 1;

            for (i = 1; i <= n; i++) {
                System.out.println(i);
            }
    }
}
