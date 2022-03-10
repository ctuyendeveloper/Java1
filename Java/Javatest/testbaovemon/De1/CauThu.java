package De1;
public class CauThu extends ConNguoi {
    public int chisodabanh;
    public CauThu(String ten,int tuoi,int chisodabanh)
    {
        super (ten,tuoi);
        this.chisodabanh=chisodabanh;
    }
    public void xuatThongTin()
    {
        super.xuatThongTin();
        System.out.printf("\nChi so chup banh: %d", chisodabanh);
    }
}
