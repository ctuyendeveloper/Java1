package LAB5;

public class SinhVien {
	public String ten;
	public double diem;
	public SinhVien(String ten, double diem) {
		this.ten=ten;
		this.diem=diem;
	}
	public String xuat() {
		return "Ten: "+ten+" "+"diem: "+diem;
	}

}