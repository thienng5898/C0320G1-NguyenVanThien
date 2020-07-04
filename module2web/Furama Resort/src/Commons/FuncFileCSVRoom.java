package Commons;


import Models.Room;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FuncFileCSVRoom {
    private static final String COMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";
    private static final String FILE_HEADER_ROOM = "serviceName,id,areaUse,maxNumberPeople,typeRent,rentCost,freeService";
    private static final String fileRoom = "src/data/Room.csv";

    public static void writeRoomToFileCSV(List<Room> listRoom) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(fileRoom);
            fileWriter.append(FILE_HEADER_ROOM);
            fileWriter.append(NEW_LINE_SEPARATOR);
            for (Room room : listRoom) {
                fileWriter.append(room.getServiceName());
                fileWriter.append(COMA_DELIMITER);
                fileWriter.append(room.getId());
                fileWriter.append(COMA_DELIMITER);
                fileWriter.append(String.valueOf(room.getAreaUse()));
                fileWriter.append(COMA_DELIMITER);
                fileWriter.append(String.valueOf(room.getMaxNumberPeople()));
                fileWriter.append(COMA_DELIMITER);
                fileWriter.append(room.getTypeRent());
                fileWriter.append(COMA_DELIMITER);
                fileWriter.append(String.valueOf(room.getRentCosts()));
                fileWriter.append(COMA_DELIMITER);
                fileWriter.append(room.getFreeService());
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

    public static List<Room> getFileCSVToListRoom() {
        BufferedReader br = null;
        ArrayList<Room> listRoom = new ArrayList<Room>();
        Path path = Paths.get(fileRoom);
        if (!Files.exists(path)) {
            try {
                Writer writer = new FileWriter(fileRoom);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        try {
            String line;
            br = new BufferedReader(new FileReader(fileRoom));
            while ((line = br.readLine()) != null) {
                String[] spilitData = line.split(",");
                if (spilitData[0].equals("serviceName")) {
                    continue;
                }
                Room room = new Room();
                room.setServiceName(spilitData[0]);
                room.setId(spilitData[1]);
                room.setAreaUse(Double.parseDouble(spilitData[2]));
                room.setMaxNumberPeople(Integer.parseInt(spilitData[3]));
                room.setTypeRent(spilitData[4]);
                room.setRentCosts(Double.parseDouble(spilitData[5]));
                room.setFreeService(spilitData[6]);

                listRoom.add(room);

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
        return listRoom;
    }
}
