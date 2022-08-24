import java.util.Scanner;
public class btapArr {
    public static void main(String[] args) {
        int i;
        int max = 0, min = 0;
        int array[] = new int[10];
        Scanner scanner = new Scanner(System.in);
        for(i = 0; i < 10; i++){
            System.out.print("Nhap so thu " + i + ": ");
            array[i] = scanner.nextInt();
        }
        // in ra so lon nhat va be nhat
        for(i = 0; i< array.length; i++){
            if(max < array[i]){
                max = array[i];
            }
        }
        for(i = 0; i< array.length; i++){
            min = array[i];
            if(min > array[i]){
                min = array[i];
            }
        }
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }

}
