// 🔹 Parent Class
class Car {
    String color;
    int speed;

    // Default Constructor
    Car() {
        this.color = "Black";
        this.speed = 0;
    }

    // Parameterized Constructor
    Car(String color, int speed) {
        this.color = color;
        this.speed = speed;
    }

    void display() {
        System.out.println("Color: " + color + ", Speed: " + speed);
    }
}

/////////////////////////////////////////////////////

// 🔹 Child Class 1
class BMW extends Car {
    String model;

    BMW() {
        super(); // call parent default
        this.model = "X1";
    }

    BMW(String color, int speed, String model) {
        super(color, speed); // call parent constructor
        this.model = model;
    }

    void display() {
        System.out.println("BMW -> Color: " + color + ", Speed: " + speed + ", Model: " + model);
    }
}

/////////////////////////////////////////////////////

// 🔹 Child Class 2
class Audi extends Car {
    int year;

    Audi() {
        super();
        this.year = 2020;
    }

    Audi(String color, int speed, int year) {
        super(color, speed);
        this.year = year;
    }

    void display() {
        System.out.println("Audi -> Color: " + color + ", Speed: " + speed + ", Year: " + year);
    }
}

/////////////////////////////////////////////////////

// 🔹 Child Class 3
class Tesla extends Car {
    int battery;

    Tesla() {
        super();
        this.battery = 50;
    }

    Tesla(String color, int speed, int battery) {
        super(color, speed);
        this.battery = battery;
    }

    void display() {
        System.out.println("Tesla -> Color: " + color + ", Speed: " + speed + ", Battery: " + battery + "kWh");
    }
}

/////////////////////////////////////////////////////

// 🔥 MAIN CLASS
public class CarTest {
    public static void main(String[] args) {

        // Parent objects
        Car c1 = new Car();
        Car c2 = new Car("White", 80);

        // Child objects
        BMW b1 = new BMW();
        BMW b2 = new BMW("Red", 150, "M5");

        Audi a1 = new Audi();
        Audi a2 = new Audi("Blue", 140, 2023);

        Tesla t1 = new Tesla();
        Tesla t2 = new Tesla("Silver", 200, 75);

        // 🔥 OUTPUT
        c1.display();
        c2.display();

        b1.display();
        b2.display();

        a1.display();
        a2.display();

        t1.display();
        t2.display();
    }
}
