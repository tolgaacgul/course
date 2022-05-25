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
        System.out.println("#*  Oyun Başladı!  *#");
        System.out.print("İsminiz: ");
        String playerName = scn.nextLine();
        Player player = new Player(playerName);
        System.out.println(player.getName().toUpperCase() + " maceraya başlıyoruz!");
        System.out.println("Bu sisli adada seni zor anlar bekliyor...");

        Heroes[] heroes = {new Samurai(), new Archer(), new Knight()};
        player.selectCharacter(heroes);



    }
}
