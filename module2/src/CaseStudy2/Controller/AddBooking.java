package CaseStudy2.Controller;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

import CaseStudy2.Common.BookingCSV;
import CaseStudy2.Common.CustomerCSV;
import CaseStudy2.Model.VillaService;
import CaseStudy2.Model.Customer.BookingService;
import CaseStudy2.Model.Customer.Customer;

public class AddBooking {
    private ArrayList<BookingService> listBooking = new ArrayList<BookingService>();
    String NAME_PATTERN = "^[A-Z][a-z]+$";
    boolean check = true;
    public void addBookingVilla(){
        String ID_PATTERN = "^SVVL-[0-9]{4}$";
        MainController mainController = new MainController();
        listBooking = BookingCSV.getFileCSVToBookingList();
        Scanner scanner = new Scanner(System.in);
        BookingService bookingService = new BookingService();
        do{
            System.out.println("Add name customer");
            String inputName = scanner.nextLine();
            if(Pattern.matches(NAME_PATTERN, inputName)){
                bookingService.setNameCustomer(inputName);
                check = false;
            }else{
                System.out.println("Invalid,Please Input Again");
            }
        }while(check);
        check = true;


        do{
            System.out.println("Add ID Service");
            String inputId = scanner.nextLine();
            if(Pattern.matches(ID_PATTERN, inputId)){
                bookingService.setId(inputId);
                check = false;
            }else{
                System.out.println("Invalid,Please Input Again");
            }
        }while(check);
        check = true;
            

        listBooking.add(bookingService);
        BookingCSV.writeBookingToFileCSV(listBooking);
        System.out.println("Add success");
        mainController.displayMainMenu();
    }

    public void addBookingHouse(){
        String ID_PATTERN = "^SVHO-[0-9]{4}$";
        MainController mainController = new MainController();
        listBooking = BookingCSV.getFileCSVToBookingList();
        Scanner scanner = new Scanner(System.in);
        BookingService bookingService = new BookingService();
        do{
            System.out.println("Add name customer");
            String inputName = scanner.nextLine();
            if(Pattern.matches(NAME_PATTERN, inputName)){
                bookingService.setNameCustomer(inputName);
                check = false;
            }else{
                System.out.println("Invalid,Please Input Again");
            }
        }while(check);
        check = true;


        do{
            System.out.println("Add ID Service");
            String inputId = scanner.nextLine();
            if(Pattern.matches(ID_PATTERN, inputId)){
                bookingService.setId(inputId);
                check = false;
            }else{
                System.out.println("Invalid,Please Input Again");
            }
        }while(check);
        check = true;
            

        listBooking.add(bookingService);
        BookingCSV.writeBookingToFileCSV(listBooking);
        System.out.println("Add success");
        mainController.displayMainMenu();
    }

    public void addBookingRoom(){
        String ID_PATTERN = "^SVRO-[0-9]{4}$";
        MainController mainController = new MainController();
        listBooking = BookingCSV.getFileCSVToBookingList();
        Scanner scanner = new Scanner(System.in);
        BookingService bookingService = new BookingService();
        do{
            System.out.println("Add name customer");
            String inputName = scanner.nextLine();
            if(Pattern.matches(NAME_PATTERN, inputName)){
                bookingService.setNameCustomer(inputName);
                check = false;
            }else{
                System.out.println("Invalid,Please Input Again");
            }
        }while(check);
        check = true;


        do{
            System.out.println("Add ID Service");
            String inputId = scanner.nextLine();
            if(Pattern.matches(ID_PATTERN, inputId)){
                bookingService.setId(inputId);
                check = false;
            }else{
                System.out.println("Invalid,Please Input Again");
            }
        }while(check);
        check = true;
            

        listBooking.add(bookingService);
        BookingCSV.writeBookingToFileCSV(listBooking);
        System.out.println("Add success");
        mainController.displayMainMenu();
    }
}