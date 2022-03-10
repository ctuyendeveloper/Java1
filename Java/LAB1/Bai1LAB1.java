package LAB1;
import java.util.Scanner;


public class Bai1LAB1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ho va ten: ");
        String hoTen = scanner.nextLine();
        System.out.print("Diem TB: ");
        Double diemTB = scanner.nextDouble();
        System.out.printf("%s %f diem", hoTen, diemTB);
    }
}