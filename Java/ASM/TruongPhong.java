package ASM;

public class TruongPhong extends NhanVien 
{
    double trachnhiem;
	public TruongPhong(String manv, String ten, double luong, double trachnhiem) 
    {
		super(manv, ten, luong);
		this.trachnhiem=trachnhiem;
	}
	public double getThuNhap() 
    {
		return luong+trachnhiem;
	}
}
