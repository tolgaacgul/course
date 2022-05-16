import java.util.Scanner;
/*
Java dilinde, taban ve üs değerleri kullanıcıdan alınan üs alma işlemini
"Recursive" metot kullanarak yapan programı yazınız.
 */

public class Main {

     static int power(int base, int exp){
        if(exp == 0){
            return 1;
        }else {
            return base * power(base, exp-1);
        }

    }

    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int taban = 1, us = 1;

        do {

            System.out.println("Çıkmak için: [0][0]");
            System.out.print("Taban: ");
            taban = scan.nextInt();

            System.out.print("Us: ");
            us = scan.nextInt();

            System.out.println("Sonuç : " + power(taban,us));

        }while( !(taban == 0 && us == 0 ) );


    }
}
