import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("N1: ");
        int n1 = scn.nextInt();
        System.out.print("N2: ");
        int n2 = scn.nextInt();

        // En küüçük sayıyı belirle
        int enKucukSayi,ebob=1,ekok=1;
        if(n1<n2){
            enKucukSayi = n1;
        }else if (n2<n1){
            enKucukSayi = n2;
        }else {
            //değilse eşitlerdir zaten.
            enKucukSayi = n1;
        }


        // EBOB -> En büyük ortak bölen
        while(enKucukSayi>1){
            if(n1%enKucukSayi == 0 && n2%enKucukSayi == 0){
                ebob = enKucukSayi;
                break;
            }
            enKucukSayi --;
        }
        System.out.println("EBOB: " + ebob);


        // EKOK -> En küçük ortak kat
        int n1xn2 = n1*n2;
        int i=1;
        while(i <= n1xn2){
            if (i%n1==0 && i%n2==0){
                ekok = i;
                break;
            }
            i++;
        }
        System.out.println("EKOK: " + ekok);

        int whatEKOK = (n1*n2)/ebob;
        if(whatEKOK == ekok){
            System.out.println("EKOK sağlaması DOĞRU");
        }else{
            System.out.println("EKOK sağlamasında HATA var!");
        }
    }
}
