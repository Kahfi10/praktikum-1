public class praktikum3 {
    public static void main(String[] args) {
        int a,b,c,pangkat1,pangkat2,pangkat3,turunan1,turunan2,turunan3;

        pangkat1 = 2;pangkat2 = 1;pangkat3 = 0;

        a=2;
        System.out.println("f(x)1 ="+a+"x^2");
        turunan1 = a*pangkat1;
        b=3;
        System.out.println("f(x)2 ="+b+"x^1");
        turunan2 = b*pangkat2;
        c=5;
        System.out.println("f(x)3 ="+c+"x^0");
        turunan3 = c*pangkat3;

        System.out.println("Jadi turunan pertamanya adalah :");
        System.out.print("f'(x)="+turunan1+"x^"+-pangkat1+"+");
        System.out.print(turunan2+"x^"+-pangkat2);
        System.out.println(turunan3+"\n");
    }
}
