package Commons;

import Models.Customer;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FuncFileCSVCustomer {
    private static final String COMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";
    private static final String fileCustomer = "src/data/Customer.csv";
    private static final String FILE_HEADER_CUSTOMER = "nameCustomer,birthday,gender,idCard,phoneNumber,email,typeCustomer,address ";

    public static void writeCustomerToFileCSV(List<Customer> listCustomer) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(fileCustomer);
            fileWriter.append(FILE_HEADER_CUSTOMER);
            fileWriter.append(NEW_LINE_SEPARATOR);
            for (Customer customer : listCustomer) {
                fileWriter.append(customer.getName());
                fileWriter.append(COMA_DELIMITER);
                fileWriter.append(customer.getBirthday());
                fileWriter.append(COMA_DELIMITER);
                fileWriter.append(customer.getGender());
                fileWriter.append(COMA_DELIMITER);
                fileWriter.append(customer.getIdCard());
                fileWriter.append(COMA_DELIMITER);
                fileWriter.append(customer.getPhoneNum());
                fileWriter.append(COMA_DELIMITER);
                fileWriter.append(customer.getEmail());
                fileWriter.append(COMA_DELIMITER);
                fileWriter.append(customer.getTypeCustomer());
                fileWriter.append(COMA_DELIMITER);
                fileWriter.append(customer.getAddress());
                fileWriter.append(NEW_LINE_SEPARATOR);
            }


        } catch (Exception e) {
            System.out.println("Error in CsvFileWriter");
        } finally {
            try {
                fileWriter.flush();
                fileWriter.close();

            } catch (Exception ex) {
                System.out.println("Error when flush or close");
            }
        }
    }
    public static List<Customer> getFileCSVToListCustomer() {
        BufferedReader br = null;
        ArrayList<Customer> listCustomer = new ArrayList<Customer>();
        Path path = Paths.get(fileCustomer);
        if (!Files.exists(path)) {
            try {
                Writer writer = new FileWriter(fileCustomer);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        try {
            String line;
            br = new BufferedReader(new FileReader(fileCustomer));
            while ((line = br.readLine()) != null) {
                String[] spilitData = line.split(",");
                if (spilitData[0].equals("nameCustomer")) {
                    continue ;
                }
                Customer customer = new Customer();
                customer.setName(spilitData[0]);
                customer.setBirthday(spilitData[1]);
                customer.setGender(spilitData[2]);
                customer.setIdCard(spilitData[3]);
                customer.setPhoneNum(spilitData[4]);
                customer.setEmail(spilitData[5]);
                customer.setTypeCustomer(spilitData[6]);
                customer.setAddress(spilitData[7]);

                listCustomer.add(customer);

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
        return listCustomer;
    }
}