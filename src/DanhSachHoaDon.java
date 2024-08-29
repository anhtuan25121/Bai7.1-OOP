import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DanhSachHoaDon {
    private static final double FLAG_HoBT = 1;
    private static final double FLAG_HoKD = 2;
    private List<KhachHang> arr;

    public DanhSachHoaDon() {
        this.arr=new ArrayList<>();
    }
    public  void nhap(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Moi ban nhap so luong khach hang: ");
        int n = scanner.nextInt();
        for(int i=0; i<n; i++){
            System.out.println("\n~~~ Nhap thong tin khach hang thu "+(i+1)+" ~~~");
            System.out.println("1. Ho Binh Thuong.");
            System.out.println("2. Ho Kinh Doanh.");
            System.out.println("Su lua chon cua ban la: ");
            int flag = scanner.nextInt();
            if(flag==FLAG_HoBT){
                KhachHang a = new HoBinhThuong();
                a.nhap();
                this.arr.add(a);
            } else if (flag==FLAG_HoKD) {
                KhachHang a = new HoKinhDoanh();
                a.nhap();
                this.arr.add(a);
            }else {
                System.out.println("Loại khách hàng không hợp lệ. Bỏ qua khách hàng này.");
            }
        }
    }
    public void xuat(){
        System.out.println("----- Thon tin cac hoa don cua khach hang ------");
        for(KhachHang x : this.arr){
            x.xuat();
            System.out.println("----------------------------");
        }

    }
    public long tongSoTienDien(){
        long sum=0;
        for(KhachHang x: this.arr){
            sum+= x.tinhTienDien();
        }
        return sum;
    }
    public void HoKD_Max(){
        long tmp=0;
        for(KhachHang x: this.arr){
            if(x instanceof HoKinhDoanh){
                if(x.tinhTienDien()>tmp) tmp = x.tinhTienDien();
            }

        }
        System.out.println("Ho dinh doanh su dung nhieu dien nhat: ");
        for(KhachHang x: this.arr){
            if(x.tinhTienDien() == tmp){
                System.out.println("Ho kinh doanh ten : "+x.getTenKH());
            }

        }

    }

}
