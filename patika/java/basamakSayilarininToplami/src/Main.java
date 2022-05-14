import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        /*
        Ödev
        Bir sayının basamak sayılarının toplamını hesaplayan program yazınız.

        Örnek : 1643 = 1 + 6 + 4 + 3 = 14
         */

        System.out.print("Sayi girin: ");
        int sayi = scn.nextInt();
        int total = 0;

        do{
            int lastDigit = sayi % 10;
            sayi = sayi/10;
            System.out.print(lastDigit);
            if(sayi != 0){
                System.out.print("+");
            }
            total += lastDigit;
        }while(sayi != 0);

        // Sonucu basar
        System.out.print(" = " + total);

        /*
            Örnek Çıktı:

            Sayi girin: 9087
            7+8+0+9 = 24
         */
    }
}
