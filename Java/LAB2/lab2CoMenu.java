package LAB2;

import java.util.Scanner;

public class lab2CoMenu 
{
    public  static void main(String[] args) 
    {
        menu();
    }
    public static void menu() 
    {
        Scanner sc = new Scanner(System.in);
        int select;
        do
        {
            System.out.print("\n +--------------+\n");
            System.out.print(" + >>> LAB2 <<< +");
            System.out.print("\n +--------------+\n");
            System.out.print("\n1. Giai phuong trinh bac nhat\n");
            System.out.print("2. Giai phuong trinh bac 2\n");
            System.out.print("3. Tinh tien dien\n");
            System.out.print("0. Thoat\n");
            System.out.print("Chon chuc nang[1-3]: ");
            select = sc.nextInt();
            switch (select)
            {
            case 0:
            {
                System.out.print("Chuan bi thoat = )))");
                break;
            }
            case 1:
            {
                bai1();
                break;
            }
            case 2:
            {
                bai2();
                break;
            }
            case 3:
            {
                bai3();
                break;
            }
            case 4:
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
        } while (select != 4);
    }
    public static void bai2() 
    {
        double delta;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap gia tri A : ");
        double numbera = scanner.nextDouble();
        System.out.print("Nhap gia tri b : ");
        double numberb = scanner.nextDouble();
        System.out.print("Nhap gia tri c : ");
        double numberc = scanner.nextDouble();
        if (numbera == 0) 
        {
            if (numberb == 0) 
            {
                if (numberc == 0)
                    System.out.print("Phuong trinh vo so nghiem");
                else
                    System.out.print("Phuong trinh vo nghiem");
            } else
                System.out.printf("Phuong trinh co mot nghiem duy nhat: %.3f", -numberc / numberb);
        } else 
        {
            delta = numberb * numberb - 4 * numbera * numberc;
            if (delta < 0)
                System.out.print("Phuong trinh vo nghiem");
            else if (delta == 0)
                System.out.printf("Phuong trinh co nghiem kep: %.3f", -numberb / (2 * numbera));
            else 
            {
                System.out.print("Phuong trinh co 2 nghiem rieng biet");
                System.out.printf("\nNghiem so 1: %.3f", (-numberb + Math.sqrt(delta)) / (2 * numbera));
                System.out.printf("\nNghiem so 2: %.3f", (-numberb - Math.sqrt(delta)) / (2 * numbera));
            }
        }
    }
    public static void bai1() 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap gia tri A : ");
        double numbera = scanner.nextDouble();
        System.out.print("Nhap gia tri b : ");
        double numberb = scanner.nextDouble();
        if(numbera == 0)
        {
            if (numberb == 0) 
            System.out.print("Phuong trinh vo so nghiem");
            else
            System.out.print("Phuong trinh vo nghiem");
        }
        else
        System.out.printf("Nghiem X là : %.3f", -numberb / numbera);
    }
    public static void bai3() 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so dien da dung trong thang : ");
        int soDienDaDung = scanner.nextInt();
        float soTien;
        if (soDienDaDung < 50 && soDienDaDung > 0) 
        {
            soTien = soDienDaDung * 1000;
            System.out.printf("So tien ban can phai tra la : %.3f", soTien);
        }
        else if (soDienDaDung > 50)
        {
            soTien = 50*1000 + (soDienDaDung - 50)*1200;
            System.out.printf("So tien ban can phai tra la : %.3f", soTien);
        }
        else
        System.out.print("Nhap tam bay");
    }
}