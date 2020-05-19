package Models;

public abstract class Services {
    private String serviceName ;
    private String id ;
    private double areaUse ;
    private int maxNumberPeople ;
    private String typeRent ;
    private double rentCosts ;

    public Services() {
    }

    public Services(String serviceName, String id, double areaUse, int maxNumberPeople, String typeRent, double rentCosts) {
        this.serviceName = serviceName;
        this.id = id;
        this.areaUse = areaUse;
        this.maxNumberPeople = maxNumberPeople;
        this.typeRent = typeRent;
        this.rentCosts = rentCosts;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getAreaUse() {
        return areaUse;
    }

    public void setAreaUse(double areaUse) {
        this.areaUse = areaUse;
    }

    public int getMaxNumberPeople() {
        return maxNumberPeople;
    }

    public void setMaxNumberPeople(int maxNumberPeople) {
        this.maxNumberPeople = maxNumberPeople;
    }

    public String getTypeRent() {
        return typeRent;
    }

    public void setTypeRent(String typeRent) {
        this.typeRent = typeRent;
    }

    public double getRentCosts() {
        return rentCosts;
    }

    public void setRentCosts(double rentCosts) {
        this.rentCosts = rentCosts;
    }

    public abstract String showInfor();


}
