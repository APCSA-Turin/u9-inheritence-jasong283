package inheritanceFreestyle;

public class Enemy {
    private String name;
    private String type;
    private String size;

    Enemy(String name, String type, String size) {  
            this.name = name;
            this.type = type;
            this.size = size;
        }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }
    
    public String getSize() {
        return size;
    }

    public void move(int distance) {
        System.out.println("The " + name + " has moved " + distance + " blocks.");
    }

    public void attack() {
        System.out.println("The " + name + " has attacked!");
    }
    
    }
