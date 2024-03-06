public class Vehicle {
    public int age;
    public String name;
    public Company company;
    public double time_to_max_speed;

    public Vehicle(int age, String name, Company company, double time_to_max_speed) {
        this.age = age;
        this.name = name;
        this.company = company;
        this.time_to_max_speed = time_to_max_speed;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public double getTime_to_max_speed() {
        return time_to_max_speed;
    }

    public void setTime_to_max_speed(double time_to_max_speed) {
        this.time_to_max_speed = time_to_max_speed;
    }

}
