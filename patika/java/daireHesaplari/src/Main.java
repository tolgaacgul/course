import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        double r, alan, cevre, PI = 3.14;
        /*
        Java ile yarı çapını kullanıcıdan aldığınız dairenin alanını ve çevresini hesaplayan programı yazın.

        Alan Formülü : π * r * r;
        Çevre Formülü : 2 * π * r;
         */
        Scanner scn = new Scanner(System.in);
        System.out.print("Yarı çap nedir: ");
        r = scn.nextDouble();

        alan = PI * r * r;
        cevre = 2 * PI * r;

        System.out.println("Alan: " + alan);
        System.out.println("Cevre: " + cevre);

        /*
        Ödev
        Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.

        𝜋 sayısını = 3.14 alınız.

        Formül : (𝜋 * (r*r) * 𝛼) / 360
         */

        double alpha;
        System.out.print("Yarı Çap: ");
        r = scn.nextDouble();

        System.out.print("Alpha derecesi(0,360): ");
        alpha = scn.nextDouble();

        alan = (PI * (r * r) * alpha) / 360;
        System.out.println("Belirlediğiniz açının alanı: " + alan);

    }
}
