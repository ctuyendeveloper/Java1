package ASM;

public class TiepThi extends NhanVien
{
    double dsbanhang;
	double tlhuehong;
	public TiepThi(String manv, String ten, double luong, double dsbanhang, double tlhuehong) {
		super(manv, ten, luong);
		this.dsbanhang=dsbanhang;
		this.tlhuehong=tlhuehong;
	}
	public double getThuNhap(){
		return luong+dsbanhang+tlhuehong;
	}
}