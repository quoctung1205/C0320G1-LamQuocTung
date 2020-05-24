package CaseStudy2.Common;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import CaseStudy2.Model.HouseService;

public class HouseCSV {
    private static final String COMMA_DELIMITER=",";
    private static final String NEW_LINE_SEPERATOR="\n";
    private static final String fileHouse="/home/tungdz/Documents/codegym/C0320G1-LamQuocTung/module2/src/CaseStudy2/Data/House.csv";
    //file Header CSV
    private static final String FILE_HEAD_VILLA="ID,NameService,Area,Price,MaximumPeople,TypeRents,StandardRoom,OtherFacility,NumberOfFloor";


    public static void writeHouseToFileCSV(ArrayList<HouseService> listHouse){
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(fileHouse);
            fileWriter.append(FILE_HEAD_VILLA);
            fileWriter.append(NEW_LINE_SEPERATOR);
            for(HouseService houseService: listHouse){
                fileWriter.append(houseService.getId());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(houseService.getNameService());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(Double.toString(houseService.getArea()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(Long.toString(houseService.getPrice()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(Integer.toString(houseService.getMaximumPeople()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(houseService.getTypeRents());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(houseService.getStandardRoom());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(houseService.getOtherFacility());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(Integer.toString(houseService.getNumberOfFloor()));
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
    public static ArrayList<HouseService> getFileCSVToHouseList() {
        BufferedReader br = null;
        ArrayList<HouseService> listHouse = new ArrayList<HouseService>();
        Path Path = Paths.get(fileHouse);
        if(!Files.exists(Path)) {
            try {
                Writer writer = new FileWriter(fileHouse);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        try {
            String Line;
            br = new BufferedReader(new FileReader(fileHouse));
            while((Line = br.readLine())!= null){
                String[] splitData = Line.split(",");
                if(splitData[0].equals("ID")){
                    continue;
                }
                HouseService houseService = new HouseService();
                houseService.setId(splitData[0]);
                houseService.setNameService(splitData[1]);
                houseService.setArea(Double.parseDouble(splitData[2]));
                houseService.setPrice(Long.parseLong(splitData[3]));
                houseService.setMaximumPeople(Integer.parseInt(splitData[4]));
                houseService.setTypeRents(splitData[5]);
                houseService.setStandardRoom(splitData[6]);
                houseService.setOtherFacility(splitData[7]);;
                houseService.setNumberOfFloor(Integer.parseInt(splitData[8]));
                listHouse.add(houseService);
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
        return listHouse;
    }
}