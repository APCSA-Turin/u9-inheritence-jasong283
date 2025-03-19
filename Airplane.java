public class Airplane extends Vehicle {
    private int passengerCount;

    public Airplane(String name, int wheels, int passengerCount) {
        super(name, wheels);
        this.passengerCount = passengerCount;
    }

    public int getPassengerCount() {
        return passengerCount;
    }
    
    public void liftOff() {
        System.out.println("We have lifted off.");
    }

    public void land() {
        System.out.println("We have landed.");
    }
}

