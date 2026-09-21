// This is the class definition. It acts as a blueprint.
class Car {
    // These are instance variables. They define the state of the object.
    String color;
    String model;

    // This is a method. It defines the behavior of the object.
    void displayInfo() {
        System.out.println("Car model: " + model + ", Color: " + color);
    }
}

public class DifferenceObjectsClasses {
    public static void main(String[] args) {
        // Here we create objects. These are concrete instances of the Car class.
        // They occupy memory and have their own unique state.
        Car carOne = new Car();
        Car carTwo = new Car();

        // Assigning values to the first object.
        carOne.color = "Red";
        carOne.model = "Sedan";

        // Assigning values to the second object.
        carTwo.color = "Blue";
        carTwo.model = "SUV";

        // Calling the method on the objects to show their distinct states.
        // This demonstrates that the objects are separate entities.
        carOne.displayInfo();
        carTwo.displayInfo();
    }
}
