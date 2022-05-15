import java.util.Scanner;
public class Main {
    public static void main(String[] args){
    Scanner scn = new Scanner(System.in);

    /*
    Java döngüler ile fibonacci serisi bulan program yazıyoruz. Fibonacci serisinin eleman sayısını
     kullanıcıdan alın.

    Fibonacci Serisi Nedir ?
    Fibonacci serisi, her sayının kendinden önceki ile toplanması sonucu oluşan bir sayı dizisidir.
    Bu şekilde devam eden bu dizide sayılar birbirleriyle oranlandığında altın oran ortaya çıkar,
    yani bir sayı kendisinden önceki sayıya bölündüğünde altın orana gittikçe yaklaşan bir dizi elde edilir.

    Fibonacci dizisi, 0'dan başlar ve sonsuza kadar. Her rakam, bir önceki rakamla toplanır.
    Elde edilen sonuç rakamın sağ tarafına yazılır. Fibonacci dizisinin ilk on sayısı şu şekildedir:

    9 Elemanlı Fibonacci Serisi : 0 1 1 2 3 5 8 13 21 34
     */

        System.out.print("Fibonacci Elaman Sayısı: ");
        int n = scn.nextInt();
        int total = 0, beforeNumber1 = 0, beforeNumber2 = 1;

        for(int i=0; i<=n; i++){
            if(i == 0){
                //ilk Adım
                total = beforeNumber1;
            }else if(i == 1) {
                //ikinci adım
                total = beforeNumber1 + beforeNumber2;
            }else{
                total = beforeNumber1 + beforeNumber2;
                beforeNumber1 = beforeNumber2;
                beforeNumber2 = total;
            }
            System.out.print(total + " ");
        }

        /*
        ÇIKTI:

        Fibonacci Elaman Sayısı: 9
        0 1 1 2 3 5 8 13 21 34
         */

    }
}
