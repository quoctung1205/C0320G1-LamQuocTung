package CaseStudy2.Common;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

import CaseStudy2.Model.RoomService;

public class RoomCSV {
    private static final String COMMA_DELIMITER=",";
    private static final String NEW_LINE_SEPERATOR="\n";
    private static final String fileRoom="/home/tungdz/Documents/codegym/C0320G1-LamQuocTung/module2/src/CaseStudy2/Data/Room.csv";
    //file Header CSV
    private static final String FILE_HEAD_VILLA="ID,NameService,Area,Price,MaximumPeople,TypeRents,FreeService";


    public static void writeRoomToFileCSV(ArrayList<RoomService> listRoom){
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(fileRoom);
            fileWriter.append(FILE_HEAD_VILLA);
            fileWriter.append(NEW_LINE_SEPERATOR);
            for(RoomService roomService : listRoom){
                fileWriter.append(roomService.getId());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(roomService.getNameService());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(Double.toString(roomService.getArea()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(Long.toString(roomService.getPrice()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(Integer.toString(roomService.getMaximumPeople()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(roomService.getTypeRents());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(roomService.getFreeService());
                fileWriter.append(NEW_LINE_SEPERATOR);
            }
        } catch (Exception e) {
            System.out.println("Error in CSV Writer");
        }
        finally{
            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (Exception e) {
                System.out.println("Error when flush and close");
            }
        }
    }
    public static ArrayList<RoomService> getFileCSVToRoomList() {
        BufferedReader br = null;
        ArrayList<RoomService> listRoom = new ArrayList<RoomService>();
        try {
            String Line;
            br = new BufferedReader(new FileReader(fileRoom));
            while((Line = br.readLine())!= null){
                String[] splitData = Line.split(",");
                if(splitData[0].equals("ID")){
                    continue;
                }
                RoomService roomService= new RoomService();
                roomService.setId(splitData[0]);
                roomService.setNameService(splitData[1]);
                roomService.setArea(Double.parseDouble(splitData[2]));
                roomService.setPrice(Long.parseLong(splitData[3]));
                roomService.setMaximumPeople(Integer.parseInt(splitData[4]));
                roomService.setTypeRents(splitData[5]);
                roomService.setFreeService(splitData[6]);
                listRoom.add(roomService);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally{
            try {
                br.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return listRoom;
    }
}