package Commons;

import Models.Villa;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class FuncFileCSV_Villa {
    private static final String COMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";
    private static final String FILE_HEADER_VILLA = "serviceName,id,areaUse,maxNumberPeople,typeRent,rentCost,roomStandard,villaDescription,numberOfFloor";
    private static final String fileVilla = "src/data/Villa.csv";

    public static void writeVillaToFileCSV(ArrayList<Villa> listVilla) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(fileVilla);
            fileWriter.append(FILE_HEADER_VILLA);
            fileWriter.append(NEW_LINE_SEPARATOR);
            for (Villa villa : listVilla) {
                fileWriter.append(villa.getServiceName());
                fileWriter.append(COMA_DELIMITER);
                fileWriter.append(villa.getId());
                fileWriter.append(COMA_DELIMITER);
                fileWriter.append(String.valueOf(villa.getAreaUse()));
                fileWriter.append(COMA_DELIMITER);
                fileWriter.append(String.valueOf(villa.getMaxNumberPeople()));
                fileWriter.append(COMA_DELIMITER);
                fileWriter.append(villa.getTypeRent());
                fileWriter.append(COMA_DELIMITER);
                fileWriter.append(String.valueOf(villa.getRentCosts()));
                fileWriter.append(COMA_DELIMITER);
                fileWriter.append(villa.getRoomStandard());
                fileWriter.append(COMA_DELIMITER);
                fileWriter.append(villa.getVillaDescription());
                fileWriter.append(COMA_DELIMITER);
                fileWriter.append(String.valueOf(villa.getnumberOfFloor()));
                fileWriter.append(COMA_DELIMITER);
                fileWriter.append(String.valueOf(villa.getPoolArea()));
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

    public static ArrayList<Villa> getFileCSVToListVilla() {
        BufferedReader br = null;
        ArrayList<Villa> listVilla = new ArrayList<Villa>();
        Path path = Paths.get(fileVilla);
        if (!Files.exists(path)){
            try {
                Writer writer =new FileWriter(fileVilla) ;
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }

        try {
            String line;
            br = new BufferedReader(new FileReader(fileVilla));
            while ((line = br.readLine()) !=null){
                String[] spilitData=line.split(",") ;
                if (spilitData[0].equals("serviceName")) {
                    continue;
                }
                Villa villa =new Villa() ;
                villa.setServiceName(spilitData[0]);
                villa.setId(spilitData[1]);
                villa.setAreaUse(Double.valueOf(spilitData[2]));
                villa.setMaxNumberPeople(Integer.valueOf(spilitData[3]));
                villa.setTypeRent(spilitData[4]);
                villa.setRentCosts(Double.valueOf(spilitData[5]));
                villa.setVillaStandard(spilitData[6]);
                villa.setVillaDescription(spilitData[7]);
                villa.setVillaDescription(spilitData[8]);
                villa.setPoolArea(Double.valueOf(spilitData[9]));
                listVilla.add(villa) ;

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
        return listVilla;
    }
}
