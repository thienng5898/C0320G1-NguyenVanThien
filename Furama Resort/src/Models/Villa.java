package Models;

public class Villa extends Services {
    private String roomStandard ;
    private String villaDescription ;
    private int numberOffoor ;
    private double poolArea ;

    public Villa() {
    }



    public Villa(String serviceName, String id, double areaUse, int maxNumberPeople, String typeRent, double rentCosts, String roomStandard, String villaDescription, int numberOffoor, double poolArea) {
        super(serviceName, id, areaUse, maxNumberPeople, typeRent, rentCosts);
        this.roomStandard = roomStandard;
        this.villaDescription = villaDescription;
        this.numberOffoor = numberOffoor;
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

    public int getNumberOffoor() {
        return numberOffoor;
    }

    public void setNumberOffoor(int numberOffoor) {
        this.numberOffoor = numberOffoor;
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
                ", numberOffoor=" + this.getNumberOffoor() +'\'' +
                ", poolArea=" + this.getPoolArea() +
                '}';
    }


}
