package Commons;

import Models.House;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FuncFileCSVHouse {
    private static final String COMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";
    private static final String FILE_HEADER_HOUSE = "serviceName,id,areaUse,maxNumberPeople,typeRent,rentCost,roomStandard,houseDescription,numberOfFloor";
    private static final String fileHouse = "src/data/House.csv";

    public static void writeHouseToFileCSV(List<House> listHouse) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(fileHouse);
            fileWriter.append(FILE_HEADER_HOUSE);
            fileWriter.append(NEW_LINE_SEPARATOR);
            for (House house : listHouse) {
                fileWriter.append(house.getServiceName());
                fileWriter.append(COMA_DELIMITER);
                fileWriter.append(house.getId());
                fileWriter.append(COMA_DELIMITER);
                fileWriter.append(String.valueOf(house.getAreaUse()));
                fileWriter.append(COMA_DELIMITER);
                fileWriter.append(String.valueOf(house.getMaxNumberPeople()));
                fileWriter.append(COMA_DELIMITER);
                fileWriter.append(house.getTypeRent());
                fileWriter.append(COMA_DELIMITER);
                fileWriter.append(String.valueOf(house.getRentCosts()));
                fileWriter.append(COMA_DELIMITER);
                fileWriter.append(house.getHouseStandard());
                fileWriter.append(COMA_DELIMITER);
                fileWriter.append(house.getHouseDescription());
                fileWriter.append(COMA_DELIMITER);
                fileWriter.append(String.valueOf(house.getNumberOfFloor()));

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

    public static List<House> getFileCSVToListHouse() {
        BufferedReader br = null;
        ArrayList<House> listHouse = new ArrayList<House>();
        Path path = Paths.get(fileHouse);
        if (!Files.exists(path)) {
            try {
                Writer writer = new FileWriter(fileHouse);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        try {
            String line;
            br = new BufferedReader(new FileReader(fileHouse));
            while ((line = br.readLine()) != null) {
                String[] spilitData = line.split(",");
                if (spilitData[0].equals("serviceName")) {
                    continue;
                }
                House house = new House();
                house.setServiceName(spilitData[0]);
                house.setId(spilitData[1]);
                house.setAreaUse(Double.parseDouble(spilitData[2]));
                house.setMaxNumberPeople(Integer.parseInt(spilitData[3]));
                house.setTypeRent(spilitData[4]);
                house.setRentCosts(Double.parseDouble(spilitData[5]));
                house.setHouseStandard(spilitData[6]);
                house.setHouseDescription(spilitData[7]);
                house.setNumberOfFloor(Integer.parseInt(spilitData[8]));
                listHouse.add(house);

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
        return listHouse;
    }
}
