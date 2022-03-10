package LAB1;
import java.util.Scanner;

public class Bai2Lab1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Chieu dai: ");
        int dai = scanner.nextInt();
        System.out.print("Chieu rong: ");
        int rong = scanner.nextInt();
        int chuvi = (dai + rong) * 2;
        int dientich = dai * rong;
        int canhnhonhat = Math.min(dai, rong);
        System.out.printf("Chu vi hcn la : %d ", chuvi);
        System.out.printf("\nDien tich hcn la : %d ", dientich);
        System.out.printf("\nCanh nho nhat hcn la : %d ", canhnhonhat);
    }
}