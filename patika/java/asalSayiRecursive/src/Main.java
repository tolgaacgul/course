import java.util.Scanner;
/*
Java dilinde "Recursive" metot kullanarak, kullanıcıdan alınan sayının
"Asal" sayı olup olmadığını bulan programı yazın.

Sayı Giriniz : 22
22 sayısı ASAL değildir !

Sayı Giriniz : 2
2 sayısı ASALDIR !
 */
public class Main {
    static int asalmi(int num, int i){

        if (i==1){
            return 1;
        }else {
            if (num%i==0){
                return 0;
            }
            else return asalmi(num,i-1);
        }

    }

    public static void main(String[] args){
        int num, prime ;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Asal olduğunu düşündüğün sayı : ");
        num= scanner.nextInt();

        prime = asalmi(num,num/2);

        if (prime == 1){
            System.out.println(num+" sayisi ASALDIR !");
        }else {
            System.out.println(num+" sayisi ASAL değildir !");
        }

    }
}
