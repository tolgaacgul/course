import java.util.Scanner;
public class Main {

    static int usAl(int taban, int ust){
        int result = 1;
        for(int i = 1; i<=ust; i++){
            result *= taban;
        }
        return result;
    }

    //geri değer döndürmez direk çalışır. print içinde çalışmaz
    static void sayHello(){
        System.out.println("Selanmın aleykume selam");
    }

    static void show() {
        System.out.println("Show metodu..");
        return;  // durdurma görevi gördü ?
    }

    // over loadin için ornek
    static void carp(){
        System.out.println("çarparım");
    }
    static void carp(int a){
        System.out.println(a + " değerini çarpayım mı");
    }
    static int carp(int a, int b){
        return a*b;
    }

    static String info() {
        System.out.println("Patika");
        return "eq3fqwefmqkegmet";
    }

    static void info(int a) {
        System.out.println("Dev");
    }

    // Recursion Fonk.
    static int basamaklarToplami(int sayi){
        if (sayi == 0){
            return 0;
        }else
            return sayi % 10 + basamaklarToplami(sayi / 10);
    }

    static void recursiveMethod(int num) {
        num--;
        if (num == 0)
            return;
        System.out.print(num + ",");
        recursiveMethod(num);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Test testNesnesi = new Test(9);
        testNesnesi.testMetot(9);


        /*
        int i = 8;
        if(i==10){
            System.out.println("i nin degeri 10'dur.");
        }
        else if(i<10){
            System.out.println("i nin degeri 10'dan kücüktür.");
        }
        else{
            System.out.println("i nin degeri 10'dan farklıdır ve 10'dan kücük degildir.");
        }

        // tuz oran
        float saltRatio = 0.9f;
        if(saltRatio >= 0.8) {
            System.out.println("yüksek derecede tuzlu");
        }
        else if(0.5 < saltRatio && saltRatio < 0.8 ) {
            System.out.println("orta derecede tuzlu");
        }
        else {
            System.out.println("düşük derecede tuzlu");
        }


        //soru
        int var1 = 5;
        int var2 = 6;
        if ((var2 = 1) == var1)
            System.out.println(var2);
        else
            System.out.println(++var2);


        // soru 3
        int a = 20, b = 10;
        if ((a < b) && (b++ < 25)){
            System.out.println(a);
        }else{
            System.out.print(a);
        }
        System.out.println(b);



        // switch case

        int not = 70;
        switch(not){
            case 70:
                System.out.println("70 ile geçtin");
                break;
            case 84:
                System.out.println("fsf");
                break;
            default:
                System.out.println("selam cı");
        }

        // while dongusu
        // iki sayının ortasını bulmak için kullannalım
        int buyukSayi = 100, kucukSayi = 51;
        while(++kucukSayi < --buyukSayi);
        System.out.println("While'a giren sayıların ortalaması: " + kucukSayi);

        // Sifre denemeis
        String customerPassword = "12345";
        boolean passwordSuccessfull = false;

        while(!passwordSuccessfull) {

            System.out.println("Hesap şifrenizi giriniz:");
            String typedPassword = scanner.next();

            if(customerPassword.contentEquals(typedPassword)) {
                passwordSuccessfull = true;
                System.out.println("Sisteme başarılı giriş yaptınız!");
            }
        }

        // sorudan_ Çıktı ne sizce
        int age=20;
        do
        {
            age++;
        }while(age<20);

        System.out.println(age);

        // sorudan
        int is=1, js=1;
        while(is<3)
        {
            do
            {
                System.out.print(js + ",");
                js++;
            }while(js<4);
            is++;
        }


        System.out.println("değişik sorualarda bugun");

        int sum = 0;
        for (int i = 0, j = 0; i &lt; 5 || j &lt; 5; ++i, j = i + 1) {
            sum += i;
        }
        System.out.println(sum);


        // sorudan
        int sum = 0;
        for (int k = 0, j = 0; k < 5 || j < 5; ++k, j = k + 1) {
            sum += k;
        }
        System.out.println(sum);



        // for dongusune boolean ile kontrol et
        // negatif sayı gelenekadar çalışsın

        int sayi;

        // for ile
        for(boolean run = true; run;){
            System.out.print("For Negatif sayi gir ve çık: ");
            sayi = scanner.nextInt();

            if(sayi<0){
                run = false;
            }
        }

        // while ile
        do{
            System.out.print("While Negatif sayi gir ve çık: ");
            sayi = scanner.nextInt();
        }while(sayi > 0);


        //Çıktı ne
        for (int i = 1; i <= 2; ++i) {
            for (int j = 1; j < 4; ++j) {
                if (i == 1) continue;
                System.out.print(i + j);
            }
        }

        for (int k = 0; k < 9; k++) {
            System.out.print("*");
            if (k == 3)
                break;
        }


        int sonuc = usAl(2,3);
        System.out.println("sonuc: " + sonuc);
        info();
        System.out.println(info());
        sayHello();
        show();
        carp();
        carp(12);
        System.out.println(carp(2,3));

        System.out.println("Basamak toplami: "+basamaklarToplami(45612));
        recursiveMethod(4);

         */




    }
}
