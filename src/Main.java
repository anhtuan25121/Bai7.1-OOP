public class Main {
    public static void main(String[] args) {

        DanhSachHoaDon a = new DanhSachHoaDon();
        a.nhap();
        a.xuat();

        System.out.println("Tong so tien dien cac ho su dung la: " + a.tongSoTienDien());
        a.HoKD_Max();
    }
}