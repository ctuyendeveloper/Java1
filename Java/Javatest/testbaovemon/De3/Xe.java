package De3;

public class Xe {
    public String mauxe;
    public int tocdo;
    public Xe()
    {
        mauxe = "chua co mau";
        tocdo = 0;
    }
    public Xe(String mauxe, int tocdo)
    {
        this.mauxe=mauxe;
        this.tocdo=tocdo;
    }
    public void xuatThongTin()
    {
        System.out.printf("\nMau Xe: %s",mauxe);
        System.out.printf("\nToc Do: %d",tocdo);
    }
}
