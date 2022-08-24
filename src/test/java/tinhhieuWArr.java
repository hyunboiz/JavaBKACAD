import java.util.Scanner;
public class tinhhieuWArr {
    public static void main(String[] args) {
        int res = 0, i = 0;
        int array[] = new int[15];
        Scanner scanner = new Scanner(System.in);
        for(i = 0; i < 15; i++){
            System.out.print("Nhap so thu " + i + ": ");
            array[i] = scanner.nextInt();
        }
        for ( i = 0; i < 15; i++) {
            res = res - array[i];
        }
        System.out.println("Tong " + res);
    }
}
