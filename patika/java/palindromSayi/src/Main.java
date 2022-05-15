import java.util.Scanner;
/*
Java ile bir sayının "Palindrom Sayı" olup olmadığını bulan bir program yapıyoruz.

Palindrom Sayı Nedir ?
Palindromik sayı, iki taraftan okunduğu zaman okunuş yönüyle aynı olan sayılardır.

Örnek: 1, 4, 8, 99, 101, 363, 4004, 9889....
*/

public class Main {
    static boolean isPalindrom(int number){
        int temp = number, reverseNum = 0, lastNum = 0;

        while(temp != 0){
            lastNum = temp % 10;
            reverseNum = reverseNum * 10 + lastNum;
            temp /= 10;
        }

        boolean isPalindrom = (reverseNum == number) ? true : false;
        return isPalindrom;
    }

    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int number;
        do {
            System.out.print("Çıkış [0]\nSayi Gir: ");
            number = scn.nextInt();

            String printResult = isPalindrom(number) ? "Palinrom Değer" : "Palindrom Değil";
            System.out.println(printResult);
        } while (number != 0);

    }
}
