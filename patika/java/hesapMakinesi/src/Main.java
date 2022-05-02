import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // işlem yapılacak sayılar
        int n1,n2;
        Scanner scn = new Scanner(System.in);

        // Yapılabilir işlemler
        System.out.println("1- Toplama  2- Çıkarma\n" +
                           "3- Çarpma   4- Bölme");

        System.out.print("Hangi işlemi yapacaksınız: ");
        int secim = scn.nextInt();


        System.out.print("1. Sayıyı Girin: ");
        n1 = scn.nextInt();

        System.out.print("2. Sayıyı Girin: ");
        n2 = scn.nextInt();


        switch(secim){
            case 1:
                // toplama işlemmi
                System.out.println("Toplam: " + (n1+n2));
                break;
            case 2:
                // çıkarma işlemi
                System.out.println("Çıkarma: " + (n1-n2));
                break;
            case 3:
                // çarpma işlemi
                System.out.println("Çarpımı: " + (n1*n2));
                break;
            case 4:
                // bölme işlemi
                if(n2 != 0 ){
                    System.out.println("Bölme: " + (n1/n2));
                }else{
                    System.out.println("Taban 0 dan farklı olmalıydı");
                }
                break;
            default:
                System.out.println("Hatalı bir işlem seçimi yaptınız. ");
        }


    }
}
