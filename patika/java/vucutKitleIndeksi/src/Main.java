import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        // Kilo (kg) / Boy(m) * Boy(m)
        double kg, m, cm, vke;
        Scanner scn = new Scanner(System.in);

        System.out.print("Kilo girin: ");
        kg = scn.nextDouble();

        // cm cinsinden alınıp m hesabına donusturuldu
        System.out.print("Boyunuzu giriniz(cm = orn(174)): ");
        cm = scn.nextDouble();
        m = cm / 100;

        //vucut kitle endeksi hesabını yapıyoruz
        vke = kg / (m * m);
        System.out.println("Vucut Kitle Endeksi: " + vke);
    }
}
