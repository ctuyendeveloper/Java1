package LAB1;
import java.util.Scanner;

public class Bai3Lab1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Canh : ");
        int canh = scanner.nextInt();
        int theTichLapPhuong = canh * canh * canh;
        System.out.printf("The tich lap phuong la : %d ", theTichLapPhuong);
    }
} 