package LAB5;

import java.util.ArrayList;
import java.util.Scanner;

public class lab5bai1 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		ArrayList<Double> bai1= new ArrayList<Double>();
		System.out.print("Nhap so luong phan tu: ");
		int nhap=s.nextInt();
		for (int i=0;i<nhap;i++){
			System.out.print("Phan tu "+i+" : ");
			double giaTri=s.nextDouble();
			bai1.add(giaTri);
		}
		
		double tong=0;
		for(int i=0;i<bai1.size();i++) {
			System.out.println(bai1.get(i));
			tong=tong+bai1.get(i);
		}
		System.out.print("Tong cac so thuc la "+tong);
	}
}