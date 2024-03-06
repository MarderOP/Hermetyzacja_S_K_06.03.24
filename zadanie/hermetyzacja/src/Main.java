import java.util.Date;
public class Main {
    public static void main(String[] args) {
        Company company1 = new Company("Elon Musk", "Tesla Inc", "57000000000", new Date(1080279656000L)); // Tesla Inc founded on July 1, 2003
        Company company2 = new Company("Henry Ford", "Ford Motor Company", "230000000000", new Date(-22292680800000L)); // Ford Motor Company founded on June 16, 1903
        Company company3 = new Company("Ferruccio Lamborghini", "Lamborghini", "12000000000", new Date(-27532759200000L)); // Lamborghini founded on May 13, 1947
        company1.DisplayInfo();
        company2.DisplayInfo();
        company3.DisplayInfo();
        System.out.println("Networth per year for " + company1.getName() + ": $" + company1.showNetworthperYear());
        System.out.println("Networth per year for " + company2.getName() + ": $" + company2.showNetworthperYear());
        System.out.println("Networth per year for " + company3.getName() + ": $" + company3.showNetworthperYear());
        int years = 5;
        System.out.println("Networth of " + company1.getName() + " after " + years + " years: $" + company1.calculateNetworthAfterYears(years));
        System.out.println("Networth of " + company2.getName() + " after " + years + " years: $" + company2.calculateNetworthAfterYears(years));
        System.out.println("Networth of " + company3.getName() + " after " + years + " years: $" + company3.calculateNetworthAfterYears(years));
        Car car1 = new Car(250, "Electric", "Tesla Model S", 20000, 3, "John Doe", company1, 10);
        Car car2 = new Car(200, "Hybrid", "Ford Mustang", 40000, 2, "Jane Smith", company2, 25);
        Car car3 = new Car(350, "Gasoline", "Lamborghini Aventador", 30000, 1, "Alice Johnson", company3, 5);
        car1.displayCarInfo();
        car2.displayCarInfo();
        car3.displayCarInfo();
        System.out.println("Average kilometers per year for " + car1.getModel() + ": " + car1.calculateAverageKilometersPerYear());
        System.out.println("Average kilometers per year for " + car2.getModel() + ": " + car2.calculateAverageKilometersPerYear());
        System.out.println("Average kilometers per year for " + car3.getModel() + ": " + car3.calculateAverageKilometersPerYear());
        System.out.println("Average speed for " + car1.getModel() + ": " + car1.calculateAverageSpeed() + " km/h");
        System.out.println("Average speed for " + car2.getModel() + ": " + car2.calculateAverageSpeed() + " km/h");
        System.out.println("Average speed for " + car3.getModel() + ": " + car3.calculateAverageSpeed() + " km/h");
    }
}