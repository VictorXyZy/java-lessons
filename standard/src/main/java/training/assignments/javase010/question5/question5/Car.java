package training.assignments.javase010.question5.question5;

public class Car {

    private String make;
    public String model;
    public int year;

    Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getMake() {
        return make;

    }

}
