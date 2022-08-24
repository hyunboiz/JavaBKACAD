package OOP.ex1;
import java.util.Scanner;

public class main {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        HinhChuNhat info = new HinhChuNhat();
        System.out.print("Chieu dai: ");
        info.chieuDai = input.nextInt();
        System.out.print("Chieu rong: ");
        info.chieuRong = input.nextInt();
        info.tinhDienTich();
        info.tinhChuVi();
        HinhChuNhat info2 = new HinhChuNhat();
        System.out.print("Chieu dai: ");
        info2.chieuDai = input.nextInt();
        System.out.print("Chieu rong: ");
        info2.chieuRong = input.nextInt();
        info2.tinhDienTich();
        info2.tinhChuVi();
        System.out.println(info.toString());

    }
}
