import java.util.Scanner;

public class latihan1 {
    public static void main(String[] args) {

        Scanner baca = new Scanner(System.in); // membaca inputan keyboard

        float p, l, Luas; // deklarasi variabel

        System.out.print("Masukkan Panjang: ");
        p = baca.nextFloat();

        System.out.print("Masukkan Lebar: ");
        l = baca.nextFloat();

        Luas = p * l;

        System.out.println("Luas adalah: " + Luas);

        String A, B;

        System.out.print("Masukkan Teks A: ");
        A = baca.next();
        System.out.print("Masukkan Teks B: ");
        B = baca.next();

        System.out.println("Teks Setelah Disambung :");
        System.out.println(A + " " + B);
    }
}