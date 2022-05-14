import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        // right deneme hakkı
        int operation, right = 3, select, balance = 1500, moneySelect;
        String username, password;
        boolean isTrueLogin;

        while(right > 0){
            System.out.print("Kullanıcı Adı: ");
            username = scn.nextLine();
            System.out.print("Şifre: ");
            password = scn.nextLine();

            isTrueLogin = (username.equals("tolgaacgul") && password.equals("tolga123")) ? true : false;

            if(!isTrueLogin){
                right --;
                if(right == 0){
                    System.out.println("Hesab Bloke Oldu! Bankan ile iletişime geç.");
                }else{
                    System.out.println("Yanlış kullanıcı bilgileri\nKalan Hak: " + right);
                }
            }else if (isTrueLogin){
                System.out.println("Kodluyoruz Banka Hoşgeldiniz!");
                do {
                    System.out.print("1- Para Yatır\n" +
                            "2- Para Çek\n" +
                            "3- Bakiyeyi Göster\n" +
                            "4- Çıkış\n" +
                            "Lütfen Bir İşlem Seçiniz: "  );
                    select = scn.nextInt();
                    switch (select){
                        case 1:
                            System.out.print("Yatırılacak Para: ");
                            moneySelect = scn.nextInt();
                            balance += moneySelect;
                            break;
                        case 2:
                            System.out.print("Çekilecek Para: ");
                            moneySelect = scn.nextInt();
                            if(moneySelect>balance){
                                System.out.println("Bakiye yetersiz");
                            }else {
                                balance -= moneySelect;
                            }
                            break;
                        case 3:
                            System.out.println("Mevcut Bakiyeniz: " + balance);
                            break;
                        case 4:
                            System.out.println();
                            break;
                        default:
                            System.out.println("!!! Lütfen Gçerli değer Gir !!!");

                    }
                }while(4 != select);
                System.out.println("!!! Çıkış yaptınız !!");
                System.out.println("TEKRAR GÖRÜŞMEK ÜZERE");
                break;
            }

        }

    }
}
