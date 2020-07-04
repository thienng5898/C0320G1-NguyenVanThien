package Models;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Services services = (Services) o;
        return Double.compare(services.areaUse, areaUse) == 0 &&
                maxNumberPeople == services.maxNumberPeople &&
                Double.compare(services.rentCosts, rentCosts) == 0 &&
                Objects.equals(serviceName, services.serviceName) &&
                Objects.equals(id, services.id) &&
                Objects.equals(typeRent, services.typeRent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serviceName, id, areaUse, maxNumberPeople, typeRent, rentCosts);
    }
}
