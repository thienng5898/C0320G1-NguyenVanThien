package Models;

public class Room extends Services implements Comparable{
    private String freeService ;

    public Room() {
    }

    public Room(String serviceName, String id, double areaUse, int maxNumberPeople, String typeRent, double rentCosts, String freeService) {
        super(serviceName, id, areaUse, maxNumberPeople, typeRent, rentCosts);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String showInfor() {
        return  "Room{" +
                "serviceName='" + super.getServiceName() + '\'' +
                ", id='" + super.getId() + '\'' +
                ", areaUse=" + super.getAreaUse() +'\'' +
                ", maxNumberPeople=" + super.getMaxNumberPeople() +
                ", typeRent='" + super.getTypeRent() + '\'' +
                ", rentCosts=" + super.getRentCosts() + '\'' +
                "freeService='" + this.getFreeService() +
                '}';
    }
    public void showInfo(){
        System.out.println( "Room{" +
                "serviceName='" + super.getServiceName() + '\'' +
                ", id='" + super.getId() + '\'' +
                ", areaUse=" + super.getAreaUse() +'\'' +
                ", maxNumberPeople=" + super.getMaxNumberPeople() +
                ", typeRent='" + super.getTypeRent() + '\'' +
                ", rentCosts=" + super.getRentCosts() + '\'' +
                "freeService='" + this.getFreeService() +
                '}');
    }


    @Override
    public int compareTo(Object o) {
        Room room =(Room) o;
        return  room.getServiceName().compareTo(this.getServiceName()) ;
    }
}
