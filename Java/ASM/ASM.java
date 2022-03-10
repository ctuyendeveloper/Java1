package ASM;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class ASM 
{
    static ArrayList<NhanVien> nvrv = new ArrayList<NhanVien>();
    static NhanVien nhanv = new NhanVien();
	static ArrayList<NhanVien> nvien = new ArrayList<NhanVien>();
	static Scanner nv = new Scanner(System.in);
    public static void main(String[] args) 
    {
        menu();
    }
        public static void y1()  
            {
            System.out.println("Nhap danh sach nhan vien");
		    System.out.println("Nhap so luong nhan vien: ");
		    int n = nv.nextInt();
		    nv.nextLine();
		    for (int i=0;i<n;i++)
		        {
			    System.out.println("Nhap nhan vien "+i+ ": ");
			    System.out.println("Ma: ");
			    String ma = nv.nextLine();
			    System.out.println("Ten: ");
			    String ten = nv.nextLine();
			    System.out.println("Luong(trieu): ");
			    double money = nv.nextDouble();
			    nv.nextLine();
			    nvien.add(new NhanVien(ma,ten,money));
		        }
            }
        public static void y2() 
            {
                System.out.println("Xuat danh sach nhan vien");
		        for(int i=0; i<nvien.size();i++)
		            {
			            System.out.println(nvien.get(i).xuat());	
		            }
            }
        public static void y3() 
        {
            System.out.print("Nhap ma nhan vien can tim: ");
		    String nhap=nv.nextLine();
		    for(int i=0;i<nvien.size();i++) 
            {
			    if(nhap.equalsIgnoreCase(nvien.get(i).manv)) 
                {
				    System.out.println(nvien.get(i).xuat());
				    break;
			    }
		    }
        }
        public static void y4() 
        {
            System.out.print("Nhap ma nhan vien can xoa ");
		    String nhap=nv.nextLine();
		        for(int i=0;i<nvien.size();i++) {
			    if(nhap.equalsIgnoreCase(nvien.get(i).manv)) 
                    {
				        nvien.remove(i);
				        break;
			        }
		}
        }
        public static void y5() 
        {
        System.out.print("Nhap ma nhan vien muon cap nhat: ");
		String nhap=nv.nextLine();
		for(int i=0;i<nvien.size();i++) 
            {
			    if(nhap.equalsIgnoreCase(nvien.get(i).manv)) 
                    {		
				    System.out.println("Ma: ");
				    String ma = nv.nextLine();
				    System.out.println("Ten: ");
				    String ten = nv.nextLine();
				    System.out.println("Luong(trieu): ");
				    double money = nv.nextDouble();
				    nv.nextLine();
				    nvien.set(i,new NhanVien(ma,ten,money));
			        }
		    }
	    }
        public static void y6() 
        {
        System.out.print("Nhap so luong nhan vien can tim: ");
		double luong=nv.nextDouble();
		nv.nextLine();
		for(int i=0;i<nvien.size();i++) 
            {
			    if(luong==nvien.get(i).luong) 
                {
				System.out.println(nvien.get(i).xuat());
				break;
			    }
            }
        }
        public static void y7()
        {
            System.out.println("Nhan vien duoc sap xep theo ten");
		    Comparator<NhanVien> tieuchi = new Comparator<NhanVien>() 
            {
			    @Override
			    public int compare(NhanVien o1, NhanVien o2) 
                {
			    return o1.hoten.compareTo(o2.hoten);
			    }
		    };
		    Collections.sort(nvien,tieuchi);
        }
        public static void y8() 
        {
            Comparator<NhanVien> tieuchi=new Comparator<NhanVien>() 
		{
			@Override
			public int compare(NhanVien o1, NhanVien o2) {
				double x=o1.getThuNhap()-o2.getThuNhap();
				int y=(int)x;
				return y;
			}
		};
		Collections.sort(nvrv, tieuchi);
		Collections.reverse(nvrv);
		y2();
        }
        public static void y9() 
        {
            Comparator<NhanVien> tieuchi=new Comparator<NhanVien>() 
		{
			@Override
			public int compare(NhanVien o1, NhanVien o2) 
            {
				double x=o1.getThuNhap()-o2.getThuNhap();
				int y=(int)x;
				return y;
			}
		};
		    Collections.sort(nvrv, tieuchi);
		    Collections.reverse(nvrv);
		    for(int i=0;i<5;i++) 
            {
			    System.out.println(nvrv.get(i).xuat());
		    }
        }
        public static void menu() 
        {
            Scanner sc = new Scanner(System.in);
            int select;
            do
            {
                System.out.print("\n +-------------------------------+\n");
                System.out.print(" + >>> LAP TRINH CO BAN JAVA <<< +");
                System.out.print("\n +-------------------------------+\n");
                System.out.print("\nY1. Nhap danh sach nhan vien tu ban phim\n");
                System.out.print("Y2. Xuat danh sach nhan vien ra man hinh\n");
                System.out.print("Y3. Tim va hien thi nhan vien theo ma nhap tu ban phim\n");
                System.out.print("Y4. Xoa nhan vien theo ma nhap tu ban phim\n");
                System.out.print("Y5. Cap nhat thong tin nhan vien theo ma nhap tu ban phim\n");
                System.out.print("Y6. Tim cac nhan vien theo khoang luong nhap tu ban phim\n");
                System.out.print("Y7. Sap xep nhan vien theo ho va ten\n");
                System.out.print("Y8. Sap xep nhan vien theo thu nhap\n");
                System.out.print("Y9. Xuat 5 nhan vien co thu nhap cao nhat\n");
                System.out.print("0. Thoat chuong trinh!!\n");
                System.out.print("Chon chuc nang[1-9]: ");
                select = sc.nextInt();
                switch (select)
                {
                case 0:
                {
                    System.exit(0);;
                    break;
                }
                case 1:
                {
                    y1();
                    break;
                }
                case 2:
                {
                    y2();
                    break;
                }
                case 3:
                {
                    y3();
                    break;
                }
                case 4:
                {
                    y4();
                    break;
                }
                case 5:
                {
                    y5();
                    break;
                }
                case 6:
                {
                    y6();
                    break;
                }
                case 7:
                {
                    y7();
                    break;
                }
                case 8:
                {
                    y8();
                    break;
                }
                case 9:
                {
                    y9();
                    break;
                }
                case 10:
                {
                System.out.print("\n +-----------------------------------------------+");
                System.out.print("\n + Nhap sai! Vui long khoi dong lai chuong trinh +");
                System.out.print("\n +-----------------------------------------------+\n");
                    break;
                }
                default:
                System.out.print("\n +---------------------------------------+");
                System.out.print("\n + Nhap sai! Vui long chon lai chuc nang +");
                System.out.print("\n +---------------------------------------+\n");
                    break;
                }
            } while (select != 10);
        }
}

