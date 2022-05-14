import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        /*
        Java ile basamak sayısının kullanıcıdan alınan ve döngüler kullanılarak,
        yıldızlar(*) ile ekrana ters üçgen çizen programı yazın.

        n = 4
                    *   _
        *******     7   0
         *****      5   1
          ***       3   2
           *        1   3

            2*n-1 --> satırdaki yıldızlar
         */


        System.out.print("Satır Sayısını Gir: ");
        int n = scn.nextInt();

        int blank = 0;
        int ilkYildizSayisi = 2*n-1;
        for(int i = 1; i <= n; i++){
            //bosluklar
            for(int b = 1; b <= blank; b ++){
                System.out.print(" ");
            }
            //yıldızlar
            for(int y = 1; y <= ilkYildizSayisi; y++){
                System.out.print("*");
            }
            System.out.println();
            ilkYildizSayisi -= 2;
            blank += 1;
        }

    }
}
