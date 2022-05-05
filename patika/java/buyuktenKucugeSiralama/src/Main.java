import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        // sıralı olacak olan değerleri tutuyoruz
        int  row1, row2, row3;
        // kullanıcıdan alınacak değerler
        int s1, s2, s3;

        System.out.print("Sayı 1'i gir: ");
        s1 = scn.nextInt();
        System.out.print("Sayı 2'i gir: ");
        s2 = scn.nextInt();
        System.out.print("Sayı 3'i gir: ");
        s3 = scn.nextInt();

        if(s1>s2 && s1>s3){
            row1 = s1;
            if (s2>s3){
                row2 = s2;
                row3 = s3;
            }else{
                row2 = s3;
                row3 = s2;
            }
            System.out.println("Buyukten küçüğe: " + row1  + ">" + row2 + ">" + row3);
        }else if(s2>s1 && s2>s3){
            row1 = s2;
            if (s1>s3){
                row2 = s1;
                row3 = s3;
            }else{
                row2 = s3;
                row3 = s1;
            }
            System.out.println("Buyukten küçüğe: " + row1  + ">" + row2 + ">" + row3);
        }else if(s3>s2 && s3>s1){
            row1 = s3;
            if (s2>s1){
                row2 = s2;
                row3 = s1;
            }else{
                row2 = s1;
                row3 = s2;
            }
            System.out.println("Buyukten küçüğe: " + row1  + ">" + row2 + ">" + row3);
        }
    }
}
