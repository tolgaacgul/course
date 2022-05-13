import java.util.Scanner;
/*
Ödev
Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri
kabul eden ve girilen değerlerden çift ve 4'ün katları olan sayıları
toplayıp ekrana basan programı yazıyoruz.
 */
public class Main {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int number = 0, total = 0;

        do{
            System.out.print("Sayi gir: ");
            number = scn.nextInt();
            if(number%2 == 0 && number%4 ==0){
                total += number;
            }else if(number % 2 == 1){
                System.out.println("Tek sayi girdin. Sitemden çıkıyom ben");
            }
        }while(number%2 != 1);

        System.out.println("4'un katı ve çift sayıların toplamı: " + total);
    }
}
