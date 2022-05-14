import java.util.Scanner;
/*
Ödev
Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan programı "For Döngüsü" kullanarak yapınız.
 */
public class Main {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        System.out.println("n^r (n:taban,r:üs)");
        System.out.print("Taban Girin(n): ");
        int n = scn.nextInt();

        System.out.print("Üs Girin(r): ");
        int r = scn.nextInt();

        int sonuc = 1;
        for(int i = 1; i <=r; i++){
            sonuc *= n;
        }

        System.out.println("n^r (n üzeri r): " + sonuc);
    }
}
