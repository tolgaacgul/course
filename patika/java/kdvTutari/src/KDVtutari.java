import java.util.Scanner;

public class KDVtutari {
    public static void main(String[] args){
        double anaPara, kdv, kdvTutari, kdvliFiyat;
        Scanner scn = new Scanner(System.in);

        System.out.print("Ana paranızı girin: ");
        anaPara = scn.nextDouble();
        kdv = anaPara > 1000 ? 0.08 : 0.18;
        kdvTutari = (anaPara * kdv);
        kdvliFiyat = anaPara + kdvTutari;


        System.out.println("KDV'siz Fiyat: " + anaPara);
        System.out.println("KDV Değeri: " + kdv);
        System.out.println("KDV'li Fiyat: " + kdvliFiyat);
        System.out.println("KDV tutari: " + kdvTutari);
    }
}
