package Controllers;

import Commons.FuncFileCSV_Customer;
import Commons.FuncFileCSV_House;
import Commons.FuncFileCSV_Room;
import Commons.FuncFileCSV_Villa;
import Models.Customer;
import Models.House;
import Models.Villa;
import Models.Room;
import exception.*;
import sort.SortCustomer;
import validation.Check;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MainController {
    ArrayList<Villa> listVilla = new ArrayList<>();
    ArrayList<House> listHouse = new ArrayList<>();
    ArrayList<Room> listRoom = new ArrayList<>();
    ArrayList<Customer> listCustomer =new ArrayList<>();

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
        listCustomer = FuncFileCSV_Customer.getFileCSVToListCustomer();
        Scanner sc = new Scanner(System.in);
        Customer customer = new Customer();
        while (true) {
            try {
                System.out.print("Enter Name Customer: ");
                String nameCustomer = NameException.nameException(sc.nextLine());
                customer.setName(nameCustomer);
                break;
            } catch (Exception m) {
                System.out.println(m);
            }
        }
        while (true) {
            try {
                System.out.print("Enter Birthday Customer (dd/mm/yyyy): ");
                String birthdayCustomer = BirthdayException.birthdayException(sc.nextLine());
                customer.setBirthday(birthdayCustomer);
                break;
            } catch (Exception m) {
                System.out.println(m);
            }
        }
        while (true) {
            try {
                System.out.print("Enter Gender Customer: ");
                String genderCustomer = GenderException.genderException(sc.nextLine());
                customer.setGender(genderCustomer);
                break;
            } catch (Exception m) {
                System.out.println(m);
            }
        }
        while (true) {
            try {
                System.out.print("Enter IDcard Customer: ");
                String idCardCustomer = IDException.idException(sc.nextLine());
                customer.setIdCard(idCardCustomer);
                break;
            } catch (Exception m) {
                System.out.println(m);
            }
        }
        System.out.print("Enter PhoneNumber Customer: ");
        customer.setPhoneNum(sc.nextLine());
        while (true) {
            try {
                System.out.print("Enter email Customer: ");
                String emailCustomer = EmailException.emaiException(sc.nextLine());
                customer.setEmail(emailCustomer);
                break;
            } catch (Exception m) {
                System.out.println(m);
            }
        }
        System.out.print("Enter Type Customer: ");
        customer.setTypeCustomer(sc.nextLine());
        System.out.print("Enter Address Customer: ");
        customer.setAddress(sc.nextLine());
        listCustomer.add(customer);
        FuncFileCSV_Customer.writeCustomerToFileCSV(listCustomer);
        System.out.println("Add new Customer complete ");
        displayMainMenu();

    }



    private void showInfoCustomer() {
        listCustomer = FuncFileCSV_Customer.getFileCSVToListCustomer();
        Collections.sort(listCustomer ,new SortCustomer());
        for (Customer customer : listCustomer) {
            System.out.println("----------------------");
            System.out.println(customer.showInfor());
            System.out.println("----------------------");
        }
        displayMainMenu();
    }

    private void addNewBooking() {

    }

    private void showInfoEmployee() {

    }

    public void addListVillaService() {
        listVilla = FuncFileCSV_Villa.getFileCSVToListVilla();
        Scanner sc = new Scanner(System.in);
        Villa villa = new Villa();

        villa.setServiceName(Check.checkValidationName());

        villa.setId(Check.checkIDVilla());

        System.out.print("Enter areaUse: ");
        villa.setAreaUse(Check.checkValidationAreaUseOrAreaPool());

        villa.setMaxNumberPeople(Check.checkValidationMaxNumberPeople());

        System.out.print("Enter typeRent: ");

        villa.setTypeRent(Check.checkValidationTypeRentOrServiceStandard());

        villa.setRentCosts(Check.checkValidationRentCosts());

        System.out.print("Enter Villa standard: ");
        villa.setVillaStandard(Check.checkValidationTypeRentOrServiceStandard());

        System.out.print("Enter Villa Description: ");
        villa.setVillaDescription(sc.nextLine());

        villa.setnumberOfFloor(Check.checkValidationNumberOfFloors());

        System.out.print("Enter pool Area: ");
        villa.setPoolArea(Check.checkValidationAreaUseOrAreaPool());

        listVilla.add(villa);
        FuncFileCSV_Villa.writeVillaToFileCSV(listVilla);
        System.out.println("Add new Villa complete ");
        addNewServices();

    }

    public void addListHouseService() {
        listHouse = FuncFileCSV_House.getFileCSVToListHouse();
        Scanner sc = new Scanner(System.in);
        House house = new House();

        house.setServiceName(Check.checkValidationName());

        house.setId(Check.checkIDHouse());

        System.out.print("Enter areaUse: ");
        house.setAreaUse(Check.checkValidationAreaUseOrAreaPool());

        house.setMaxNumberPeople(Check.checkValidationMaxNumberPeople());

        System.out.print("Enter typeRent: ");

        house.setTypeRent(Check.checkValidationTypeRentOrServiceStandard());

        house.setRentCosts(Check.checkValidationRentCosts());

        System.out.print("Enter House standard: ");
        house.setHouseStandard(Check.checkValidationTypeRentOrServiceStandard());

        System.out.print("Enter House Description: ");
        house.setHouseDescription(sc.nextLine());

        house.setNumberOfFloor(Check.checkValidationNumberOfFloors());
        listHouse.add(house);
        FuncFileCSV_House.writeHouseToFileCSV(listHouse);

        System.out.println("Add new House complete ");
        addNewServices();

    }

    public void addListRoomService() {
        listRoom = FuncFileCSV_Room.getFileCSVToListRoom();
        Scanner sc = new Scanner(System.in);
        Room room = new Room();

        room.setServiceName(Check.checkValidationName());

        room.setId(Check.checkIDRoom());

        System.out.print("Enter areaUse: ");
        room.setAreaUse(Check.checkValidationAreaUseOrAreaPool());

        room.setMaxNumberPeople(Check.checkValidationMaxNumberPeople());

        System.out.print("Enter typeRent: ");
        room.setTypeRent(Check.checkValidationTypeRentOrServiceStandard());

        room.setRentCosts(Check.checkValidationRentCosts());
        System.out.println("Enter Room FreeService ");
        room.setFreeService(Check.checkFreeService());
        listRoom.add(room);
        FuncFileCSV_Room.writeRoomToFileCSV(listRoom);
        System.out.println("Add new Room complete ");
        addNewServices();

    }

    public void showAllVilla() {
        listVilla = FuncFileCSV_Villa.getFileCSVToListVilla();
        for (Villa villa : listVilla) {
            System.out.println("----------------------");
            System.out.println(villa.showInfor());
            System.out.println("----------------------");
        }
        displayMainMenu();
    }

    public void showAllHouse() {
        listHouse = FuncFileCSV_House.getFileCSVToListHouse();
        for (House house : listHouse) {
            System.out.println("----------------------");
            System.out.println(house.showInfor());
            System.out.println("----------------------");
        }
        displayMainMenu();
    }

    public void showAllRoom() {
        listRoom = FuncFileCSV_Room.getFileCSVToListRoom();
        for (Room room : listRoom) {
            System.out.println("----------------------");
            System.out.println(room.showInfor());
            System.out.println("----------------------");
        }
        displayMainMenu();
    }

    public void showAllVillaNotDuplicate() {
    }

    public void showAllHouseNotDuplicate() {
    }

    public void showAllRoomNotDuplicate() {
    }
}
