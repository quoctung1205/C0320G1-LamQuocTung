package CaseStudy2.Common;

import java.util.ArrayList;

import CaseStudy2.Model.Employee;

public class EmployeeCSV {
    public class HouseCSV {
        private static final String COMMA_DELIMITER=",";
        private static final String NEW_LINE_SEPERATOR="\n";
        private static final String fileHouse="/home/tungdz/Documents/codegym/C0320G1-LamQuocTung/module2/src/CaseStudy2/Data/House.csv";
        //file Header CSV
        private static final String FILE_HEAD_VILLA="ID,NameService,Area,Price,MaximumPeople,TypeRents,StandardRoom,OtherFacility,NumberOfFloor";
    
    
        
        public static ArrayList<Employee> getFileCSVToHouseList() {
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