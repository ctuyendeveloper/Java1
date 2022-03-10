public class SinhVien {
    public String tenSV;
    public SinhVien(String tenSV)
    {
        // noi truyen` du lieu vao`
        this.tenSV = tenSV;
    }
    public void xuat()
    {
        // phuong thuc xuat
        System.out.printf("\nHo va ten: %s", tenSV);
    }
    public String getTenSV()
    {
        return tenSV;
    }
}
