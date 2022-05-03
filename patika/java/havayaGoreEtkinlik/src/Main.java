import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        // Sıcaklık bilgisi
        int heat;
        System.out.print("Hava Kaç Derece: ");
        heat = scn.nextInt();

        if(heat<50 && heat>-20){
           if (heat<5){
               System.out.println("Kayak Yapmak İçin Güzel Bir Hava");
           }else if(heat>5 && heat<25){
               if (heat<15){
                   System.out.println("Sinemaya gitmek için güzel bir gün");
               }
               if (heat>10 && heat<15){
                   System.out.println("Ayrıca");
               }
                if(heat>10){
                    System.out.println("Piknik için güzel bir hava");
                }
           }else if(heat>25){
               System.out.println("Yüzmek İçin Güzel Bir Hava");
           }
        }else{
            System.out.println("HAVA SICAKLIĞI ANORMAL! CANINI KURTAR");
        }
    }
}
