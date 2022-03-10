package De3;

public class Xetai extends Xe {
    public int taitrong;
    public Xetai(String mauxe,int tocdo,int taitrong)
    {
        super (mauxe,tocdo);
        this.taitrong=taitrong;
    }
    public void xuatThongTin()
    {
        super.xuatThongTin();
        System.out.printf("\nTai trong: %d\n", taitrong);
    }
}
