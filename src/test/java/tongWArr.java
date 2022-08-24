import java.util.Scanner;
public class tongWArr {
    public static void main(String[] args) {
        int sum = 0, i = 0;
        int array[] = new int[10];
        Scanner scanner = new Scanner(System.in);
        for(i = 0; i < 10; i++){
            System.out.print("Nhap so thu " + i + ": ");
            array[i] = scanner.nextInt();
        }
        for ( i = 0; i < 10; i++) {
            sum += array[i];
        }
        System.out.println("Tong " + sum);
    }
}
