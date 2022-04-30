import java.util.Scanner;

public class Main {
    public static void main(String[] arg){
        Scanner scn = new Scanner(System.in);
        /*
        Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam tutarını
        ekrana yazdıran programı yazın.

        --Meyveler ve KG Fiyatları--
        Armut : 2,14 TL
        Elma : 3,67 TL
        Domates : 1,11 TL
        Muz: 0,95 TL
        Patlıcan : 5,00 TL
         */

        //kg değerleri
        double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5;

        // kaç kilo alındı değerleri kullanıcıdan al
        double kgArmut, kgElma, kgDomates, kgMuz, kgPatlican;
        System.out.print("Kaç Kilo Armut Aldın: ");
        kgArmut = scn.nextDouble();
        System.out.print("Kaç Kilo Elma Aldın: ");
        kgElma = scn.nextDouble();
        System.out.print("Kaç Kilo Domates Aldın: ");
        kgDomates = scn.nextDouble();
        System.out.print("Kaç Kilo Muz Aldın: ");
        kgMuz = scn.nextDouble();
        System.out.print("Kaç Kilo Patlican Aldın: ");
        kgPatlican = scn.nextDouble();

        double toplamFiyat = kgArmut*armut + kgElma*elma + kgDomates*domates + kgMuz*muz + kgPatlican*patlican;
        System.out.println("Toplam Tutar: " + toplamFiyat + " 2₺");
    }
}
