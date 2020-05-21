package Controllers;

import Commons.FuncFileCSV_House;
import Commons.FuncFileCSV_Room;
import Commons.FuncFileCSV_Villa;
import Models.House;
import Models.Villa;
import Models.Room;

import java.util.ArrayList;
import java.util.Scanner;

public class MainController {
    ArrayList<Villa> listVilla = new ArrayList<Villa>();
    ArrayList<House> listHouse = new ArrayList<House>();
    ArrayList<Room> listRoom = new ArrayList<Room>();

    public void displayMainMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.println(
                "1.Add New Services" + "\n" + "2.Show Services" + "\n" + "3.Add New Customer" + "\n" +
                        "4.Show Information of Customer" + "\n" + "5.Add New Booking" + "\n" +
                        "6.Show Information of Employee" + "\n" + "7.Exit");
        System.out.println("in put your choice : ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1: {
                addNewServices();
                break;
            }
            case 2: {
                showServices();
                break;
            }
            case 3: {
                addNewCustomer();
                break;
            }
            case 4: {
                showInfoCustomer();
                break;
            }
            case 5: {
                addNewBooking();
                break;
            }
            case 6: {
                showInfoEmployee();
                break;
            }
            case 7: {
                System.exit(0);
            }
            default: {
                System.out.println("Fail! Please choice again !");

                displayMainMenu();
            }
        }

    }

    private void addNewServices() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Add New Villa\n" +
                "2. Add New House\n" +
                "3. Add New Room\n" +
                "4. Back to menu\n" +
                "5. Exit");
        System.out.print("Input your choice: ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1: {
                addListVillaService();
                break;
            }
            case 2: {
                addListHouseService();
                break;
            }
            case 3: {
                addListRoomService();
                break;
            }

            case 4: {
                displayMainMenu();
                break;
            }
            case 5: {
                System.exit(0);
            }
            default: {
                System.out.println("Fail! Please choice again !");
                addNewServices();
            }
        }
    }

    private void showServices() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Show all Villa\n" +
                "2. Show all  House\n" +
                "3. Show all Room\n" +
                "4. Show all Villa not Duplicate\n" +
                "5. Show all House not Duplicate\n" +
                "6. Show all Room not Duplicate\n" +
                "7. Back to menu\n" +
                "8. Exit");
        System.out.print("Input your choice: ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1: {
                showAllVilla();
                break;
            }
            case 2: {
                showAllHouse();
                break;
            }
            case 3: {
                showAllRoom();
                break;
            }
            case 4: {
                showAllVillaNotDuplicate();
                break;
            }
            case 5: {
                showAllHouseNotDuplicate();
                break;
            }
            case 6: {
                showAllRoomNotDuplicate();
                break;
            }
            case 7: {
                displayMainMenu();
                break;
            }
            case 8: {
                System.exit(0);
            }
        }
    }

    private void addNewCustomer() {
        
    }

    private void showInfoCustomer() {

    }

    private void addNewBooking() {

    }

    private void showInfoEmployee() {

    }

    public void addListVillaService() {
        listVilla = FuncFileCSV_Villa.getFileCSVToListVilla();
        Scanner sc = new Scanner(System.in);
        Villa villa = new Villa();

        System.out.println("Enter service name");
        villa.setServiceName(sc.nextLine());
        System.out.println("Enter id");
        villa.setId(sc.nextLine());
        System.out.println("Enter areaUse");
        villa.setAreaUse(Integer.parseInt(sc.nextLine()));
        System.out.println("Enter max number of people");
        villa.setMaxNumberPeople(Integer.parseInt(sc.nextLine()));
        System.out.println("Enter typeRent");
        villa.setTypeRent(sc.nextLine());
        System.out.println("Enter Rent cost");
        villa.setRentCosts(Integer.parseInt(sc.nextLine()));
        System.out.println("Enter Room standard");
        villa.setRoomStandard(sc.nextLine());
        System.out.println("Enter Villa Description");
        villa.setVillaDescription(sc.nextLine());
        System.out.println("Enter Number Floor");
        villa.setnumberOfFloor(Integer.parseInt(sc.nextLine()));
        System.out.println("Enter pool Area");
        villa.setPoolArea(Integer.parseInt(sc.nextLine()));
        listVilla.add(villa);
        FuncFileCSV_Villa.writeVillaToFileCSV(listVilla);
        System.out.println("Add new Villa complete ");
        addNewServices();

    }

    public void addListHouseService() {
        listHouse = FuncFileCSV_House.getFileCSVToListHouse();
        Scanner sc = new Scanner(System.in);
        House house = new House();

        System.out.println("Enter service name");
        house.setServiceName(sc.nextLine());
        System.out.println("Enter id");
        house.setId(sc.nextLine());
        System.out.println("Enter areaUse");
        house.setAreaUse(Integer.parseInt(sc.nextLine()));
        System.out.println("Enter max number of people");
        house.setMaxNumberPeople(Integer.parseInt(sc.nextLine()));
        System.out.println("Enter typeRent");
        house.setTypeRent(sc.nextLine());
        System.out.println("Enter Rent cost");
        house.setRentCosts(Integer.parseInt(sc.nextLine()));
        System.out.println("Enter Room standard");
        house.setHouseStandard(sc.nextLine());
        System.out.println("Enter Villa Description");
        house.setHouseDescription(sc.nextLine());
        System.out.println("Enter Number Floor");
        house.setNumberOfFloor(Integer.parseInt(sc.nextLine()));
        listHouse.add(house);
        FuncFileCSV_House.writeHouseToFileCSV(listHouse);
        System.out.println("Add new House complete ");
        addNewServices();

    }

    public void addListRoomService() {
        listRoom = FuncFileCSV_Room.getFileCSVToListRoom();
        Scanner sc = new Scanner(System.in);
        Room room = new Room();

        System.out.println("Enter service name");
        room.setServiceName(sc.nextLine());
        System.out.println("Enter id");
        room.setId(sc.nextLine());
        System.out.println("Enter areaUse");
        room.setAreaUse(Integer.parseInt(sc.nextLine()));
        System.out.println("Enter max number of people");
        room.setMaxNumberPeople(Integer.parseInt(sc.nextLine()));
        System.out.println("Enter typeRent");
        room.setTypeRent(sc.nextLine());
        System.out.println("Enter Rent cost");
        room.setRentCosts(Integer.parseInt(sc.nextLine()));
        System.out.println("Enter Room FreeService ");
        room.setFreeService(sc.nextLine());
        listRoom.add(room);
        FuncFileCSV_Room.writeRoomToFileCSV(listRoom);
        System.out.println("Add new Room complete ");
        addNewServices();

    }

    public void showAllVilla() {
        listVilla =FuncFileCSV_Villa.getFileCSVToListVilla() ;
        for (Villa villa:listVilla) {
            System.out.println("----------------------");
            System.out.println(villa.showInfor());
            System.out.println("----------------------");
        }
    }

    public void showAllHouse() {
        listHouse=FuncFileCSV_House.getFileCSVToListHouse();
        for (House house:listHouse){
            System.out.println("----------------------");
            System.out.println(house.showInfor());
            System.out.println("----------------------");
        }
    }

    public void showAllRoom() {
        listRoom=FuncFileCSV_Room.getFileCSVToListRoom();
        for (Room room:listRoom){
            System.out.println("----------------------");
            System.out.println(room.showInfor());
            System.out.println("----------------------");
        }
    }

    public void showAllVillaNotDuplicate() {
    }

    public void showAllHouseNotDuplicate() {
    }

    public void showAllRoomNotDuplicate() {
    }
}
