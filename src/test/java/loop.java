package loop;
import java.util.Scanner;
public class loop {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so nguyen n: ");
        n = scanner.nextInt();
        int sum = 0;
        int i = 1;
        for(i = 1; i<= n; i++){
            if(i%2 != 0){
                sum = sum+i;
            }
        }
        System.out.println(sum);
    }
}
