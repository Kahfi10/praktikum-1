import java.util.Scanner;

public class latihan2 {
    public static void main(String[] args) {
        
    Scanner input = new Scanner(System.in);

    String nama, kelas, semester, nim, nhuruf;

    float tugas, mid , akhir, finl;

    System.out.print("Masukkan NIM :");
    nim = input.nextLine();
    System.out.print("Masukkan Nama :");
    nama = input.nextLine();
    System.out.print("Masukkan Kelas :");
    kelas = input.nextLine();
    System.out.print("Masukkan Semester :");
    semester = input.nextLine();
    System.out.print("Masukkan Nilai Tugas :");
    tugas = input.nextFloat();
    System.out.print("Masukkan Nilai Mid :");
    mid = input.nextFloat();
    System.out.print("Masukkan Nilai Akhir :");
    akhir = input.nextFloat();
    System.out.print("Masukkan Nilai Final :");
    finl = input.nextFloat();

    akhir = (tugas+mid+finl)/3;

    System.out.println("Nilai Akhir adalah :"+akhir);
    System.out.print("Nilai Huruf: ");
    nhuruf = input.next();
    }
}