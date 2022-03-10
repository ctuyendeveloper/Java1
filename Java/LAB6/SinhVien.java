package LAB6;

import java.util.ArrayList;
import java.util.Scanner;

public class SinhVien {
	String ten;
	String email;
	String sdt;
	String cmnd;
	Scanner s=new Scanner(System.in);
	ArrayList<SinhVien> sv=new ArrayList<SinhVien>();
	public SinhVien() {
		
	}
	public SinhVien(String ten, String email, String sdt, String cmnd) {
		this.ten=ten;
		this.email=email;
		this.sdt=sdt;
		this.cmnd=cmnd;
	}
	public void nhap() {
		System.out.print("Nhap so luong sinh vien:");
		int nhap=s.nextInt();
		s.nextLine();
		for(int i=0;i<nhap;i++) {
			System.out.print("Ho va ten:");
			String ten=s.nextLine();
			System.out.print("Email: ");
			String email=s.nextLine();
			System.out.print("So dien thoai:");
			String sdt=s.nextLine();
			System.out.print("Chung minh nhan dan:");
			String cmnd=s.nextLine();
			SinhVien dssv=new SinhVien(ten,email,sdt,cmnd);
			sv.add(dssv);
		}	
	}
	public void xuat() {
		System.out.println("-------------------------");
		String tengoc="\\D+ \\D+";
		String emailgoc="\\w+@\\w+(\\.\\w+){1,3}";
		String sdtgoc="0\\d{9,10}";
		String cmndgoc="\\d{9}||\\d{12}";
		for(int i=0;i<sv.size();i++) {
			System.out.println("Thong tin sinh vien "+(i+1));
			if(!sv.get(i).ten.matches(tengoc))
				System.out.println(" +Ten khong chinh xac.");
			if(!sv.get(i).email.matches(emailgoc))
				System.out.println(" +Email khong chinh xac.");
			if(!sv.get(i).sdt.matches(sdtgoc))
				System.out.println(" +So dien thoai khong chinh xac.");
			if(!sv.get(i).cmnd.matches(cmndgoc))
				System.out.println(" +Chung minh nhan dan khong chinh xac.");
		}
	}
}