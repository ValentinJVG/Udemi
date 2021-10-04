package polymorphism.challenge;

class Main {
    public static void main(String[] args) {
Car car = new Car(8, "base");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Subaru subaru = new Subaru(16, "Forester");
        System.out.println(subaru.startEngine());
        System.out.println(subaru.accelerate());
        System.out.println(subaru.brake());
    }
}

public class Car {
    private boolean engine;
    private int cylinders;
    private int wheels;
    private String name;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
        this.engine = true;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public String startEngine() {
        return "Start engine";
    }

    public String accelerate() {
        return "Accelerate";
    }

    public String brake() {
        return "Brake";
    }
}

class Subaru extends Car {


    public Subaru(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Subaru -> start engine";
    }

    @Override
    public String accelerate() {
        return "Subaru -> accelerate";
    }

    @Override
    public String brake() {
        return "Subaru -> brake";
    }
}

class Citroen extends Car {

    public Citroen(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Citroen -> start engine";
    }

    @Override
    public String accelerate() {
        return "Citroen -> accelerate";
    }

    @Override
    public String brake() {
        return "Citroen -> brake";
    }
}

class Peugeot extends Car {

    public Peugeot(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Peugeot -> start engine";
    }

    @Override
    public String accelerate() {
        return "Peugeot -> accelerate";
    }

    @Override
    public String brake() {
        return "Peugeot -> brake";
    }
}
