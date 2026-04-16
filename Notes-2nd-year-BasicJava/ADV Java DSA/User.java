
class Car {
    String color;
    int speed;

    Car() {
        color = "White";
        speed = 120;
    }

    Car(String userColor) {
        color = userColor;
        speed = 120;
    }

    Car(String userColor, int userSpeed) {
        color = userColor;
        speed = userSpeed;
    }

    void print() {
        System.out.println("Car color : " + color + " and Speed : " + speed);
    }
}

class BMW extends Car {
    String model ;

    BMW(){
        super();
        model = " X1";
        color = "Blue";
    }

    BMW(String userColor) {
        color = userColor;
    }


    BMW(String color,int speed , String model) {
        this.color = color;
        this.speed = speed;
        this.model = model;
    }

    void print() {
        System.out.println("BMW color : " + color + " and Speed : " + speed + " and Model is : " + model);
    }
}

class Audi extends Car {
    int year;

    Audi(){
        color = "Grey";
        speed = 180;
        // super();
        year = 2015;
    }

    Audi(String color){
        this.color = color;
    }

    Audi(String color , int speed, int year){
         super(color,speed) ;  
         this.year = year;
    }

    void print() {
        System.out.println("BMW color : " + color + " and Speed : " + speed + " and Year is : " + year);
    }
}

public class User {
    public static void main(String[] s) {
        // BMW a1 = new BMW();
        // a1.print();

        // Car a2 = new BMW("Black");
        // a2.print();

        // BMW a3 = new BMW("Pink", 135,"S1");
        // a3.print();

        Audi b1 = new Audi("Silver", 250,2025);
        b1.print();

    }
}
