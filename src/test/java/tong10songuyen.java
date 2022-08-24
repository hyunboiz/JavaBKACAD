import java.util.Scanner;
public class tong10songuyen {
    public static void main(String[] args) {
        int sum = 0, n, i = 1;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhap so nguyen can cong: ");
            n = scanner.nextInt();
            sum += n;
            i++;
            if (i > 10)
                break;
        } while(n > 0);
        System.out.println("Tong = " + sum);
    }
}

