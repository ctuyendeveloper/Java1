package De3;

public class Xehoi extends Xe {
    public int dungtichbinhxang;
    public Xehoi(String mauxe,int tocdo,int dungtichbinhxang)
    {
        super (mauxe,tocdo);
        this.dungtichbinhxang=dungtichbinhxang;
    }
    public void xuatThongTin()
    {
        super.xuatThongTin();
        System.out.printf("\nDung tich binh xang: %d\n", dungtichbinhxang);
    }
}
