/*
Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız.
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        int k, ort=0, toplam=0, payda=0;

        System.out.print("Sayıyı Girin \n(3 ve 4'e tam bölünen sayıların ort. için): ");
        k = scn.nextInt();

        do{

            if(k%3==0 && k%4==0){
                toplam += k;
                payda ++;
            }

            k--;
        }while(k > 0);

        System.out.println("Tam bölünen sayıların Toplamı: " + toplam);
        if(payda == 0 ){
            System.out.println("Hiç 3 ve 4 bölünen sayı yok!");
        }else{
            System.out.println("Tam bölünen sayıların Ortalaması: " + toplam/payda);
        }
    }
}
