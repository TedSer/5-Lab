package lviv.iot.ua;

public class Camera extends HistoricalMovie {

    private String linses;
    private String battery;
    public Camera(final String name, final String month,
                  final int cost, final int weight, final BrandType brandType,String linses,
                           String battery) {
        super( name,  month,  cost,  weight, brandType);
        this.battery = battery;
        this.linses = linses;
    }

    public String getBattery() {
        return battery;
    }

    public void setBattery(final String battery) {
        this.battery = battery;
    }

    public String getLinses() {
        return linses;
    }

    public void setLinses(final String linses) {
        this.linses = linses;
    }

    public int getCost() {
        return super.getCost();
    }

    public void setCost(final int cost) {
        super.setCost(cost);
    }
    @Override
    public String toString() {
        return "Staff = " + " Camera" + ", Brand = " + getBrandType()
                + ", Linses = " + getLinses() + ", Battery = " + getBattery()
                + ", Cost = " + getCost() + ", Weight = " + getWeight();
    }
}
