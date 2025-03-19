package inheritanceFreestyle;

public class Bird extends Enemy {
    private int wings;
    
    public Bird(String name, String type, String size, int wings) {
        super(name, type, size);
        this.wings = wings;
    }

    public int getWings() {
        return wings;
    }

    public void fly() {
        System.out.println(getName() + " is flying!");
    }

    public void land() {
        System.out.println(getName() + " is landing!");
    }
    
}

