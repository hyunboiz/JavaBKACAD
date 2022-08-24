package OOP;

public class conNguoi {
//    co nhung thuoc tinh: ho ten, tuoi, dia chi, so dien thoai
//    co nhung phuong thuc: an, ngu, choi

    //    Khoi tao cac thuoc tinh
    public String hoTen;
    public int tuoi;
    public String diaChi;
    public String soDienThoai;

    //    Khoi tao cac phuong thuc
    public void an(){
        System.out.println("An");
    }
    public void ngu(){
        System.out.println("Ngu");
    }
    public void choi(){
        System.out.println("Choi");
    }

    @Override
    public String toString() {
        return "conNguoi{" +
                "hoTen='" + hoTen + '\'' +
                ", tuoi=" + tuoi +
                ", diaChi='" + diaChi + '\'' +
                ", soDienThoai='" + soDienThoai + '\'' +
                '}';
    }

    public conNguoi(String hoTen, int tuoi, String diaChi, String soDienThoai) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
        this.soDienThoai = soDienThoai;
    }

    public conNguoi() {
    }
}