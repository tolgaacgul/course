import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        // değişkenler
        double a, b, c;

        // kullanıcıdan veri al
        Scanner scn = new Scanner(System.in);
        System.out.print("1. dik kenar: ");
        a = scn.nextDouble();
        System.out.print("2. dik kenar: ");
        b = scn.nextDouble();

        //hipotenus hesabi
        c = Math.sqrt((a*a)+(b*b));
        System.out.println("hipotenus değeri :" + c);

        //-----------------------------------------Farklı İşlem----------------
        //-----------------------------------------Alan Hesaplama İşlemi----------------
        // üç kenarı alıp alan hesabı yapalım
        double x,y,z,u;
        System.out.print("Sırasıyla 3 kenar uzunluğunu girin: ");
        x = scn.nextDouble();
        y = scn.nextDouble();
        z = scn.nextDouble();
        u = (x+y+z)/2;

        // cevre = 2*u
        // alan * alan = u*(u-x)*(u-y)*(u-z)

        double alanKare = u*(u-x)*(u-y)*(u-z);
        double alan = Math.sqrt(alanKare);
        System.out.println("alan: " + alan);

    }
}
