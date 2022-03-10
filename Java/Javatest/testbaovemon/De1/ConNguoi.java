package De1;
public class ConNguoi {
    public String ten;
    public int tuoi;
    public ConNguoi()
    {
        ten = "chua co ten";
        tuoi = 0;
    }
    // Dưới nhận vào 2 đối số và gán cho “ten” và “tuoi”.
    public ConNguoi(String ten, int tuoi)
    {
        this.ten=ten;
        this.tuoi=tuoi;
    }
    // Dưới xuất ra thông tin.
    public void xuatThongTin()
    {
        System.out.printf("\nTen: %s",ten);
        System.out.printf("\nTuoi: %d",tuoi);
    }
}
