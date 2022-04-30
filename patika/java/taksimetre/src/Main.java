import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        /*
        Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.

        + Taksimetre KM başına 2.20 TL tutmaktadır.
        + Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
        + Taksimetre açılış ücreti 10 TL'dir.
         */
        double perKm = 2.20, startPrice = 10, total, km;

        // kullanıcıdan km bilgisi al
        Scanner scn = new Scanner(System.in);
        System.out.print("kaç km yol gittiniz: ");
        km = scn.nextDouble();

        total = startPrice;
        total += perKm * km;

        total = (total < 20 ) ? 20 : total;

        System.out.println("Toplam Taksi Ücretiniz: " + total);
    }
}
