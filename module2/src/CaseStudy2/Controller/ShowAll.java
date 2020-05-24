package CaseStudy2.Controller;

import java.util.ArrayList;
import java.util.Scanner;

import CaseStudy2.Common.HouseCSV;
import CaseStudy2.Common.RoomCSV;
import CaseStudy2.Common.VillaCSV;
import CaseStudy2.Model.HouseService;
import CaseStudy2.Model.RoomService;
import CaseStudy2.Model.VillaService;

public class ShowAll {
    private ArrayList<VillaService> listVillas = new ArrayList<VillaService>();
    private ArrayList<HouseService> listHouses = new ArrayList<HouseService>();
    private ArrayList<RoomService> listRooms = new ArrayList<RoomService>();
    public void showAllVilla(){
        MainController mainController = new MainController();
        listVillas = VillaCSV.getFileCSVToVillaList();
        for(VillaService villaService : listVillas){
            System.out.println("-----------------");
            System.out.println("ID: "+ villaService.getId());
            System.out.println("Name Service: "+ villaService.getNameService());
            System.out.println("Area: "+ villaService.getArea());
            System.out.println("Price: "+ villaService.getPrice());
            System.out.println("Maximum People: "+ villaService.getMaximumPeople());
            System.out.println("Type Rent: "+ villaService.getTypeRents());
            System.out.println("Standard Room: "+ villaService.getStandardRoom());
            System.out.println("Other facility: "+ villaService.getOtherFacility());
            System.out.println("Pool Area: "+ villaService.getPoolArea());
            System.out.println("Number of floor: "+ villaService.getNumberOfFloor());
            System.out.println("------------------");
        }
        System.out.println("Enter to back the main menu");
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        mainController.displayMainMenu();
    }
    public void showAllHouse(){
        MainController mainController = new MainController();
         listHouses = HouseCSV.getFileCSVToHouseList();
        for(HouseService houseService : listHouses){
            System.out.println("-----------------");
            System.out.println("ID: "+ houseService.getId());
            System.out.println("Name Service: "+ houseService.getNameService());
            System.out.println("Area: "+ houseService.getArea());
            System.out.println("Price: "+ houseService.getPrice());
            System.out.println("Maximum People: "+ houseService.getMaximumPeople());
            System.out.println("Type Rent: "+ houseService.getTypeRents());
            System.out.println("Standard Room: "+ houseService.getStandardRoom());
            System.out.println("Other facility: "+ houseService.getOtherFacility());
            System.out.println("Number of floor: "+ houseService.getNumberOfFloor());
            System.out.println("------------------");
        }
        System.out.println("Enter to back the main menu");
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        mainController.displayMainMenu();
    }
    public void showAllRoom(){
        MainController mainController = new MainController();
         listRooms = RoomCSV.getFileCSVToRoomList();
        for(RoomService roomService : listRooms){
            System.out.println("-----------------");
            System.out.println("ID: "+ roomService.getId());
            System.out.println("Name Service: "+ roomService.getNameService());
            System.out.println("Area: "+ roomService.getArea());
            System.out.println("Price: "+ roomService.getPrice());
            System.out.println("Maximum People: "+ roomService.getMaximumPeople());
            System.out.println("Type Rent: "+ roomService.getTypeRents());
            System.out.println("Free Service: "+ roomService.getFreeService());
            System.out.println("------------------");
        }
        System.out.println("Enter to back the main menu");
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        mainController.displayMainMenu();
    }
}