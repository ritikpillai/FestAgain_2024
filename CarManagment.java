// Base class (Parent class)
class Vehicle {
    // Encapsulation: private fields with public getter and setter methods
    private String brand;
    private int year;

    // Constructor
    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    // Getter and Setter methods (Encapsulation)
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // Polymorphism: Overridable method
    public void displayInfo() {
        System.out.println("Brand: " + brand + ", Year: " + year);
    }
}

// Derived class (Child class) using Inheritance
class Car extends Vehicle {
    private int doors;

    // Constructor with super keyword to call the parent constructor
    public Car(String brand, int year, int doors) {
        super(brand, year);
        this.doors = doors;
    }

    // Getter and Setter for doors
    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    // Overriding the method (Polymorphism)
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call the parent class method
        System.out.println("Doors: " + doors);
    }
}

// Another derived class for further abstraction
class ElectricCar extends Car {
    private int batteryCapacity;

    // Constructor
    public ElectricCar(String brand, int year, int doors, int batteryCapacity) {
        super(brand, year, doors);
        this.batteryCapacity = batteryCapacity;
    }

    // Getter and Setter for battery capacity
    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    // Overriding method for more specific info (Polymorphism)
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
    }
}

public class Main {
    public static void main(String[] args) {
        // Create objects (Instantiating classes)
        Vehicle vehicle = new Vehicle("Generic Vehicle", 2010);
        Car car = new Car("Toyota", 2020, 4);
        ElectricCar electricCar = new ElectricCar("Tesla", 2022, 4, 100);

        // Abstraction: Hiding the complex logic with a simple method call
        System.out.println("Vehicle Info:");
        vehicle.displayInfo();
        System.out.println("\nCar Info:");
        car.displayInfo();
        System.out.println("\nElectric Car Info:");
        electricCar.displayInfo();
    }
}
