public class VehicleRunner {
    public static void main(String[] args) {
        // testing all available methods on a Vehicle object
        Vehicle myVehicle = new Vehicle("Generic Vehicle", 6);
        System.out.println(myVehicle.getName());
        System.out.println(myVehicle.getWheels());
        myVehicle.move(10);
        myVehicle.turn();
        myVehicle.brake();

        // testing all available methods on a Car object
        Car myCar = new Car("Honda Civic", 4, "leather");
        System.out.println(myCar.getName()); // inherited method
        System.out.println(myCar.getWheels()); // inherited method
        System.out.println(myCar.getFabric()); // method ONLY available on Car objects
        myCar.move(30); // inherited method
        myCar.turn(); // inherited method
        myCar.brake(); // inherited method
        myCar.honk(); // method ONLY available on Car objects
        myCar.lockDoors(); // method ONLY available on Car objects

        // ---- WRITE YOUR BICYCLE TEST CODE BELOW ----
        Bicycle myBike = new Bicycle("Bike", 2, 7);
        System.out.println(myBike.getGearCount());
        System.out.println(myBike.getName());
        System.out.println(myBike.getWheels());
        myBike.ring();
        myBike.move(10);
        myBike.turn();
        myBike.brake();

        Airplane plane = new Airplane("Boeing 747", 16, 500);
        System.out.println(plane.getName());
        System.out.println(plane.getWheels());
        System.out.println(plane.getPassengerCount());
        plane.move(5000);
        plane.liftOff();
        plane.land();
        plane.turn();
        plane.brake();

    }
}