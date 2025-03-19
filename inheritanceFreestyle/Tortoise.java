package inheritanceFreestyle;

public class Tortoise extends Enemy {
    private int defense;

    public Tortoise(String name, String type, String size, int defense) {
        super(name, type, size);
        this.defense = defense;
    }

    public int getDefense() {
        return defense;
    }
    
    public void block() {
        System.out.println(getName() + " has blocked your attack!");
    }

    public void charge() {
        System.out.println(getName() + " is charging!");
    }
    
}