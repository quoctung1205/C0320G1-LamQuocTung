package CaseStudy2.Common;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Writer;
import java.nio.Buffer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import CaseStudy2.Model.VillaService;

public class VillaCSV {
    private static final String COMMA_DELIMITER=",";
    private static final String NEW_LINE_SEPERATOR="\n";
    private static final String fileVilla="/home/tungdz/Documents/codegym/C0320G1-LamQuocTung/module2/src/CaseStudy2/Data/Villas.csv";
    //file Header CSV
    private static final String FILE_HEAD_VILLA="ID,NameService,Area,Price,MaximumPeople,TypeRents,StandardRoom,OtherFacility,PoolArea,NumberOfFloor";


    public static void writeVillaToFileCSV(ArrayList<VillaService> listVillas){
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(fileVilla);
            fileWriter.append(FILE_HEAD_VILLA);
            fileWriter.append(NEW_LINE_SEPERATOR);
            for(VillaService villaService : listVillas){
                fileWriter.append(villaService.getId());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(villaService.getNameService());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(Double.toString(villaService.getArea()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(Long.toString(villaService.getPrice()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(Integer.toString(villaService.getMaximumPeople()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(villaService.getTypeRents());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(villaService.getStandardRoom());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(villaService.getOtherFacility());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(Double.toString(villaService.getPoolArea()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(Integer.toString(villaService.getNumberOfFloor()));
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
    public static ArrayList<VillaService> getFileCSVToVillaList() {
        BufferedReader br = null;
        ArrayList<VillaService> listVillas = new ArrayList<VillaService>();
        Path Path = Paths.get(fileVilla);
        if(!Files.exists(Path)) {
            try {
                Writer writer = new FileWriter(fileVilla);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        try {
            String Line;
            br = new BufferedReader(new FileReader(fileVilla));
            while((Line = br.readLine())!= null){
                String[] splitData = Line.split(",");
                if(splitData[0].equals("ID")){
                    continue;
                }
                // for (String string : splitData) {
                //     System.out.println(string);
                // }
                VillaService villaService = new VillaService();
                villaService.setId(splitData[0]);
                villaService.setNameService(splitData[1]);
                villaService.setArea(Double.parseDouble(splitData[2]));
                villaService.setPrice(Long.parseLong(splitData[3]));
                villaService.setMaximumPeople(Integer.parseInt(splitData[4]));
                villaService.setTypeRents(splitData[5]);
                villaService.setStandardRoom(splitData[6]);
                villaService.setOtherFacility(splitData[7]);
                villaService.setPoolArea(Double.parseDouble(splitData[8]));
                villaService.setNumberOfFloor(Integer.parseInt(splitData[9]));
                listVillas.add(villaService);
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
        return listVillas;
    }

}