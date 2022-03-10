package De1;
public class ThuMon extends ConNguoi {
    public int chisochupbanh;
    public ThuMon(String ten,int tuoi,int chisochupbanh)
    {
        super (ten,tuoi);
        this.chisochupbanh=chisochupbanh;
    }
    public void xuatThongTin()
    {
        super.xuatThongTin();
        System.out.printf("\nChi so chup banh: %d", chisochupbanh);
    }
}
