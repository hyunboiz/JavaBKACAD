import java.util.Scanner;
public class btap3 {
    public static void main(String[] args) {
        int n;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so nguyen n: ");
        n = scanner.nextInt();
        int i;
        int temp, digit, count = 0;
        for(i = 1; i<= n; i++) {
            temp = i;
            while (i > 0) {
                i = i / 10;
                count++;
            }
            while (temp > 0) {
                digit = temp % 10;
                System.out.println(digit);
                temp = temp / 10;
                count--;
            }
        }
    }
}
