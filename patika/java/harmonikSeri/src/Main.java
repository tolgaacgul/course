import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        /*
            HARMONIK SERİ
            TOPLAM 1/n 
            1 + (1/2) + (1/3) + ....
         */

        System.out.print("n: ");
        double n = scn.nextDouble();
        double tempN = n;
        double result = 0;
        int counter = 1;
        
        do{
            result += 1/tempN;
            counter ++;
            tempN--;
        }while(counter <= n);

        System.out.println("Harmonik Seri Toplamı: " + result);
    }
}
