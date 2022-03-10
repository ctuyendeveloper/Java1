package LAB8;

import java.util.Scanner;

public class lab8 {
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Nhap so luong so can tinh tong: ");
		int nhap=s.nextInt();
		double mang[]=new double[nhap];
		for(int i=0;i<nhap;i++) {
			System.out.print("So thu "+(i+1)+": ");
			mang[i]=s.nextDouble();
			s.nextLine();
		}
		sum(mang);
		tmax(mang);
		tmin(mang);
		System.out.println("Nhap ho va ten: ");
		String ten=s.nextLine();
		hoachudau(ten);
	}
	static void sum(double ...x) {
		double tong=0;
		for(int i=0;i<x.length;i++) {
			tong=tong+x[i];
		}
		System.out.printf("Tong = %.2f\n",tong);
	}
	static void tmax(double ...a) {
		double max=a[0];
		for(int i=0;i<a.length;i++) {
			if(max<a[i]) {
				max=a[i];
			}
		}
		System.out.println("So lon nhat la: "+max);
	}
	static void tmin(double ...a) {
		double min=a[0];
		for(int i=0;i<a.length;i++) {
			if(min>a[i]) {
				min=a[i];
			}
		}
		System.out.println("So nho nhat la: "+min);
	}
	static void hoachudau(String hoa){
		String hoten=hoa.toLowerCase();
		String ten[]=hoten.split(" ");
		for(int i=0;i<ten.length;i++) {
			String kthoa=String.valueOf(ten[i].charAt(0)).toUpperCase();
			System.out.print(kthoa+ten[i].substring(1)+" ");
		}
	}
}