package ASM;

public class NhanVien {
    String manv;
	String hoten;
	double luong;
	
	public NhanVien()
	{		
	}
	public NhanVien(String manv, String hoten, double luong)
	{
		this.manv = manv;
		this.hoten = hoten;
		this.luong = luong;
	}
	public double getThuNhap()
	{
		return luong-getThueTN();
	}
	public double getThueTN()
	{
		if(luong<9)
		{
			return 0;
		}
			
		else if(luong <=15)
		{
			return luong*0.1;
		}	
		else
		{
			return luong*0.12;
		}		
	}
	public String xuat()
		{
			return "Mã NV:"+manv
					+" Họ và tên:"+hoten
					+" Thu nhập:"+(getThuNhap()-getThueTN())
					+" Thuế:"+getThueTN();
		}
}
