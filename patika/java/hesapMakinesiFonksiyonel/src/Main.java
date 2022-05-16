import java.util.Scanner;
public class Main {

    //1. Topla
    static int plus(){
        Scanner scan = new Scanner(System.in);
        int result = 0, plusNumber, i=1;
        do {
            System.out.print("Sonuç Için [0]\n" + i + ". sayi: ");
            plusNumber = scan.nextInt();
            result += plusNumber;
            i++;
        }while(plusNumber != 0);
        System.out.println("Toplam Sonuç: " + result);
        return result;
    }

    //2. Çıkar
    static int minus() {
        Scanner scan = new Scanner(System.in);
        int result = 0, number = 1, i = 1;

        do {
            if (i == 1){
                System.out.print("Ana Sayı: ");
                result = scan.nextInt();
            }else {
                System.out.print("Sonuç için[0]\nÇıkarılacak Sayı: ");
                number = scan.nextInt();
                result -= number;
            }
            i++;
        }while(number != 0);
        System.out.println("Sonuç: "+ result);
        return result;
    }

    //-3. Çarp
    static void times() {
        Scanner scan = new Scanner(System.in);
        int number = 0, result = 1, i = 1;

        while (number != 1) {
            System.out.println("Çıkış için [1]");
            System.out.print(i++ + ". sayı :");
            number = scan.nextInt();

            result *= number;
        }

        System.out.println("Sonuç : " + result);
    }

    //-4. böl
    static void divided() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bölmek istediğin sayı: ");
        int pay = scan.nextInt();
        double payda = 1, result = 0.0;

        while(payda != 0){
            System.out.print("Çıkış için [0]\nŞimdi Kaça Bölünsün: ");
            payda = scan.nextDouble();
            if(payda == 0){
                System.out.println("0 'a bölünme olamaz. En iyisi sonucu göstereyim.");
            }else{
                result = pay / payda;
            }
        }

        System.out.println("Sonuç : " + result);
    }

    //-5. Üs
    static void power() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Taban değeri giriniz :");
        int base = scan.nextInt();
        System.out.print("Üs değeri giriniz :");
        int exponent = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        System.out.println("Sonuç : " + result);
    }

    //-6. Fak
    static void factorial() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı giriniz :");
        int n = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        System.out.println("Sonuç : " + result);
    }

    //7. mod
    static void mod(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Hangi sayının modunu alacaksın: ");
        int firstNumber = scan.nextInt();
        System.out.print(firstNumber + " sayısının kaçıncı modu: ");
        int secondNumber = scan.nextInt();
        int result = firstNumber % secondNumber;
        System.out.println("Sonuç: " + result);
    }

    //8. dikdorgen
    static void rectangleCalculate(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Dikdörgenin 1. Kenarı: ");
        int oneSide = scan.nextInt();
        System.out.print("Dikdörgenin 2. Kenarı: ");
        int twoSide = scan.nextInt();
        int alan = oneSide*twoSide;
        int cevre = 2*(oneSide + twoSide);
        System.out.println("Alan : " + alan);
        System.out.println("Çevre: " + cevre);

    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select;
        String menu = "1- Toplama\n"
                + "2- Çıkarma\n"
                + "3- Çarpma\n"
                + "4- Bölme\n"
                + "5- Üs Al\n"
                + "6- Faktoriyel\n"
                + "7- Modu\n"
                + "8- Dikdörtgen Alan ve Çevre\n"
                + "0- Çıkış";

        do {
            System.out.println(menu);
            System.out.println("-------------");
            System.out.print("Işlem Seç :");
            select = scan.nextInt();
            System.out.println("-------------");
            switch (select) {
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    rectangleCalculate();
                    break;
                case 0:
                    System.out.println("Çıkış Yaptınız. GÜLE GÜLE");
                    break;
                default:
                    System.out.println("Yanlış bir değer girdiniz, tekrar deneyiniz.");
            }
        } while (select != 0);


    }
}
