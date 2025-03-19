public class Bicycle extends Vehicle {
    private int gearCount;
    
    public Bicycle(String name, int wheels, int gearcount) {
        super(name, wheels);
        this.gearCount = gearCount;
}
    public void ring() {
        System.out.println("Ring ring!");
    }

    public int getGearCount() {
        return gearCount;
    }
}
