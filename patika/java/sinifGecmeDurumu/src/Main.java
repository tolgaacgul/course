import java.util.Scanner;

public class Main {
    static public void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int mat, fzk, trk, kmy, mzk, toplam = 0, payda = 0;
        double ort;

        System.out.print("Matematik Notu: ");
        mat = scn.nextInt();
        if(mat >= 0 && mat <= 100){
            toplam += mat;
            payda ++;
        }

        System.out.print("Fizik Notu: ");
        fzk = scn.nextInt();
        if(fzk >= 0 && fzk <= 100){
            toplam += fzk;
            payda ++;
        }

        System.out.print("Türkçe Notu: ");
        trk = scn.nextInt();
        if(trk >= 0 && trk <= 100){
            toplam += trk;
            payda ++;
        }

        System.out.print("Kimya Notu: ");
        kmy = scn.nextInt();
        if(kmy >= 0 && kmy <= 100){
            toplam += kmy;
            payda ++;
        }

        System.out.print("Müzik Notu: ");
        mzk = scn.nextInt();
        if(mzk >= 0 && mzk <= 100){
            toplam += mzk;
            payda ++;
        }

        ort = toplam/payda;

        String didPass = (ort >= 55) ? "Geçti" : "Kaldı";
        System.out.println(didPass);
        System.out.println("ORT: " + ort);


    }
}
