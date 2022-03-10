package LAB7;

import java.util.ArrayList;
import java.util.Scanner;

public class lab7bai1 {

	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		ArrayList<ChuNhat> hcn=new ArrayList<ChuNhat>();
		ArrayList<vuong> hv=new ArrayList<vuong>();
		double cd,cr;
		System.out.println("Nhap so luong hinh chu nhat: ");
		int soluong=s.nextInt();
		for(int i=0;i<soluong;i++) {
			System.out.println("Nhap 2 canh hinh chu nhat "+(1+i));
			System.out.print("Chieu dai: ");
			cd=s.nextInt();
			System.out.print("Chieu rong: ");
			cr=s.nextInt();
			hcn.add(new ChuNhat(cd,cr));
		}
		
		System.out.print("Nhap so luong hinh vuong: ");
		soluong=s.nextInt();
		for(int i=0;i<soluong;i++) {
			System.out.print("Nhap canh hinh vuong: "+(i+1)+":");
			cd=s.nextInt();
			hv.add(new vuong(cd));
		}
		System.out.println("------------------------");
		System.out.println("HINH CHU NHAT.");
		for(int i=0;i<hcn.size();i++) {
			System.out.println("  Hinh chu nhat: "+(i+1));
			System.out.println(hcn.get(i).xuat());
		}
		System.out.println("-------------------------");
		System.out.println("HINH VUONG.");
		for(int i=0;i<hv.size();i++) {
			System.out.println("  Hinh Vuong: "+(i+1));
			System.out.println(hv.get(i).xuat());
		}
	}
}

