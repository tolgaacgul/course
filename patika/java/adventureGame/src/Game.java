import Heros.Archer;
import Heros.Heroes;
import Heros.Knight;
import Heros.Samurai;
import Monsters.Bear;

import java.util.Scanner;

public class Game {
    private Scanner scn = new Scanner(System.in);
    // Location local = new Location();

    public void start(){
        System.out.println(" # Oyun Başladı!");
        System.out.print("İsminiz: ");
        //String playerName = scn.nextLine();
        Player player = new Player(/*playerName*/"Tolga Açgül");
        System.out.println(player.getName() + " maceraya başlıyoruz!");
        System.out.println("Bu sisli adada seni zor anlar bekliyor...");

        Heroes[] heroes = {new Samurai(), new Archer(), new Knight()};
        // kahraman seçimi henuz yapılmadı
        boolean dontSelectHero = true;
        // Kahramanı seçmek için
        do{
            System.out.println("------------- Karakter Seçimi -------------");
            for (Heroes hero : heroes){
                System.out.println("id: [" + hero.getId() + "]\tKarakter: " + hero.getName() + "\tSağlık: " + hero.getHealth() + "\tHasar: " + hero.getDamage() + "\tPara: " + hero.getMoney() );
            }
            System.out.println("-------------------------------------------");
            System.out.print("Kahraman Karakterini Seç: ");
            int selectHeroId = scn.nextInt();
            for (Heroes hero : heroes){
                if(hero.getId() == selectHeroId){
                    player.setCharacterName(hero.getName());
                    player.setDamage(hero.getDamage());
                    player.setHealth(hero.getHealth());
                    player.setMoney(hero.getMoney());

                    dontSelectHero = false;
                    System.out.println("Karakter Seçiminiz: " + player.getCharacterName() +
                            "\nSeçiminiz ile adadan kurtulabilecek misiniz bakalım? ");
                }
            }
        }while (dontSelectHero);


    }
}
