
import java.util.Scanner;

public class coba {
    public static void main(String[] args) {
        int a,b,c,pangkat1,pangkat2;
    

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai a: ");
        a = sc.nextInt();
        System.out.print("Masukkan nilai variabel a :");
        String variabelA = sc.next();
        System.out.print("Masukkan pangkat nilai a:");
        pangkat1 = sc.nextInt();
        System.out.print("Masukkan Operator untuk nilai a :");
        String operator1 = sc.next();

        System.out.print("Masukkan nilai b: ");
        b = sc.nextInt();
        System.out.print("Masukkan variabel b: ");
        String variableB = sc.next();
        System.out.print("Masukkan pangkat nilai b:");
        pangkat2 = sc.nextInt();
        System.out.print("Masukkan Operator untuk nilai b: ");
        String operator2 = sc.next();
        System.out.print("Masukkan nilai c: ");
        c = sc.nextInt();

        System.out.println("f(x)= "+ a + variabelA + "^" + pangkat1 + " " + operator1 + " " + b + variableB + " " + operator2 + " " + c);

        int turunanNilaiA = a * pangkat1;
        int turunanPangkat1 = pangkat1 - 1;
        System.out.println("Turunan dari " + a + "x^ " + pangkat1 + " adalah " + turunanNilaiA + variabelA + "^" + turunanPangkat1 );

        int turunanNilaiB = b;
        System.out.println("Turunan dari " + b + "x" + " adalah " + turunanNilaiB);

        int turunanNilaiC = 0;
        System.out.println("Turunan dari " + c + " adalah " + turunanNilaiC);

        System.out.println("Turunan pertama f'(x) = " + turunanNilaiA + variabelA + "^" + turunanPangkat1 + " " + operator1 + " " + turunanNilaiB + " " + operator2 + " " +
         turunanNilaiC);

    }
}
