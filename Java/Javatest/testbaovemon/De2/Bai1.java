package De2;
import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) 
    {
        int songuyenduong;
        Scanner s=new Scanner(System.in);
        do 
        {
            System.out.print("Tinh tong tat ca cac phan tu le tu 1 den n");
            songuyenduong = s.nextInt();
            if(songuyenduong < 0)
            {
                System.out.print("Nhap sai! Nhap lai so nguyen duong");
            }
            else if(songuyenduong == 0)
            {
                System.out.print("Tong = 0");
            }
            else
            {
                if(songuyenduong % 2 != 0)
                {
                    for(int i = 1; i < songuyenduong; i++)
                    {
                        // tong = tong+i;
                    }
                }
                // System.out.printf("Tong cac so le: %d", tong);
            }
        } while (songuyenduong < 0);
    }
}
