import java.util.Scanner;

public class pratikum1 {
    public static void main(String[] args) {
        float r1,r2,r3,r4,l1,l2,totalRseri,rParalel,totalLseri,lParalel,hasilSeri,V;

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan r1 :");
        r1 = sc.nextFloat();
        System.out.print("Masukkan r2 :");
        r2 = sc.nextFloat();
        System.out.print("Masukkan r3 :");
        r3 = sc.nextFloat();
        System.out.print("Masukkan r4 :");
        r4 = sc.nextFloat();
        System.out.print("Masukkan l1 :");
        l1 = sc.nextFloat();
        System.out.print("Masukkan l2 :");
        l2 = sc.nextFloat();

        totalRseri = r1 + r2;
        totalLseri = l1 + l2;
        hasilSeri = (totalRseri*totalLseri);

        System.out.println("Hasil Rangkaian Seri : " + totalRseri);
        System.out.println("Hasil lseri : " + totalLseri);
        System.out.println("Hasil Vseri : " + hasilSeri);

        rParalel = 1/r1 + 1/r2;
        lParalel = l1 + l2;
        V = (rParalel*lParalel);

        System.out.println("Hasil Rangkaian Paralel : " + rParalel);
        System.out.println("Hasil lParalel : " + lParalel);
        System.out.println("Hasil VParalel : " + V);


    }
}
