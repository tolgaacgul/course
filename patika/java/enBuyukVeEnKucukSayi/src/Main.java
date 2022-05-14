import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        /*
          SORU ?????????????
          Java ile klavyeden girilen N tane sayma sayısından en büyük ve
          en küçük sayıları bulan ve bu sayıları ekrana yazan programı yazın.
          örn:
          Kaç tane sayı gireceksiniz: 4
          1. Sayıyı giriniz: 16
          2. Sayıyı giriniz: -22
          3. Sayıyı giriniz: -15
          4. Sayıyı giriniz: 100
          En büyük sayı: 100
          En küçük sayı: -22
         */

        Scanner scn = new Scanner(System.in);

        System.out.print("Kaç Adet Sayi Gireceksin: ");
        int n = scn.nextInt();
        int buyuk = 0, kucuk = 0;

        for (int i = 1; i<=n; i++){
            System.out.print("Sayı " + i + " : ");
            int sayi = scn.nextInt();

            if(sayi > buyuk){
                buyuk = sayi;
            }
            if (sayi < kucuk){
                kucuk = sayi;
            }
        }

        System.out.println("En Büyük: " + buyuk);
        System.out.println("En Küçük: " + kucuk);

        /*
            BİZİM ÇIKTIMIZ:

            Kaç Adet Sayi Gireceksin: 5
            Sayı 1 : 5
            Sayı 2 : -134
            Sayı 3 : -135
            Sayı 4 : 23
            Sayı 5 : 1
            En Büyük: 23
            En Küçük: -135
         */
    }
}
