import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        String userName, password, _uname = "tolga", _pass = "tolga123";

        System.out.print("Kullanıcı Adı: ");
        userName = scn.nextLine();

        System.out.print("Şifre: ");
        password = scn.nextLine();

        if(userName.equals(_uname) && password.equals(_pass)){
            System.out.println("Cennete Giriş Başarılı...");
        }else{
            System.out.print("Yanlış Şifre\nŞifreni sıfırlamak ister misin? (e/h)");
            String eh = scn.nextLine();
            if(eh.equals("e")){
                //evet
                System.out.print("Yeni Şifre Belirle: ");
                password = scn.nextLine();
                if(password.equals(_pass)){
                    System.out.println("İlk Şifren ile Aynı\nŞifre oluşturulamadı, lütfen başka şifre giriniz.");
                }else {
                    _pass = password;
                    password = "";
                    System.out.println("şifren \""+ _pass + "\" olarak kaydedildi");
                }


            }else if(eh.equals("h")){
                //hayır
                System.out.println("Sistemden düzgün bir şekilde çıktınız. unutmadığınız bi gun görüşmek üzre...xD");
            }else{
                System.out.println("Geçerli bir değer girmedin. Kendimi sonlandırıyorum.");
            }
        }


    }
}
