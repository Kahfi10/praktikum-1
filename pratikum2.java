
import java.util.Scanner;

public class pratikum2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float x1, x2, y1, y2, jarak;

        System.out.print("Masukkan nilai x1: ");
        x1 = sc.nextFloat();
        System.out.print("Masukkan nilai x2: ");
        x2 = sc.nextFloat();
        System.out.print("Masukkan nilai y1: ");
        y1 = sc.nextFloat();
        System.out.print("Masukkan nilai y2: ");
        y2 = sc.nextFloat();

        jarak = (float) Math.sqrt(x1 - x2) * (x1 - x2) + (y1 - y2) * (y1
         - y2);
        System.out.println("Jarak antara dua titik adalah: " + jarak);

    }
}
