import java.util.Scanner;
/*
Ödev
N elemanlı bir kümenin elemanları ile oluşturulacak r elemanlı farklı grupların sayısı
n’in r’li kombinasyonu olarak adlandırılır. N’in r’li kombinasyonu C(n,r) şeklinde gösterilir.

Java ile kombinasyon hesaplayan program yazınız.

Kombinasyon formülü
C(n,r) = n! / (r! * (n-r)!)
 */
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int n=0, r=0, n_r=0;
        int nFak=1,rFak=1,n_rFak=1;
        double Cnr = 0;

        System.out.print("(n): ");
        n = scan.nextInt();
        System.out.print("(r): ");
        r = scan.nextInt();
        n_r = n - r;

        for(int i = 1; i<=n; i++){
            nFak *= i;
        }
        for(int i = 1; i<=r; i++){
            rFak *= i;
        }
        for(int i = 1; i<=n_r; i++){
            n_rFak *= i;
        }
        System.out.println("n! : " + nFak);
        System.out.println("r! : " + rFak);
        System.out.println("(n-r)! : " + n_rFak);

        // C(n,r) = n! / (r! * (n-r)!)
        Cnr = (nFak / (rFak * n_rFak));
        System.out.println("C(n,r): " + Cnr);
    }
}
