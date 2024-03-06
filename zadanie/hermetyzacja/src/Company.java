import java.util.Date;

public class Company {
    private String owner;
    private String name;
    private String networth;
    private Date timeofstartingcompany;

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNetworth() {
        return networth;
    }

    public void setNetworth(String networth) {
        this.networth = networth;
    }

    public Date getTimeofstartingcompany() {
        return timeofstartingcompany;
    }

    public void setTimeofstartingcompany(Date timeofstartingcompany) {
        this.timeofstartingcompany = timeofstartingcompany;
    }

    public Company(String owner, String name, String networth, Date timeofstartingcompany) {
        this.owner = owner;
        this.name = name;
        this.networth = networth;
        this.timeofstartingcompany = timeofstartingcompany;
    }

    public void DisplayInfo(){
        System.out.println("Owner: " + getOwner() + "\nName of company: " + getName() + "\nNetworth: " + getNetworth() + "\nDate of starting company: " + getTimeofstartingcompany());
    }

    public double showNetworthperYear(){
        Date currentDate = new Date();
        long currentTime = currentDate.getTime();
        double totalTime = currentTime - getTimeofstartingcompany().getTime();
        double totalYears = totalTime / (1000.0 * 60 * 60 * 24 * 365);
        return Double.parseDouble(networth) / totalYears;
    }

    public double calculateNetworthAfterYears(int years){
        long futureTime = timeofstartingcompany.getTime() + years * (1000L * 60 * 60 * 24 * 365);
        double networthGrowthRate = Double.parseDouble(networth) / (System.currentTimeMillis() - timeofstartingcompany.getTime());
        return networthGrowthRate * (futureTime - timeofstartingcompany.getTime());
    }
}
