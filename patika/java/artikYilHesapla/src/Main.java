import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Yılı Girin: ");
        int yil = scn.nextInt();
        boolean isArtikYil;

        if(yil%100 == 0){
            System.out.println("Yıl 100'ün katı");
            if (yil%400 == 0){
                isArtikYil = true;
            }else{
                isArtikYil = false;
            }
        }else if(yil%4 == 0 ){
            isArtikYil = true;
        }else{
            isArtikYil = false;
        }

        String yazdir = isArtikYil ? (yil + " yılı artık bir yıldır !") : (yil + " yılı artık bir yıl değilr !.");
        System.out.println(yazdir);
    }
}
