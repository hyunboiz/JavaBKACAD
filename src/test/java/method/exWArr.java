package method;
import java.util.Scanner;
public class exWArr {
   public static Scanner scanner = new Scanner(System.in);
    public static int[] nhapMang(int n){
        int array[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu " + i + ": ");
            array[i] = scanner.nextInt();
        }
        return array;
    }
    public static void sumOdd(int[] array){
        int sumOdd = 0;
            for(int i = 0; i < array.length; i++){
                if(array[i] % 2 != 0){
                    sumOdd += array[i];
                }
            }
    }
    public static void main(String[] args) {
        int n;
        do {
            System.out.println("Nhap so phan tu cua mang: ");
            n = scanner.nextInt();
        } while (n < 0);
        nhapMang(n);
        int[] array = nhapMang(n);
        sumOdd(array);
    }
}
