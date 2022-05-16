import java.util.Scanner;
public class Main {
/*
Java dilinde kullanıcıdan alınan n değerine göre aşağıdaki kurala uyan döngü kullanmadan bir
 "Recursive" metot yazın.

Kural : Girilen sayı 0 veya negatif olduğu yere kadar girilen sayıdan 5 rakamını çıkarın.
Her çıkarma işlemi sırasında ekrana son değeri yazdırın. Sayı negatif veya 0 olduktan sonra
tekrar 5 ekleyin. Yine her ekleme işleminde sayının son değerini ekrana yazdırın.
 */
    static void pattern(int number){
        int i = number;
        int firstNumber = 9;
        // 9 4 -1
        if (i > 0){
            System.out.print(i + " ");
            pattern(i-5);
        }if (i <= 0){
            System.out.print(i + " ");
            pattern(i, firstNumber);
        }
    }
    static void pattern(int i, int firstNumber){
        if (i == firstNumber){
            System.out.print(i + " ");
            //4 9
        } else if(i < firstNumber) {
            i += 5;
            System.out.print(i + " ");
            if(i != firstNumber){
                pattern(i, firstNumber);
            }
        }
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Desen için sayı gir: ");
        int number = scan.nextInt();

        pattern(number);
        /*
        Örnek Çıktımız:

        Desen için sayı gir: 12
        12 7 2 -3 2 7 12
         */

    }
}
