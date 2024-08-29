public class HoBinhThuong extends KhachHang{
    private static final double UNIT_PRICE_1 = 1500;
    private static final double UNIT_PRICE_2 = 2000;
    private static final double UNIT_PRICE_3 = 2800;
    private static final double VAT = 0.10;

    @Override
    public long tinhTienDien(){
        int KWtieuthu = KWtieuthu();
        long TienDien = 0;
        if(KWtieuthu <=50){
            TienDien = (long) (KWtieuthu*UNIT_PRICE_1);
        }else if(KWtieuthu <=100){
            TienDien = (long) (50*UNIT_PRICE_1 + (KWtieuthu-50)*UNIT_PRICE_2);
        } else {
            TienDien = (long) (50*UNIT_PRICE_1 + 50*UNIT_PRICE_2 + (KWtieuthu-100)*UNIT_PRICE_3);

        }
        long ThueGTGT = (long) (TienDien*VAT);
        return TienDien + ThueGTGT;
    }
}
