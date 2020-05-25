package Commons;

import Models.Customer;
import Models.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class ReadCSV_Employee {
    private static final String COMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";
    private static final String fileEmployee = "src/data/Employee.csv";
    private static final String FILE_HEADER_EMPLOYEE = "ID,NAME,AGE,ADDRESS";

    public static ArrayList<Employee> getFileCSVToListEmployee() {
        BufferedReader br = null;
        ArrayList<Employee> listEmployee = new ArrayList<Employee>();
        Path path = Paths.get(fileEmployee);
        if (!Files.exists(path)) {
            try {
                Writer writer = new FileWriter(fileEmployee);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        try {
            String line;
            br = new BufferedReader(new FileReader(fileEmployee));
            while ((line = br.readLine()) != null) {
                String[] spilitData = line.split(",");
                if (spilitData[0].equals("ID")) {
                    continue;
                }
                Employee employee = new Employee();
                employee.setId(spilitData[0]);
                employee.setName(spilitData[1]);
                employee.setAge(Integer.parseInt(spilitData[2]));
                employee.setAddress(spilitData[3]);
                listEmployee.add(employee);
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
        return listEmployee;
    }
}
