package Commons;

import Models.Customer;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class FuncFileCSV_Booking {
    private static final String COMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";
    private static final String fileBooking = "src/data/Booking.csv";
    private static final String FILE_HEADER_BOOKING = " nameCustomer, idCard,  birthday,  gender,  phoneNumber,  email,  typeCustomer,  address, idService, nameService, areaUse, rentalCost, maxNumberOfPeople, typeRent";

    public static void writeBookingToFileCSV(ArrayList<Customer> listBooking) {
        FileWriter fileWriter = null;

        try {
            fileWriter = new FileWriter(fileBooking);
            fileWriter.append(FILE_HEADER_BOOKING);
            fileWriter.append(NEW_LINE_SEPARATOR);
            for (Customer customer : listBooking) {
                fileWriter.append(customer.getName());
                fileWriter.append(COMA_DELIMITER);
                fileWriter.append(customer.getIdCard());
                fileWriter.append(COMA_DELIMITER);
                fileWriter.append(customer.getBirthday());
                fileWriter.append(COMA_DELIMITER);
                fileWriter.append(customer.getGender());
                fileWriter.append(COMA_DELIMITER);
                fileWriter.append(customer.getPhoneNum());
                fileWriter.append(COMA_DELIMITER);
                fileWriter.append(customer.getEmail());
                fileWriter.append(COMA_DELIMITER);
                fileWriter.append(customer.getTypeCustomer());
                fileWriter.append(COMA_DELIMITER);
                fileWriter.append(customer.getAddress());
                fileWriter.append(COMA_DELIMITER);
                fileWriter.append(customer.getServices().getId());
                fileWriter.append(COMA_DELIMITER);
                fileWriter.append(customer.getServices().getServiceName());
                fileWriter.append(COMA_DELIMITER);
                fileWriter.append(String.valueOf(customer.getServices().getAreaUse()));
                fileWriter.append(COMA_DELIMITER);
                fileWriter.append(String.valueOf(customer.getServices().getRentCosts()));
                fileWriter.append(COMA_DELIMITER);
                fileWriter.append(String.valueOf(customer.getServices().getMaxNumberPeople()));
                fileWriter.append(COMA_DELIMITER);
                fileWriter.append(customer.getServices().getTypeRent());
                fileWriter.append(NEW_LINE_SEPARATOR);
            }
            System.out.println("CSV file was created successfully !!!");
        } catch (Exception e) {
            System.out.println("Error in CsvFileWriter !!!");

        } finally {

            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (IOException e) {
                System.out.println("Error while flushing/closing fileWriter !!!");

            }
        }
    }

    public static ArrayList<Customer> getFileCSVToListBooking() {
        BufferedReader br = null;
        ArrayList<Customer> listBooking = new ArrayList<Customer>();
        Path path = Paths.get(fileBooking);
        if (!Files.exists(path)) {
            try {
                Writer writer = new FileWriter(fileBooking);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        try {
            String line;
            br = new BufferedReader(new FileReader(fileBooking));
            while ((line = br.readLine()) != null) {
                String[] spilitData = line.split(",");
                Customer customer = new Customer();
                customer.setName(spilitData[0]);
                customer.setBirthday(spilitData[1]);
                customer.setGender(spilitData[2]);
                customer.setIdCard(spilitData[3]);
                customer.setPhoneNum(spilitData[4]);
                customer.setEmail(spilitData[5]);
                customer.setTypeCustomer(spilitData[6]);
                customer.setAddress(spilitData[7]);
                customer.setServices(spilitData[8],spilitData[9],Double.valueOf(spilitData[10]),Integer.valueOf(spilitData[11]),spilitData[12],Double.valueOf(spilitData[13]));

                listBooking.add(customer);

            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                br.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return listBooking;
    }
}

