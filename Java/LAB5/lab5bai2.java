package LAB5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class lab5bai2 {
	static ArrayList<SinhVien> ds= new ArrayList<SinhVien>();
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) {
		while(true) {
			System.out.println("1. Nhap");
			System.out.println("2. Xuat");
			System.out.println("3. Sap xep");
			System.out.println("4. Ngau nhien");
			System.out.println("5. Xoa");
			System.out.println("6. Thoat");
			System.out.println("---------------------");
			System.out.println("Chon chuc nang.");
			int chon=s.nextInt();
			s.nextLine();
			switch(chon) {
				case 1:
					nhap();
					break;
				case 2:
					xuat();
					System.out.print("An Enter đe tiep tuc");
					String enter=s.nextLine();
					break;
				case 3:
					sapxep();
					break;
				case 4:
					ngaunhien();
					break;
				case 5:
					xoa();
					break;
				default:
					System.out.println("Nhap khong đung! Hay nhap lai");
			}

		}
	}
	static void nhap() {
		String yn;
		do {
			System.out.print("Ten SV:");
			String tenSv=s.nextLine();
			System.out.print("Diem:");
			double diemSv=s.nextDouble();			
			s.nextLine();
			SinhVien sv= new SinhVien(tenSv,diemSv);
			ds.add(sv);
			System.out.println("Ban co muon them sinh vien khong:");
			System.out.println("\tyes\tno");
			yn=s.nextLine();
		}while("yes".equals(yn));
	}
	static void xuat() {
		System.out.println("Danh sach sinh vien.");
		for(int i=0;i<ds.size();i++) {
			System.out.println(ds.get(i).xuat());	
		}
	}
	static void sapxep(){
		Comparator<SinhVien> tieuchi= new Comparator<SinhVien>()
		{
			@Override
			public int compare(SinhVien o1, SinhVien o2) {
				 double x=o1.diem-o2.diem;
				 int i= (int)x;
				 return i;
			}
		};
		Collections.sort(ds, tieuchi);
		Collections.reverse(ds);
	}
	static void ngaunhien() {
		Collections.shuffle(ds);
	}
	static void xoa() {
		System.out.println("Chon chuc nang ban muon xoa?");
		System.out.println(" 1.Xoa bang so\t2.Xoa bang ten");
		System.out.println(" ");
		int nhap =s.nextInt();
		if(nhap==1) {
			System.out.print("Chon phan tu đe xoa: ");
			int xoaTheoSo=s.nextInt();
			ds.remove(xoaTheoSo);
		}
		else if (nhap==2) {
			s.nextLine();
			System.out.println("Nhap ten sinh vien can xoa");
			String tenxoa=s.nextLine();
			for(int i=0;i<ds.size();i++) {
				boolean xoa=gettencanxoa(i,tenxoa);
				if(xoa==true) {
					ds.remove(i);
				}else if(xoa==false&&i==ds.size()-1){
					System.out.println("Khong tim thay ten ban muon xoa");
					System.out.print("An Enter đe tiep tuc");
					String enter=s.nextLine();
				}
			}
		}
	}
	static boolean gettencanxoa(int i, String tenxoa) {
		return ds.get(i).ten.equals(tenxoa);
	}
}