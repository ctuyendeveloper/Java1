package LAB6;

import java.util.Scanner;

public class lab6bai1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Nhap ho va ten: ");
		String hoten=s.nextLine();
		String[] xuat=hoten.split(" ");
		if(xuat.length<3) {
			System.out.println("Họ:"+xuat[0].toUpperCase());
			System.out.println("Ten dem: Khong co ten dem");
			System.out.println("Tên:"+xuat[1].toUpperCase());
		}else {
			System.out.println("Ho:"+xuat[0].toUpperCase());
			System.out.print("Ten dem:");
			for(int i=1; i<xuat.length-1; i++)
            {
				System.out.print(xuat[i]+" ");
			}
			System.out.print("\nTen:"+xuat[xuat.length-1].toUpperCase());
		}
	}
}
