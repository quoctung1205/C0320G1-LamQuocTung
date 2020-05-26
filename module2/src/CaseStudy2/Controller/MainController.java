package CaseStudy2.Controller;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

import CaseStudy2.Common.HouseCSV;
import CaseStudy2.Common.RoomCSV;
import CaseStudy2.Common.VillaCSV;
import CaseStudy2.Model.HouseService;
import CaseStudy2.Model.NewBooking;
import CaseStudy2.Model.RoomService;
import CaseStudy2.Model.VillaService;


public class MainController {
    public void displayMainMenu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.Add New Service 2.Show Service 3.Add New Customer" 
        +" 4.Show Infomation of Customer 5.Add new booking 6.Show information of Employee 7.Exit");
        int input = Integer.parseInt(scanner.nextLine());
        switch(input){
            case 1: {
                addNewService();
                break;
            }
            case 2:{
                showService();
                break;
            }
            case 3:{
                addNewCustommer();
                break;
            }
            case 4:{
                showInformationCustomer();
                break;
            }
            case 5:{
                addNewBooking();
                break;
            }
            case 6:{
                //showInformationEmployee();
                break;
            }
            case 7:
            System.exit(0);
            default: System.out.println("Failed");
        } 
    }
    public void addNewService(){
        AddNewService addNewService1 = new AddNewService();
        System.out.println("1.Add new Villa 2.Add new House 3.Add new Room 4.Back to Main Menu");
        Scanner scanner =new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());
        switch(input){
            case 1:{
                addNewService1.addNewVilla();
                break;
            }
            case 2:{
                addNewService1.addNewHouse();
                break;
            }
            case 3:{
                addNewService1.addNewRoom();
                break;
            }
            case 4: 
                displayMainMenu();
                break;
            default: 
                System.out.println("Failed,press Enter to continue");
                scanner.nextLine();
                displayMainMenu();
        }
    }
    

    public void showService(){
        System.out.println("1.Show all Villa");
        System.out.println("2.Show all House");
        System.out.println("3.Show all Room");
        System.out.println("4.Show all Name Villa Not duplicate");
        System.out.println("5.Show all Name House Not duplicate");
        System.out.println("6.Show all Name Room Not duplicate");
        System.out.println("7.Back to Menu");
        System.out.println("8.Exit");
        ShowAll showAll = new ShowAll();
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());
        switch (input) {
            case 1:
                showAll.showAllVilla();
                System.out.println("Enter to back the main menu");
                scanner.nextLine();
                displayMainMenu();
                break;
            case 2:
                showAll.showAllHouse();
                System.out.println("Enter to back the main menu");
                scanner.nextLine();
                displayMainMenu();
                break;
            case 3:
                showAll.showAllRoom();
                System.out.println("Enter to back the main menu");
                scanner.nextLine();
                displayMainMenu();
                break;
            case 4:
                ShowAllVillaDuplicate();
                break;
            case 5:
                ShowAllHouseDuplicate();
                break;
            case 6:
                ShowAllRoomDuplcate();
                break;
            case 7:
                displayMainMenu();
                break;
            case 8:
                System.exit(0);
                break;
            default:
                System.out.println("Fail, Input Again");
                displayMainMenu();
                break;
        }
    }
    
    private void ShowAllRoomDuplcate() {
        ArrayList<RoomService> room = RoomCSV.getFileCSVToRoomList();
        TreeSet<RoomService> roomTree = new TreeSet<>();
        for (RoomService roomService : room) {
            roomTree.add(roomService);
        }
        System.out.println(roomTree); 
        displayMainMenu();
    }

    private void ShowAllHouseDuplicate() {
        ArrayList<HouseService> house = HouseCSV.getFileCSVToHouseList();
        TreeSet<HouseService> houseTree = new TreeSet<>();
        for (HouseService houseService : house) {
            houseTree.add(houseService);
        }
        System.out.println(houseTree); 
        displayMainMenu();
    }

    private void ShowAllVillaDuplicate() {
        ArrayList<VillaService> villas = VillaCSV.getFileCSVToVillaList();
        TreeSet<VillaService> villaTree = new TreeSet<>();
        for (VillaService villa : villas) {
            villaTree.add(villa);
        }
        System.out.println(villaTree); 
        displayMainMenu();
    }

    public void addNewCustommer() {
        AddCustomer addCustomer = new AddCustomer();
        addCustomer.addCustomer();
    }
    public void showInformationCustomer(){
        ShowCustomer showCustomer = new ShowCustomer();
        showCustomer.showAllCustomer();
        System.out.println("Enter to back the main menu");
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        displayMainMenu();
    }

    public void addNewBooking(){
            ShowCustomer showCustomer = new ShowCustomer();
            AddBooking addBooking = new AddBooking();
            NewBooking newBooking = new NewBooking();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Choose booking type:");
            System.out.println("1.Booking Villa");
            System.out.println("2.Booking House");
            System.out.println("3.Booking Room");
            System.out.println("4.Back to main menu");
            int input = Integer.parseInt(scanner.nextLine());
            switch(input){
                case 1: 
                    System.out.println("The list Customer is: ");
                    showCustomer.showAllCustomer();
                    System.out.println("The list Villa is");
                    newBooking.bookingVilla();
                    addBooking.addBookingVilla();
                    break;
                case 2: 
                    System.out.println("The list Customer is: ");
                    showCustomer.showAllCustomer();
                    System.out.println("The list House is");
                    newBooking.bookingHouse();
                    addBooking.addBookingHouse();
                    break;
                case 3:
                    System.out.println("The list Customer is: ");
                    showCustomer.showAllCustomer();
                    System.out.println("The list Room is");
                    newBooking.bookingRoom();
                    addBooking.addBookingRoom();
                    break;
                case 4: 
                    displayMainMenu();
                    break;
                default:
                    System.out.println("Fail");
            }
        
    }

    public static void main(String[] args) {
        MainController mainController = new MainController();
        mainController.displayMainMenu();
    }
}
    