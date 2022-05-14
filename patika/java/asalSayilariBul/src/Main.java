import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        /*
         Java ile 1 - 100 arasındaki asal sayıları ekrana yazdıran programı yazınız.
         Senaryo
         2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97
         */

        boolean isAsal;

        for(int i = 1; i <= 100; i++){
            isAsal = true;

            for (int a = 2; a < i; a++){
                if(i%a == 0){
                    isAsal = false;
                }
            }

            // 1' i asal olarak almıyoruz
            if(i == 1){ continue; }
            if(isAsal){
                // asal ise yazdırır
                System.out.print(i + " ");
            }
        }

        /*
        Çıktımız:
        2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97
         */

    }
}
