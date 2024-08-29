import javax.swing.plaf.PanelUI;
import java.util.Scanner;

public class KhachHang {
    private String maKH;
    private String tenKH;
    private int chisocu;
    private int chisomoi;

    public int KWtieuthu(){
        return this.chisomoi-this.chisocu;
    }
    public long tinhTienDien(){
        return 0;//Doi ghi de ben lop con
    }
    public void nhap(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap ma khach hang: ");
        this.maKH = scanner.nextLine();
        System.out.println("Nhap ten khach hang: ");
        this.tenKH = scanner.nextLine();
        System.out.println("Nhap chi so cu: ");
        this.chisocu = scanner.nextInt();
        System.out.println("Nhap chi so moi: ");
        this.chisomoi = scanner.nextInt();
    }
    public void xuat(){
        System.out.println("Ma Khach Hang: "+maKH);
        System.out.println("Ten Khach Hang: "+tenKH);
        System.out.println("Chi so cu: "+chisocu);
        System.out.println("Chi so moi: "+chisomoi);
        System.out.println("So tien thanh toan: "+tinhTienDien());

    }
    public int getChisocu() {
        return chisocu;
    }

    public void setChisocu(int chisocu) {
        this.chisocu = chisocu;
    }

    public int getChisomoi() {
        return chisomoi;
    }

    public void setChisomoi(int chisomoi) {
        this.chisomoi = chisomoi;
    }

    public KhachHang() {
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

}
