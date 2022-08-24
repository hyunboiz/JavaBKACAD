package method;
import java.util.Scanner;
public class exMethod {
    public static String Check(int a, int b, int c){
        String res ;
        if(a+b > c && a+c > b && b+c >a){
            res = "3 So nhap vao la canh tam giac";
        }else{
            res = "3 So nhap vao khong la canh tam giac";
        }
        return res;
    }
    public static String phuongtrinhbac2(int a, int b, int c){
        int x1= 0, x2 = 0;
        int delta = (b*b) -4*(a*c);
        String res = "null";
        if(delta < 0){
            res = "Phuong trinh vo nghiem";
        }else if(delta == 0){
            x1 = x2 = -b /(2*a);
            res = "Phuong trinh co nghiem kep x1,x2:" +x1;
        }else if(delta > 0){
            x1 = (int) ((-b + Math.sqrt(delta)) / (2 * a));
            x2 = (int) ((-b - Math.sqrt(delta)) / (2 * a));
            res = "Phuong trinh co 2 nghiem X1:" +x1 +"\n X2:"+ x2;
        }
        return res;
    }
    public static int nhap(){
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so : ");
        n = scanner.nextInt();
        return n;
    }
    public static void main(String[] args) {
        int a, b, c;
        a = nhap();
        b = nhap();
        c= nhap();
        System.out.println(phuongtrinhbac2(a, b, c));


    }
}
