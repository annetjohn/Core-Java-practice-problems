package practiceproblems;


//Vehicle is the parent class of all the vehicles in this code
//It has one instance variable that is speed


class Vehicle {

    double speed;
    
//    I have made use of the getClass.getName() method so that the output can be specific
//    It means that for car o/p would be "Car is starting" and for truck it would be "Truck is starting".
  
    void start() {
        System.out.println(getClass().getName() + " is starting...");
    }

    void stop() {
        System.out.println(getClass().getName() + " is stopping...");
    }

    void turn() {
        System.out.println(getClass().getName() + " is turning...");
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void increaseSpeed(double s) {
        setSpeed(this.speed + s);
    }

    public void decreaseSpeed(double s) {
        setSpeed(this.speed - s);
    }

    // This is the constructor that would initialize the speed
    public Vehicle(double speed) {
        this.speed = speed;
    }

}

class Car extends Vehicle {

    void openTrunk() {
        System.out.println("Trunk is opening...");
    }

    /*
    *The use of super keyword is done in the below method. It would access the getSpeed() method of the 
    *vehicle class.
     */
    void closeTrunk() {
        System.out.println("Trunk is closing...");

        System.out.println("The speed of the Car is (using super keyword): "
                + super.getSpeed()); //calling super class method
    }

    // This is the constructor that would call the superclass constructor
    public Car(double speed) {
        super(speed);
    }

}

class Truck extends Vehicle {

    void openTailgate() {
        System.out.println("Tailgate is opening");
    }

    /*
    *The use of super keyword is done in the below method. It would access the getSpeed() method of the 
    *vehicle class.
     */
    void closeTailgate() {
        System.out.println("Tailgate is closing");
        System.out.println("The speed of the truck is (using super keyword): "
                + super.getSpeed()); //calling super class method
    }

    // This is the constructor that would call the superclass constructor
    public Truck(double speed) {
        super(speed);
    }

}

// This is the driver class that has the main method
public class Driver {

    public static void main(String[] args) {
        Car car = new Car(80);
        Truck truck = new Truck(60);

        car.start();
        car.stop();
        car.turn();
        car.getSpeed();
        car.setSpeed(80);
        car.increaseSpeed(10);
        car.decreaseSpeed(10);
        car.openTrunk();
        car.closeTrunk();
        System.out.println("\n");
        truck.start();
        truck.stop();
        truck.turn();
        truck.getSpeed();
        truck.setSpeed(40);
        truck.increaseSpeed(10);
        truck.decreaseSpeed(10);
        truck.openTailgate();
        truck.closeTailgate();
        System.out.println("\n");
    }
}