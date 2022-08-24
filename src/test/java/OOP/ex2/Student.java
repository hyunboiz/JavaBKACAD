package OOP.ex2;

import java.util.Scanner;

public class Student extends Person{
    public Scanner input = new Scanner(System.in);

    public String codeSV;
    public int point;
    public String mail;
    public void input(){
        System.out.println("Nhap ten");
        name = input.nextLine();
        System.out.println("Nhap gioi tinh");
        sex = input.nextLine();
        System.out.println("Nhap dia chi");
        address = input.nextLine();
        System.out.println("Nhap ngay sinh");
        dob = input.nextLine();
        System.out.println("Nhap ma sinh vien");
        codeSV = input.nextLine();
        System.out.println("Nhap diem");
        point = input.nextInt();
        input.nextLine();
        System.out.println("Nhap mail");
        mail = input.nextLine();
    }
    public void show(){
        System.out.println("----------- Thong tin sinh vien ------------");
        System.out.println("Ho va ten:" +name);
        System.out.println("Gioi tinh:" +sex);
        System.out.println("Dia chi:" +address);
        System.out.println("DOB:" +dob);
        System.out.println("Ma Sinh Vien:" +codeSV);
        System.out.println("Diem:" +point);
        System.out.println("Mail:" +mail);
    }
    public void checkHocBong(){
        if(point > 8.0){
            System.out.println("---------------------------------------");
            System.out.println("Hoc sinh dat hoc bong");
        } else {
            System.out.println("Hoc sinh khong dat hoc bong");
        }
    }
}
