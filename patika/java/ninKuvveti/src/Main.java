import java.util.Scanner;
/*
Ödev
Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.
 */
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int sinirDeger = 0;
        System.out.print("Kuvvetlerin sonucu için Sınır Değer girin: ");
        sinirDeger = scan.nextInt();

        //i = 1
        //i *= 4 == 4
        //i *= 4 == 16

        // 4'un Kuvveti
        int kuvvet = 0;
        for(int sonuc = 1; sonuc <= sinirDeger; sonuc *= 4){
            System.out.println("4^" + kuvvet + ": " + sonuc);
            kuvvet += 1;
        }

        // 5'un Kuvveti
        kuvvet = 0;
        for(int sonuc = 1; sonuc <= sinirDeger; sonuc *= 5){
            System.out.println("5^" + kuvvet + ": " + sonuc);
            kuvvet += 1;
        }

    }
}
