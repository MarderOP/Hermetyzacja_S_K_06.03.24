public class Car extends Vehicle {
    private double max_speed;
    private String engine;
    private String model;
    private double distance;

    public double getMax_speed() {
        return max_speed;
    }

    public void setMax_speed(double max_speed) {
        this.max_speed = max_speed;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public Car(double max_speed, String engine, String model, double distance, int age, String name, Company company, double time_to_max_speed) {
        super(age, name, company, time_to_max_speed);
        this.max_speed = max_speed;
        this.engine = engine;
        this.model = model;
        this.distance = distance;
    }

    public void displayCarInfo() {
        System.out.println("Car Information:");
        System.out.println("Model: " + getModel());
        System.out.println("Engine: " + getEngine());
        System.out.println("Size: " + getDistance());
        System.out.println("Max Speed: " + getMax_speed());
    }

    public double calculateAverageKilometersPerYear() {
        return getDistance() / getAge();
    }

    public double calculateAverageSpeed() {
        return getDistance() / (getTime_to_max_speed() / 3600);
    }
}
