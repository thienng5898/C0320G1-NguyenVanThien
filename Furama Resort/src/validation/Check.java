package validation;

import java.util.Scanner;

public class Check {

    private static String regex = "";
    private static Scanner sc;

    public static String checkValidationName() {
        regex = "^((\\p{Lu})(\\p{Ll}*))( (\\p{Lu})(\\p{Ll}*))*$";
        while (true) {
            sc = new Scanner(System.in);
            System.out.print("Enter name (Format: Abc Abc): ");
            String name = sc.nextLine();
            if (name.matches(regex)) {
                return name;
            } else {
                System.out.println("Tên không đúng định dạng");
            }
        }
    }

    public static String checkValidationTypeRentOrServiceStandard() {

        regex = "^((\\p{Lu})(\\p{Ll}*))( (\\p{Lu})(\\p{Ll}*))*$";
        while (true) {
            sc = new Scanner(System.in);
            String typeRentOrRoomStandard = sc.nextLine();
            if (typeRentOrRoomStandard.matches(regex)) {
                return typeRentOrRoomStandard;
            } else {
                System.out.println("Kiểu thuê hoặc tiêu chuẩn phòng không đúng định dạng");
                System.out.print("Mời bạn nhập lại: ");
            }
        }
    }

    public static Double checkValidationAreaUseOrAreaPool() {
        while (true) {
            try {
                sc = new Scanner(System.in);
                Double area = sc.nextDouble();
                if (area > 30) {
                    return area;
                } else {
                    System.out.println("Area phải lớn hơn 30m2");
                    System.out.print("Mời bạn nhập lại: ");
                }
            } catch (Exception e) {
                System.out.println("Nhập sai kiểu dữ liệu");
                System.out.print("Mời bạn nhập lại: ");
            }
        }
    }

    public static Double checkValidationRentCosts() {
        while (true) {
            try {
                sc = new Scanner(System.in);
                System.out.print("Enter Rental Costs: ");
                Double rentalCosts = sc.nextDouble();
                if (rentalCosts > 0) {
                    return rentalCosts;
                } else {
                    System.out.println("Rental Costs phải là số dương");
                }
            } catch (Exception e) {
                System.out.println("Nhập sai kiểu dữ liệu");
            }
        }
    }

    public static Integer checkValidationMaxNumberPeople() {
        while (true) {
            try {
                sc = new Scanner(System.in);
                System.out.print("Enter Max Number Of People: ");
                int maxNumberOfPeople = sc.nextInt();
                if (maxNumberOfPeople > 0 && maxNumberOfPeople < 20) {
                    return maxNumberOfPeople;
                } else {
                    System.out.println("Max Number Of People phải lớn hơn 0 và nhỏ hơn 20!");
                }
            } catch (Exception e) {
                System.out.println("Nhập sai kiểu dữ liệu");
            }
        }
    }

    public static Integer checkValidationNumberOfFloors() {
        while (true) {
            try {
                sc = new Scanner(System.in);
                System.out.print("Enter Number Of Floors: ");
                Integer numberOfFloors = sc.nextInt();
                if (numberOfFloors > 0) {
                    return numberOfFloors;
                } else {
                    System.out.println("Number Of Floors phải là số nguyên dương");
                }
            } catch (Exception e) {
                System.out.println("Nhập sai kiểu dữ liệu");
            }
        }
    }

    public static String checkIDVilla() {
        regex = "^SVVL-[0-9]{4}$";
        while (true) {
            sc = new Scanner(System.in);
            System.out.print("Nhập vào ID Villa (SVVL-XXXX): ");
            String idVilla = sc.nextLine();
            if (idVilla.matches(regex)) {
                return idVilla;
            } else {
                System.out.println("(SVVL-XXXX) X là số từ 1 - 9");
                System.out.println("Mời nhập lại ");
            }
        }
    }

    public static String checkIDHouse() {
        regex = "^SVHO-[0-9]{4}$";
        while (true) {
            sc = new Scanner(System.in);
            System.out.print("Nhập vào ID House (SVHO-XXXX): ");
            String idHouse = sc.nextLine();
            if (idHouse.matches(regex)) {
                return idHouse;
            } else {
                System.out.println("(SVHO-XXXX) X là số từ 1 - 9");
                System.out.println("Mời nhập lại ");
            }
        }
    }

    public static String checkIDRoom() {
        regex = "^SVRO-[0-9]{4}$";
        while (true) {
            sc = new Scanner(System.in);
            System.out.print("Nhập vào ID Room (SVRO-XXXX): ");
            String idRoom = sc.nextLine();
            if (idRoom.matches(regex)) {
                return idRoom;
            } else {
                System.out.println("(SVRO-XXXX) X là số từ 1 - 9");
                System.out.println("Mời nhập lại ");
            }
        }
    }

    public static String standardized(String str) {
        str = str.trim().toLowerCase();
        String temporary = "" + String.valueOf(str.charAt(0)).toUpperCase();
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && str.charAt(i - 1) == ' ') {
                continue;
            }
            if (str.charAt(i - 1) == ' ') {
                temporary += String.valueOf(str.charAt(i)).toUpperCase() ;
            } else {
                temporary += str.charAt(i);
            }

        }
        return temporary;
    }


    public static String checkFreeService() {
        regex = "^massge|karaoke|food|drink|car$";
        while (true) {
            sc = new Scanner(System.in);
            System.out.print("Nhập vào Dịch vụ kèm theo: " );
            String freeservice = sc.nextLine();
            freeservice = freeservice.toLowerCase() ;
            if (freeservice.matches(regex)) {
                return freeservice;
            } else {
                System.out.println("Dịch vụ hiện có : massge|karaoke|food|drink|car");
                System.out.println("Mời nhập lại ");
            }
        }
    }
}
