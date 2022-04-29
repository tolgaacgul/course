import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        // Degiskenlerimizi tanımlayalım
        int mat, fzk, kmy, trk, trh, mzk;

        // Scanner nesnesi olusturuyoruz.
        Scanner scn = new Scanner(System.in);

        // Bilgileri alıyoruz
        System.out.print("Matematik notu: ");
        mat = scn.nextInt();

        System.out.print("Fizik notu: ");
        fzk = scn.nextInt();

        System.out.print("Kimya notu: ");
        kmy = scn.nextInt();

        System.out.print("Turkce notu: ");
        trk = scn.nextInt();

        System.out.print("Tarih notu: ");
        trh = scn.nextInt();

        System.out.print("Muzik notu: ");
        mzk = scn.nextInt();

        // Toplamı hesapla
        int toplam = mat + fzk + kmy + trk + trh + mzk;

        double ortalama = toplam / 6;

        System.out.println("Ortalama: " + ortalama);

        // Bu çözüm yolu hata veriyor. ??
        //(ortalama > 60) ? System.out.print("Geçtiniz") : System.out.print("Kaldınız");

        //Bir String değer oluşturum str ona atadık sonra yazdırdık
        String hasPassed = (ortalama > 60 ) ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println(hasPassed);


    }
}
