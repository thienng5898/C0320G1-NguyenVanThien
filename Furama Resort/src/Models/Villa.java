package Models;

public class Villa extends Services {
    private String roomStandard ;
    private String villaDescription ;
    private int numberOfFloor ;
    private double poolArea ;

    public Villa() {
    }



    public Villa(String serviceName, String id, double areaUse, int maxNumberPeople, String typeRent, double rentCosts, String roomStandard, String villaDescription, int numberOfFloor, double poolArea) {
        super(serviceName, id, areaUse, maxNumberPeople, typeRent, rentCosts);
        this.roomStandard = roomStandard;
        this.villaDescription = villaDescription;
        this.numberOfFloor = numberOfFloor;
        this.poolArea = poolArea;

    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public String getVillaDescription() {
        return villaDescription;
    }

    public void setVillaDescription(String villaDescription) {
        this.villaDescription = villaDescription;
    }

    public int getnumberOfFloor() {
        return numberOfFloor;
    }

    public void setnumberOfFloor(int numberOfFloor) {
        this.numberOfFloor = numberOfFloor;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }
    @Override
    public String showInfor() {
         return "Villa{" +
                 "serviceName='" + super.getServiceName() + '\'' +
                 ", id='" + super.getId() + '\'' +
                 ", areaUse=" + super.getAreaUse() +'\'' +
                 ", maxNumberPeople=" + super.getMaxNumberPeople() +
                 ", typeRent='" + super.getTypeRent() + '\'' +
                 ", rentCosts=" + super.getRentCosts() + '\'' +
                "roomStandard='" + this.getRoomStandard() + '\'' +
                ", villaDescription='" + this.getVillaDescription() + '\'' +
                ", numberOfFloor=" + this.getnumberOfFloor() +'\'' +
                ", poolArea=" + this.getPoolArea() +
                '}';
    }


}
