public class Player {

    Inventory inventory = new Inventory();
    private int damage;
    private int health;
    private int money;
    private String characterName;
    private String name;

    // ### methots
    public Player(String name) {
        this.name = name;
    }

    public void selectChar(){
        System.out.print("Karakter Seçiniz: ");
    }

    // ## getter-setter
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
