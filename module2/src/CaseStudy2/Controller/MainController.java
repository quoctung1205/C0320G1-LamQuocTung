package CaseStudy2.Controller;

import java.util.ArrayList;
import java.util.Scanner;

import CaseStudy2.Common.VillaCSV;
import CaseStudy2.Model.VillaService;
import CaseStudy2.Model.Customer.Customer;
import sun.applet.Main;

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
                //addNewBooking();
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
                break;
            case 2:
                showAll.showAllHouse();;
                break;
            case 3:
                showAll.showAllRoom();
                break;
            case 4:
                //ShowAllVillaDuplicate();
                break;
            case 5:
                //ShowAllHouseDuplicate();
                break;
            case 6:
                //ShowAllRoomDuplcate();
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
    public void addNewCustommer(){
        AddCustomer addCustomer = new AddCustomer();
        addCustomer.addCustomer();
    }
    public void showInformationCustomer(){
        ShowCustomer showCustomer = new ShowCustomer();
        showCustomer.showAllCustomer();
    }

    public static void main(String[] args) {
        MainController mainController = new MainController();
        mainController.displayMainMenu();
    }
}
    