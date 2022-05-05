import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int ay, gun;
        String burc = "";
        System.out.print("Doğum Ayınız: ");
        ay = scn.nextInt();
        System.out.print("Doğum Gününüz: ");
        gun = scn.nextInt();

        if ((ay>0 && ay<=12) && (gun>0 && gun<32)){
            if(ay == 1){
                if (gun < 22){
                    burc = "Oğlak";
                }else {
                    burc = "Kova";
                }
            }else if(ay == 2){
                if (gun < 20){
                    burc = "Kova";
                }else {
                    burc = "Balık";
                }
            }else if(ay == 3){
                if (gun < 21){
                    burc = "Balık";
                }else {
                    burc = "Koç";
                }
            }else if(ay == 4){
                if (gun < 21){
                    burc = "Koç";
                }else {
                    burc = "Boğa";
                }
            }else if(ay == 5){
                if (gun < 22){
                    burc = "Boğa";
                }else {
                    burc = "Ikizler";
                }
            }else if(ay == 6){
                if (gun < 23){
                    burc = "Ikizler";
                }else {
                    burc = "Yengeç";
                }
            }else if(ay == 7){
                if (gun < 23){
                    burc = "Yengeç";
                }else {
                    burc = "Aslan";
                }
            }else if(ay == 8){
                if (gun < 23){
                    burc = "Aslan";
                }else {
                    burc = "Başak";
                }
            }else if(ay == 9){
                if (gun < 23){
                    burc = "Başak";
                }else {
                    burc = "Terazi";
                }
            }else if(ay == 10){
                if (gun < 23){
                    burc = "Terazi";
                }else {
                    burc = "Akrep";
                }
            }else if(ay == 11){
                if (gun < 22){
                    burc = "Akrep";
                }else {
                    burc = "Yay";
                }
            }else if(ay == 12){
                if (gun < 22){
                    burc = "Yay";
                }else {
                    burc = "Oğlak";
                }
            }
            System.out.println("Bucunuz :" + burc);
        }else {
            System.out.println("Sen hangi gezegende doğdun yahu!");
        }

    }
}
