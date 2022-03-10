import java.util.ArrayList;  
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
public class lab5 {
    static ArrayList<SinhVien> sv = new ArrayList<SinhVien>();
    public static void main(String[] args) 
    {
        menu();
    }
    public static void nhap() 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Nhap so luong sinh vien: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < n; i++)
        {
            System.out.printf("Sinh vien %d = ", i);
			String tenSv=scanner.nextLine();			
			SinhVien dssv= new SinhVien(tenSv);
            sv.add(dssv);
        }
    }
    public static void xuat()
    {
        for(int i = 0; i < sv.size(); i++)
        {
            sv.get(i).xuat();
        }
    }
    public static void sapXep() 
    {
        Comparator<SinhVien> tieuchi = new Comparator<SinhVien>() 
        {
            @Override
            public int compare(SinhVien o1, SinhVien o2) 
            {
            return o1.getTenSV().compareTo(o2.getTenSV());
            }
        };
        Collections.sort(sv, tieuchi);
        Collections.reverse(sv);
        System.out.print("\n +-----------------------------+\n");
        System.out.print(" + >>> Da Sap Xep Giam Dan <<< +");    
        System.out.print("\n +-----------------------------+\n");
    }
    public static void ngauNhien() 
    {
        Collections.shuffle(sv);
        System.out.print("\n +-------------------------------+\n");
        System.out.print(" + >>> Da Sap Xep Ngau Nhien <<< +");    
        System.out.print("\n +-------------------------------+\n");
    }
    public static void xoa() 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Nhap ten muon xoa: ");
        String removename = scanner.nextLine();
        for(int i = 0; i < sv.size(); i++)
        {
            if(sv.get(i).tenSV.equals(removename))
            {
                sv.remove(i);
                break;
            }
        }
        System.out.print("\n +-----------------------------------------+\n");
        System.out.print(" + >>> Da Xoa Ten Xuat Lai De Kiem Tra <<< +");    
        System.out.print("\n +-----------------------------------------+\n");
    }
    public static void menu() 
    {
        Scanner sc = new Scanner(System.in);
        int select;
        do
        {
            System.out.print("\n +--------------+\n");
            System.out.print(" + >>> LAB5 <<< +");
            System.out.print("\n +--------------+\n");
            System.out.print("\n1. Nhap\n");
            System.out.print("2. Xuat\n");
            System.out.print("3. Sap xep giam dan\n");
            System.out.print("4. Ngau nhien\n");
            System.out.print("5. Xoa\n");
            System.out.print("0. Thoat\n");
            System.out.print("Chon chuc nang[1-5]: ");
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
                nhap();
                break;
            }
            case 2:
            {
                xuat();
                break;
            }
            case 3:
            {
                sapXep();
                break;
            }
            case 4:
            {
                ngauNhien();
                break;
            }
            case 5:
            {
                xoa();
                break;
            }
            case 6:
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
        } while (select != 6);
    }
}
