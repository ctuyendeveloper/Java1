package LAB3;

import java.util.Arrays;
import java.util.Scanner;

public class LAB3
{
    public static void main(String[] args) 
    {
        menu();
    }
    public static void bai1() 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap gia tri so muon kiem tra : ");
        int number = scanner.nextInt();
        if (number < 2)
        {
            System.out.printf("%d Khong phai so nguyen to", number);
        }
        int count = 0;
        for (int i = 2; i < number; i++)
        {
            if (number % i == 0)
            {
                count++;
            }
        }
        if (count == 0)
        {
            System.out.printf("%d La so nguyen to", number);
        }
        else
        {
            System.out.printf("%d Khong phai so nguyen to", number);
        }
    }
    public static void bai2() 
    {
        for (int i = 1; i <= 10; i++)
        {
            for (int a = 1; a <= 10; a++)
            {
                System.out.printf("%d x %d = %d\t", i, a, a * i);
            }
            System.out.print("\n");
        }
    }
    public static void bai3() 
    {
        Scanner scanner = new Scanner(System.in);
        int a = 1;
        System.out.printf("Nhap so phan tu muon tao vao trong mang la: ");
        int n = scanner.nextInt();
        int A[] = new int[n];
        for (int i = 0; i < n; i++)
        {
            System.out.printf("Phan tu %d = ", a);
            A[i] = scanner.nextInt();
            if (a <= n)
            {
                a++;
            }
        }
        // SẮP XẾP TĂNG DẦN
        Arrays.sort(A);
        System.out.println(Arrays.toString(A));
        // SỐ BÉ NHẤT TRONG MẢNG CÁCH 1
        // int min = arr[0];
        //     for (int i = 0; i < n; i++)
        //     {
        //         if (arr[i] < min)
        //         {
        //             min = arr[i];
        //         }
        //     }
        //     System.out.printf("Min: %d", min);
        int min = A[0];
        System.out.printf("Min: %d",Math.min(min, A[0]));
        // CÁCH 2 ^
        // -------------------
        // float tong = 0, bienDem = 0, trungBinh = 0;
        // while (arr[0] < n)
        // {
        //     if (arr[0] % 3 == 0)
        //     {
        //         tong += arr[0];
        //         bienDem++;
        //         System.out.printf("\nChia het cho 3: %d", arr[0]);
        //     }
        //     arr[0]++;
        // }
        // trungBinh = tong / bienDem;
        // System.out.printf("\nTrung binh tong cac so chia het cho 3 trong mang la %.2f", trungBinh);
        float tong = 0, bienDem = 0, trungBinh = 0;
        for (int i = 0; i < n; i++)
        {
            if (A[i] % 3 == 0)
            {
                tong += A[i];
                bienDem++;
                System.out.printf("\nChia het cho 3: %d", A[i]);
            }
        }
        trungBinh = tong / bienDem;
        System.out.printf("\nTrung binh tong cac so chia het cho 3 trong mang la %.2f", trungBinh);
    }
    public static void bai4() 
    {
        Scanner scanner = new Scanner(System.in);
        String ten[] = new String[2];
        float diem[] = new float[2];
        for (int i = 0; i < diem.length; i++)
        {
            System.out.print("Ten: ");
            ten[i] = scanner.nextLine();
            System.out.print("Diem: ");
            diem[i]= scanner.nextInt();
            scanner.nextLine();
        }
        for (int i = 0; i < diem.length; i++)
        {
            System.out.printf("\nHo va ten: %s", ten[i]);
            System.out.printf("\nDiem : %.3f", diem[i]);
            if (diem[i] <= 10 && diem[i] >= 9)
            {
            System.out.print("\nHoc luc xuat sac\n");
            }
            else if (diem[i] < 9 && diem[i] >= 8)
            {
            System.out.print("\nHoc luc gioi\n");
            }
            else if (diem[i] < 8 && diem[i] >= 6.5)
            {
            System.out.print("\nHoc luc kha\n");
            }
            else if (diem[i] < 6.5 && diem[i] >= 5)
            {
            System.out.print("\nHoc luc trung binh\n");
            }
            else if (diem[i] < 5 && diem[i] >= 0)
            {
            System.out.print("\nHoc luc yeu\n");
            }
            else
            {
            System.out.print("\nNhap diem sai\n");
            }   
        }
        for (int i = 0; i < diem.length; i++)
        {
            for(int b = 0; b < diem.length; b++)
            {
                if (diem[i] < diem[b])
                {
                    Float tam=diem[i];
                    diem[i]=diem[b];
                    diem[b]=tam;
                    String tentam = ten[i];
                    ten[i] = ten[b];
                    ten[b] = tentam;
                }
            }
        }
        System.out.print("\n +--------------------------------------+\n");
        System.out.print(" + DA SAP XEP DIEM THEO THU TU TANG DAN +");
        System.out.print("\n +--------------------------------------+\n");
        for (int i = 0; i < 2; i++)
        {
            System.out.printf("\nHo va ten: %s", ten[i]);
            System.out.printf("\nDiem : %.3f", diem[i]);
        }
    }
    public static void menu() 
    {
        Scanner sc = new Scanner(System.in);
        int select;
        do
        {
            System.out.print("\n +--------------+\n");
            System.out.print(" + >>> LAB3 <<< +");
            System.out.print("\n +--------------+\n");
            System.out.print("\n1. Bai so 1\n");
            System.out.print("2. Bai so 2\n");
            System.out.print("3. Bai so 3\n");
            System.out.print("4. Bai so 4\n");
            System.out.print("0. Thoat\n");
            System.out.print("Chon chuc nang[1-4]: ");
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
                bai4();
                break;
            }
            case 5:
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
        } while (select != 5);
    }
}
