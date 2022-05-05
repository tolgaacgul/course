import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int km, age, way;
        double pricePerKm = 0.10, priceTotal;
        String yn;

        System.out.print("Mesafeyki km cinsinden gir: ");
        km = scn.nextInt();

        System.out.print("Yaşını Gir: ");
        age = scn.nextInt();

        System.out.print("Evet [1]\n" +
                "Hayır[2]\n" +
                "Tek yön mü gideceksiniz: ");
        way = scn.nextInt();

        priceTotal = pricePerKm * km;
        if(way != 1 && way !=2){
            System.out.println("Hatalı Veri Girdiniz");
        }else{
            if (age > 0 && km >0){
                if(age < 12){
                    // Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
                    priceTotal = (priceTotal) - (priceTotal*0.50);
                }else if(age>=12 && age<=24){
                    // Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
                    priceTotal = (priceTotal) - (priceTotal*0.10);
                }else if(age>=65){
                    // Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
                    priceTotal = (priceTotal) - (priceTotal*0.30);
                }
                if(way == 1){
                    //tek Yön Tercihi
                    System.out.println("Toplam Yol ücreti " + priceTotal + "\'dir. ");
                }else if(way == 2){
                    // Gidiş Dönüş Tercihi
                    priceTotal *= 2;
                    // Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.
                    priceTotal = priceTotal - priceTotal*0.2;
                    System.out.println("Toplam Yol ücreti " + priceTotal + "\'dir. ");
                }
            }else{
                System.out.println("Farklı deneyler peşindesin anlaşılan xD");
            }
        }

    }
}
