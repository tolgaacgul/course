import java.util.Scanner;
/*
    Java'da döngüler kullanarak yıldızlar ile elmas yapınız.
    uzunluk: 9
    yarısı: 4

            *
           ***
          *****
         *******
        *********
         *******
          *****
           ***
            *
 */
public class Main {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        System.out.print("Elmas uzunluğunu tek sayı olarak gir: ");
        int diamondLength = scn.nextInt();

        //elmasın üst kısmını ve alt kısmını ayrı yapmak için
        int diamondLengthHalf = diamondLength / 2;
        //yıldız sayısı artarak gidecek ve sonra düşecek
        int starNumber = 1;
        // Ilk başta elmasın yarı uzunluğu kadar boşluk oluyor
        //orn : ___*
        //      __***
        //gibi
        int blankNumber = diamondLengthHalf;

        // Elmasın üstü
        for (int i = 0; i<=diamondLengthHalf; i++){

            for (int b = 1; b <= blankNumber; b++){
                System.out.print(" ");
            }

            for (int y = 1; y<=starNumber; y++){
                System.out.print("*");
            }
            System.out.println();
            starNumber += 2;
            blankNumber --;
        }

        // Elmasın Altı
        blankNumber = 1;
        for (int i = 1; i <= diamondLengthHalf; i++){
            //bosluk
            for(int b = 1; b <= i; b++){
                System.out.print(" ");
            }

            //yıldız
            for (int y = 1; y <= starNumber-4; y++){
                System.out.print("*");
            }
            System.out.println();
            starNumber -= 2;
        }

    }
}
