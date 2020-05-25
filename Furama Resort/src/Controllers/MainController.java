package Controllers;

import Commons.*;
import Models.*;
import exception.*;
import sort.SortCustomer;
import validation.Check;

import java.util.*;

public class MainController {
    ArrayList<Villa> listVilla = new ArrayList<>();
    ArrayList<House> listHouse = new ArrayList<>();
    ArrayList<Room> listRoom = new ArrayList<>();
    ArrayList<Customer> listCustomer = new ArrayList<>();
    Queue<Customer> customers = new LinkedList<>();


    public void displayMainMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.println(
                "1.Add New Services" + "\n" + "2.Show Services" + "\n" + "3.Add New Customer" + "\n" +
                        "4.Show Information of Customer" + "\n" + "5.Add New Booking" + "\n" +
                        "6.Show Information of Employee" + "\n" + "7.Add Booking 4d Cinema" + "\n" +
                        "8.Show Booking 4d Cinema" +"\n"+"9.searchFilingCabinets"+"10.exit");
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
                addBooking4dCinema();
                break;
            }
            case 8: {
                showBooking4dCinema();
                break;
            }
            case 9: {
                searchFilingCabinets();
                break;
            }

            case 10: {
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
        Collections.sort(listCustomer, new SortCustomer());
        for (Customer customer : listCustomer) {
            System.out.println("----------------------");
            System.out.println(customer.showInfor());
            System.out.println("----------------------");
        }
        displayMainMenu();
    }

    private void addNewBooking() {
        Scanner sc = new Scanner(System.in);
        listCustomer = FuncFileCSV_Customer.getFileCSVToListCustomer();
        Collections.sort(listCustomer, new SortCustomer());
        for (int i = 0; i < listCustomer.size(); i++) {
            System.out.println("----------------------");
            System.out.println((i + 1) + "." + listCustomer.get(i).showInfor());
        }
        System.out.println("Enter your choice");
        int choiceCustomer = sc.nextInt();
        while (choiceCustomer < 1 || choiceCustomer > listCustomer.size()) {
            System.out.println("bạn nhập không chính xác ,mời nhập lại");
            choiceCustomer = sc.nextInt();
        }
        Customer customer = listCustomer.get(choiceCustomer - 1);
        System.out.println("1.Booking Villa\n2.Booking House\n3.Booking Room");
        System.out.println("Enter your choice");
        int choiceBooking = sc.nextInt();
        while (choiceBooking < 1 || choiceBooking > 3) {
            System.out.println("Bạn nhập không chính xác , mời nhập lại");
            System.out.println("1.Booking Villa\n2.Booking House\n3.Booking Room");
            choiceBooking = sc.nextInt();
        }
        switch (choiceBooking) {
            case 1: {
                listVilla = FuncFileCSV_Villa.getFileCSVToListVilla();
                for (int i = 0; i < listVilla.size(); i++) {
                    System.out.println("--------------------------------------------------");
                    System.out.println("No" + (i + 1));
                    System.out.println(listVilla.get(i).showInfor());
                }
                System.out.print("Enter choice booking Villa:");
                Villa villa = listVilla.get(sc.nextInt() - 1);
                customer.setServices(villa);
                break;
            }
            case 2: {
                listHouse = FuncFileCSV_House.getFileCSVToListHouse();
                for (int i = 0; i < listHouse.size(); i++) {
                    System.out.println("--------------------------------------------------");
                    System.out.println("No" + (i + 1));
                    System.out.println(listHouse.get(i).showInfor());
                }

                System.out.print("Enter choice booking House:");
                House house = listHouse.get(sc.nextInt() - 1);
                customer.setServices(house);
                break;
            }
            case 3: {
                listRoom = FuncFileCSV_Room.getFileCSVToListRoom();
                for (int i = 0; i < listRoom.size(); i++) {
                    System.out.println("--------------------------------------------------");
                    System.out.println("No" + (i + 1));
                    System.out.println(listRoom.get(i).showInfor());
                }
                System.out.print("Enter choice booking Room: ");
                Room room = listRoom.get(sc.nextInt() - 1);
                customer.setServices(room);
                break;
            }
            default: {
                displayMainMenu();
            }

        }

        ArrayList<Customer> listBooking = FuncFileCSV_Booking.getFileCSVToListBooking();
        listBooking.add(customer);
        FuncFileCSV_Booking.writeBookingToFileCSV(listBooking);

        displayMainMenu();

    }

    private void showInfoEmployee() {

        ArrayList<Employee> employees = ReadCSV_Employee.getFileCSVToListEmployee();
        Map<Integer, Employee> employeeMap = new HashMap<>();
        for (int i = 0; i < employees.size(); i++) {
            employeeMap.put(i + 101, employees.get(i));
        }

        Set<Integer> keySet = employeeMap.keySet();
        System.out.println("List employee: ");
        for (Integer key : keySet) {
            System.out.println(key + ":" + employeeMap.get(key));
        }
        displayMainMenu();

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
        System.out.println();
        System.out.println("Not duplicate villas: ");
        TreeSet<Villa> villas = new TreeSet<>(FuncFileCSV_Villa.getFileCSVToListVilla());
        for (Villa villa : villas) {
            villa.showInfo();
        }
        showServices();
    }

    public void showAllHouseNotDuplicate() {
        System.out.println();
        System.out.println("Not duplicate houses: ");
        TreeSet<House> houses = new TreeSet<>(FuncFileCSV_House.getFileCSVToListHouse());
        for (House house : houses) {
            house.showInfo();
        }
        showServices();
    }

    public void showAllRoomNotDuplicate() {
        System.out.println();
        System.out.println("Not duplicate Room: ");
        TreeSet<Room> rooms = new TreeSet<>(FuncFileCSV_Room.getFileCSVToListRoom());
        for (Room room : rooms) {
            room.showInfo();
        }
        showServices();
    }

    public void addBooking4dCinema() {
        Scanner sc = new Scanner(System.in);
        ArrayList<Customer> listCustomer = FuncFileCSV_Customer.getFileCSVToListCustomer();
        Collections.sort(listCustomer, new SortCustomer());
        for (int i = 0; i < listCustomer.size(); i++) {
            System.out.println("----------------------");
            System.out.println((i + 1) + "." + listCustomer.get(i).showInfor());
        }
        System.out.println("Enter your choice");
        int choiceCustomer = sc.nextInt();
        while (choiceCustomer < 1 || choiceCustomer > listCustomer.size()) {
            System.out.println("bạn nhập không chính xác ,mời nhập lại");
            choiceCustomer = sc.nextInt();
        }
        Customer customer = listCustomer.get(choiceCustomer - 1);
        customers.add(customer);
        displayMainMenu();
    }

    public void showBooking4dCinema() {
        System.out.println("list customer booking 4d cinema: ");
        while (true) {
            Customer customer = customers.poll();
            if (customer == null) {
                break;
            }
            System.out.println(customer);
        }
        displayMainMenu();
    }

    public void searchFilingCabinets() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter id Employee you want search: ");
        String id =sc.nextLine() ;
        ArrayList<Employee> employeeArrayList = ReadCSV_Employee.getFileCSVToListEmployee();
        Stack<Employee> employeeStack = new Stack<>();
        boolean flag = false ;
        for (Employee employee :employeeArrayList){
            employeeStack.push(employee) ;
        }
        while (true){
            if (employeeStack.size()==0){
                break;
            }
            Employee employee =employeeStack.pop();
            if (id.equals(employee.getId())){
                System.out.println(employee);
                flag =true ;
                break;
            }
        }
        if (flag=false){
            System.out.println("không tìm thấy employee này");
        }
        displayMainMenu();
    }
}
