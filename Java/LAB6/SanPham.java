package LAB6;
import java.util.ArrayList;
import java.util.Scanner;

public class SanPham {
	String ten;
	String hang;
	double gia;
	Scanner s=new Scanner(System.in); 
	ArrayList<SanPham> sp=new ArrayList<SanPham>();
	public SanPham(String ten, double gia, String hang) {
		this.ten=ten;
		this.hang=hang;
		this.gia=gia;
	}
	public SanPham() {
		
	}
	public void nhap() {
		System.out.print("Nhap so luong san pham: ");
		int nhap=s.nextInt();
		s.nextLine();
		for(int i=0;i<nhap;i++) {
			System.out.println("Thong tin san pham so "+(i+1));
			System.out.print("Ten:");
			String ten=s.nextLine();
			System.out.print("Gia:");
			double gia=s.nextDouble();
			s.nextLine();
			System.out.print("Hang:");
			String hang=s.nextLine();
			SanPham ds=new SanPham(ten,gia,hang);
			sp.add(ds);
		}
	}
	public void xuat() {
		for(int i=0;i<sp.size();i++) {
			if("Nokia".equalsIgnoreCase(sp.get(i).hang)) {
				System.out.print("\nTen:"+sp.get(i).ten+" ");
				System.out.print("\nGia:"+sp.get(i).gia+" ");
				System.out.println("\nHang:Nokia");
			}
		}
		
	}
}
