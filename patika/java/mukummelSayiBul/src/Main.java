import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        /*
        Klavyeden girilen bir sayının mükemmel sayı olup/olmadığını bulan ve sayı mükemmel sayı ise
        ekrana “mükemmel sayıdır.” değilse “mükemmel sayı değildir.” ifadelerini ekrana yazan programı
         Java dilinde yazınız.

        Mükemmel Sayı Nedir ?
        Bir sayının kendisi hariç pozitif tam sayı çarpanları (kalansız bölen sayıların) toplamı
        kendisine eşit olan sayıya mükemmel sayı denir.

           Bir sayı giriniz: 28
           28 Mükemmel sayıdır
           Bir sayı giriniz: 1
           1 Mükemmel sayı değildir.
           Bir sayı giriniz: 496
           496 Mükemmel sayıdır
         */
        Scanner scn = new Scanner(System.in);
        int total = 0, number;

        do{
            total = 0;
            System.out.print("Çıkış için [0]\nBir Sayı Gir: ");
            number = scn.nextInt();

            for(int i = 1; i < number; i++){
                if (number%i == 0){
                    total += i;
                }
            }

            if(total == number){
                System.out.println("-------------------------------");
                System.out.println("total: " + total + " = " + number + " :number");
                System.out.println("mükemmel sayıdır.");
                System.out.println("-------------------------------");
            }else{
                System.out.println("-------------------------------");
                System.out.println("total: " + total + " != " + number + ": number");
                System.out.println("mükemmel sayı değildir.");
                System.out.println("-------------------------------");
            }
        } while(number != 0);

    }
}
