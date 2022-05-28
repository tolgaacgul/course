import Heros.Archer;
import Heros.Heroes;
import Heros.Knight;
import Heros.Samurai;
import java.util.Scanner;

public class Player {

    Inventory inventory = new Inventory();
    private int damage;
    private int health;
    private int money;
    private String characterName;
    private String name;
    private Scanner scn = new Scanner(System.in);

    // ### methots
    public Player(String name) {
        this.name = name;
    }

    // Karakter seçimi
    public void selectCharacter(Heroes[] heroes){
        // kahraman seçimi henuz yapılmadı
        boolean dontSelectHero = true;
        // Kahramanı seçmek için
        do{
            System.out.println("----------------------- Karakter Seçimi -----------------------");
            for (Heroes hero : heroes){
                System.out.println("id: [" + hero.getId() + "]\tKarakter: " + hero.getName() + "\tSağlık: " + hero.getHealth() + "\tHasar: " + hero.getDamage() + "\tPara: " + hero.getMoney() );
            }
            System.out.println("---------------------------------------------------------------");
            System.out.print("Kahraman Karakterini Seç: ");
            int selectHeroId = scn.nextInt();
            for (Heroes hero : heroes){
                if(hero.getId() == selectHeroId){
                    this.setCharacterName(hero.getName());
                    this.setDamage(hero.getDamage());
                    this.setHealth(hero.getHealth());
                    this.setMoney(hero.getMoney());

                    dontSelectHero = false;
                    System.out.println("Karakter Seçiminiz: " + this.getCharacterName() +
                            "\n" + this.getCharacterName() + " ile adadan kurtulabilecek misin " + this.getName() + ", bakalım? ");
                }
            }
        }while (dontSelectHero);
    }








    // ###------------------ getter-setter ------------------###
    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
