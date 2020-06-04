package CaseStudy2.Controller;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

import CaseStudy2.Common.HouseCSV;
import CaseStudy2.Common.RoomCSV;
import CaseStudy2.Common.VillaCSV;
import CaseStudy2.Model.HouseService;
import CaseStudy2.Model.RoomService;
import CaseStudy2.Model.VillaService;
// import jdk.nashorn.internal.runtime.regexp.RegExp;

public class AddNewService {
    private ArrayList<VillaService> listVillas = new ArrayList<VillaService>();
    private ArrayList<HouseService> listHouses = new ArrayList<HouseService>();
    private ArrayList<RoomService> listRooms = new ArrayList<RoomService>();
    public void addNewVilla(){
        String ID_PATTERN = "^SVVL-[0-9]{4}$";
        String NAME_PATTERN = "^[A-Z]+[a-z]+$";
        String AREA_PATTERN= "^([3-9]\\d)(\\.\\d+)?$|^([1-9][0-9]{2,})(\\.\\d+)?$";
        String PRICE_PATTERN = "^\\d+$";
        String MAXIMUM_PATTERN = "^[01][1-9]|10$";
        String NUMFLOOR_PATTERN = "^\\d{1,10}";
        String TYPERENT_PATTERN = "year|month|day";
        String STANDARD_PATTERN = "vip|normal";
        boolean check = true;
        MainController mainController = new MainController();
        listVillas = VillaCSV.getFileCSVToVillaList();
        Scanner scanner = new Scanner(System.in);
        VillaService villaService = new VillaService();


        do{
            System.out.println("Add ID");
            String inputID = scanner.nextLine();
            if(Pattern.matches(ID_PATTERN, inputID)){
                villaService.setId(inputID);
                check = false;
            }else{
                System.out.println("Invalid,Please Input Again");
            }
        }while(check);
        check = true;


        do{
            System.out.println("Add Name Service");
            String inputName = scanner.nextLine();
            if(Pattern.matches(NAME_PATTERN, inputName)){
                villaService.setNameService(inputName);
                check = false;
            }else{
                System.out.println("Invalid,Please Input Again");
            }
        }while(check);
        check = true;


        do{
            System.out.println("Add Area");
            String inputArea = scanner.nextLine();
            if(Pattern.matches(AREA_PATTERN, inputArea)){
                villaService.setArea(Double.parseDouble(inputArea));
                check = false;
            }else{
                System.out.println("Invalid,Please Input Again");
            }
        }while(check);
        check = true;

        do{
            System.out.println("Add Price");
            String inputPrice = scanner.nextLine();
            if(Pattern.matches(PRICE_PATTERN, inputPrice)){
                villaService.setPrice(Long.parseLong(inputPrice));
                check = false;
            }else{
                System.out.println("Invalid,Please Input Again");
            }
        }while(check);
        check = true;
        
        do{
            System.out.println("Add Maximum People");
            String inputMaximum = scanner.nextLine();
            if(Pattern.matches(MAXIMUM_PATTERN, inputMaximum)){
                villaService.setMaximumPeople(Integer.parseInt(inputMaximum));
                check = false;
            }else{
                System.out.println("Invalid,Please Input Again");
            }
        }while(check);
        check = true;

        do{
            System.out.println("Add Type Rent");
            String inputTypeRent = scanner.nextLine();
            if(Pattern.matches(TYPERENT_PATTERN, inputTypeRent)){
                villaService.setTypeRents(inputTypeRent);
                check = false;
            }else{
                System.out.println("Invalid,Please Input Again");
            }
        }while(check);
        check = true;
        
        do{
            System.out.println("Add Standard Room");
            String inputStandard = scanner.nextLine();
            if(Pattern.matches(STANDARD_PATTERN, inputStandard)){
                villaService.setStandardRoom(inputStandard);
                check = false;
            }else{
                System.out.println("Invalid,Please Input Again");
            }
        }while(check);
        check = true;

        System.out.println("Add Other Facility");
        villaService.setOtherFacility(scanner.nextLine());
        System.out.println("Add pool area");
        villaService.setPoolArea(Double.parseDouble(scanner.nextLine()));

        do{
            System.out.println("Add number of floor");
            String inputNumFloor = scanner.nextLine();
            if(Pattern.matches(NUMFLOOR_PATTERN, inputNumFloor)){
                villaService.setNumberOfFloor(Integer.parseInt(inputNumFloor));
                check = false;
            }else{
                System.out.println("Invalid,Please Input Again");
            }
        }while(check);
        check = true;
    
        listVillas.add(villaService);
        VillaCSV.writeVillaToFileCSV(listVillas);
        System.out.println("Add complete, press Enter to continue");
        scanner.nextLine();
        mainController.displayMainMenu();
    }

    public void addNewHouse(){
        String ID_PATTERN = "^SVHO-[0-9]{4}$";
        String NAME_PATTERN = "^[A-Z]+[a-z]+$";
        String AREA_PATTERN= "^([3-9]\\d)(\\.\\d+)?$|^([1-9][0-9]{2,})(\\.\\d+)?$";
        String PRICE_PATTERN = "^\\d+$";
        String MAXIMUM_PATTERN = "^[01][1-9]|10$";
        String NUMFLOOR_PATTERN = "^\\d{1,10}";
        String TYPERENT_PATTERN = "year|month|day";
        String STANDARD_PATTERN = "vip|normal";
        boolean check = true;
        MainController mainController = new MainController();
        listHouses = HouseCSV.getFileCSVToHouseList();
        Scanner scanner = new Scanner(System.in);
        HouseService houseService= new HouseService();


        do{
            System.out.println("Add ID");
            String inputID = scanner.nextLine();
            if(Pattern.matches(ID_PATTERN, inputID)){
                houseService.setId(inputID);
                check = false;
            }else{
                System.out.println("Invalid,Please Input Again");
            }
        }while(check);
        check = true;


        do{
            System.out.println("Add Name Service");
            String inputName = scanner.nextLine();
            if(Pattern.matches(NAME_PATTERN, inputName)){
                houseService.setNameService(inputName);
                check = false;
            }else{
                System.out.println("Invalid,Please Input Again");
            }
        }while(check);
        check = true;


        do{
            System.out.println("Add Area");
            String inputArea = scanner.nextLine();
            if(Pattern.matches(AREA_PATTERN, inputArea)){
                houseService.setArea(Double.parseDouble(inputArea));
                check = false;
            }else{
                System.out.println("Invalid,Please Input Again");
            }
        }while(check);
        check = true;

        do{
            System.out.println("Add Price");
            String inputPrice = scanner.nextLine();
            if(Pattern.matches(PRICE_PATTERN, inputPrice)){
                houseService.setPrice(Long.parseLong(inputPrice));
                check = false;
            }else{
                System.out.println("Invalid,Please Input Again");
            }
        }while(check);
        check = true;

        do{
            System.out.println("Add Maximum People");
            String inputMaximum = scanner.nextLine();
            if(Pattern.matches(MAXIMUM_PATTERN, inputMaximum)){
                houseService.setMaximumPeople(Integer.parseInt(inputMaximum));
                check = false;
            }else{
                System.out.println("Invalid,Please Input Again");
            }
        }while(check);
        check = true;

        
        do{
            System.out.println("Add Type Rent");
            String inputTypeRent = scanner.nextLine();
            if(Pattern.matches(TYPERENT_PATTERN, inputTypeRent)){
                houseService.setTypeRents(inputTypeRent);
                check = false;
            }else{
                System.out.println("Invalid,Please Input Again");
            }
        }while(check);
        check = true;


        do{
            System.out.println("Add Standard Room");
            String inputStandard = scanner.nextLine();
            if(Pattern.matches(STANDARD_PATTERN, inputStandard)){
                houseService.setStandardRoom(inputStandard);
                check = false;
            }else{
                System.out.println("Invalid,Please Input Again");
            }
        }while(check);
        check = true;


        System.out.println("Add Other Facility");
        houseService.setOtherFacility(scanner.nextLine());

        do{
            System.out.println("Add number of floor");
            String inputNumFloor = scanner.nextLine();
            if(Pattern.matches(NUMFLOOR_PATTERN, inputNumFloor)){
                houseService.setNumberOfFloor(Integer.parseInt(inputNumFloor));
                check = false;
            }else{
                System.out.println("Invalid,Please Input Again");
            }
        }while(check);
        check = true;

        listHouses.add(houseService);
        HouseCSV.writeHouseToFileCSV(listHouses);
        System.out.println("Add complete, press Enter to continue");
        scanner.nextLine();
        mainController.displayMainMenu();
    }

    public void addNewRoom(){
        String ID_PATTERN = "^SVRO-[0-9]{4}$";
        String NAME_PATTERN = "^[A-Z]+[a-z]+$";
        String AREA_PATTERN= "^([3-9]\\d)(\\.\\d+)?$|^([1-9][0-9]{2,})(\\.\\d+)?$";
        String PRICE_PATTERN = "^\\d+$";
        String MAXIMUM_PATTERN = "^[01][1-9]|10$";
        String FREESERVICE_PATTERN= "water|soft drink|beer";
        String TYPERENT_PATTERN = "year|month|day";

        boolean check = true;
        MainController mainController = new MainController();
        listRooms = RoomCSV.getFileCSVToRoomList();
        Scanner scanner = new Scanner(System.in);
        RoomService roomService = new RoomService();
        do{
            System.out.println("Add ID");
            String inputID = scanner.nextLine();
            if(Pattern.matches(ID_PATTERN, inputID)){
                roomService.setId(inputID);
                check = false;
            }else{
                System.out.println("Invalid,Please Input Again");
            }
        }while(check);
        check = true;


        do{
            System.out.println("Add Name Service");
            String inputName = scanner.nextLine();
            if(Pattern.matches(NAME_PATTERN, inputName)){
                roomService.setNameService(inputName);
                check = false;
            }else{
                System.out.println("Invalid,Please Input Again");
            }
        }while(check);
        check = true;

        do{
            System.out.println("Add Area");
            String inputArea = scanner.nextLine();
            if(Pattern.matches(AREA_PATTERN, inputArea)){
                roomService.setArea(Double.parseDouble(inputArea));
                check = false;
            }else{
                System.out.println("Invalid,Please Input Again");
            }
        }while(check);
        check = true;


        do{
            System.out.println("Add Price");
            String inputPrice = scanner.nextLine();
            if(Pattern.matches(PRICE_PATTERN, inputPrice)){
                roomService.setPrice(Long.parseLong(inputPrice));
                check = false;
            }else{
                System.out.println("Invalid,Please Input Again");
            }
        }while(check);
        check = true;
        do{
            System.out.println("Add Maximum People");
            String inputMaximum = scanner.nextLine();
            if(Pattern.matches(MAXIMUM_PATTERN, inputMaximum)){
                roomService.setMaximumPeople(Integer.parseInt(inputMaximum));
                check = false;
            }else{
                System.out.println("Invalid,Please Input Again");
            }
        }while(check);
        check = true;


        do{
            System.out.println("Add Type Rent");
            String inputTypeRent = scanner.nextLine();
            if(Pattern.matches(TYPERENT_PATTERN, inputTypeRent)){
                roomService.setTypeRents(inputTypeRent);
                check = false;
            }else{
                System.out.println("Invalid,Please Input Again");
            }
        }while(check);
        check = true;


        do{
            System.out.println("Add Type Rent");
            String inputFreeService = scanner.nextLine();
            if(Pattern.matches(FREESERVICE_PATTERN, inputFreeService)){
                roomService.setTypeRents(inputFreeService);
                check = false;
            }else{
                System.out.println("Invalid,Please Input Again");
            }
        }while(check);
        check = true;


        listRooms.add(roomService);
        RoomCSV.writeRoomToFileCSV(listRooms);
        System.out.println("Add complete, press Enter to continue");
        scanner.nextLine();
        mainController.displayMainMenu();
    }
}