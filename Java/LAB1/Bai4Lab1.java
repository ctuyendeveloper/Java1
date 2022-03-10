package LAB1;
import java.util.Scanner;

public class Bai4Lab1 {
    public static void main(String[] args) {
        double delta;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap gia tri A : ");
        double numbera = scanner.nextDouble();
        System.out.print("Nhap gia tri b : ");
        double numberb = scanner.nextDouble();
        System.out.print("Nhap gia tri b : ");
        double numberc = scanner.nextDouble();
        if (numbera == 0) {
            if (numberb == 0) {
                if (numberc == 0)
                    System.out.print("Phuong trinh vo so nghiem");
                else
                    System.out.print("Phuong trinh vo nghiem");
            } else
                System.out.printf("Phuong trinh co mot nghiem duy nhat: %.3f", -numberc / numberb);
        } else {
            delta = numberb * numberb - 4 * numbera * numberc;
            if (delta < 0)
                System.out.print("Phuong trinh vo nghiem");
            else if (delta == 0)
                System.out.printf("Phuong trinh co nghiem kep: %.3f", -numberb / (2 * numbera));
            else {
                System.out.print("Phuong trinh co 2 nghiem rieng biet");
                System.out.printf("\nNghiem so 1: %.3f", (-numberb + Math.sqrt(delta)) / (2 * numbera));
                System.out.printf("\nNghiem so 2: %.3f", (-numberb - Math.sqrt(delta)) / (2 * numbera));
            }
        }
    }
}