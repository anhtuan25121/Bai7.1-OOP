import java.util.Scanner;

public class HoKinhDoanh extends KhachHang{
    private static final double UNIT_PRICE = 3000;
    private static final double VAT = 0.1;
    private static final double DISCOUNT = 0.05;
    private String LinhVucKD;

    public HoKinhDoanh() {
    }

    public String getLinhVucKD() {
        return LinhVucKD;
    }

    public void setLinhVucKD(String linhVucKD) {
        LinhVucKD = linhVucKD;
    }
    @Override
    public long tinhTienDien(){
        long TienDien = (long) (KWtieuthu()*UNIT_PRICE);
        long ThueGTGT = (long) (TienDien*VAT);
        long UuDai = (long)(TienDien*DISCOUNT);
        return TienDien+ThueGTGT-UuDai;
    }
    @Override
    public void nhap(){
        Scanner scanner=new Scanner(System.in);
        super.nhap();
        System.out.println("nhap linh vuc kinh doanh: ");
        this.LinhVucKD = scanner.nextLine();
    }
    @Override
    public  void xuat(){
        super.xuat();
        System.out.println("Linh vuc kinh doanh: "+this.LinhVucKD);

    }
}
