package Models;

public class House extends Services{
    private String houseStandard ;
    private String houseDescription ;
    private  int numberOfFloor ;

    public House() {
    }

    public House(String serviceName, String id, double areaUse, int maxNumberPeople, String typeRent, double rentCosts, String houseStandard, String houseDescription, int numberOfFloor) {
        super(serviceName, id, areaUse, maxNumberPeople, typeRent, rentCosts);
        this.houseStandard = houseStandard;
        this.houseDescription = houseDescription;
        this.numberOfFloor = numberOfFloor;
    }

    public String getHouseStandard() {
        return houseStandard;
    }

    public void setHouseStandard(String houseStandard) {
        this.houseStandard = houseStandard;
    }

    public String getHouseDescription() {
        return houseDescription;
    }

    public void setHouseDescription(String houseDescription) {
        this.houseDescription = houseDescription;
    }

    public int getNumberOfFloor() {
        return numberOfFloor;
    }

    public void setNumberOfFloor(int numberOfFloor) {
        this.numberOfFloor = numberOfFloor;
    }

    @Override
    public String showInfor() {
        return  "House{" +
                "serviceName='" + super.getServiceName() + '\'' +
                ", id='" + super.getId() + '\'' +
                ", areaUse=" + super.getAreaUse() +'\'' +
                ", maxNumberPeople=" + super.getMaxNumberPeople() +
                ", typeRent='" + super.getTypeRent() + '\'' +
                ", rentCosts=" + super.getRentCosts() + '\'' +
                "roomstandard='" + this.getHouseStandard() + '\'' +
                ", houseDescription='" + this.getHouseDescription() + '\'' +
                ", numberOfFloor=" + this.getNumberOfFloor() +
                '}';
    }


}
