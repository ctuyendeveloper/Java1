package LAB4;
import java.util.Scanner;

public class sanPham {
    public String tenSp;
    public double donGia;
    public double giamGia;
    public double getThueNhapKhau;
    public void nhap()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ten san pham: ");
        tenSp = scanner.nextLine();
        System.out.print("Don gia: ");
        donGia = scanner.nextDouble();
        System.out.print("Giam gia: ");
        giamGia = scanner.nextDouble();
    }
    public void xuat()
    {
        getThueNhapKhau = donGia * 0.1;
        System.out.printf("\nTen san pham: %s", tenSp);
        System.out.printf("\nDon gia: %.3f", donGia);
        System.out.printf("\nGiam gia: %.3f", giamGia);
        System.out.printf("\nThue nhap khau: %.3f", getThueNhapKhau);
    }
}
