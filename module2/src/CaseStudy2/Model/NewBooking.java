package CaseStudy2.Model;

import java.util.Scanner;

import CaseStudy2.Controller.MainController;
import CaseStudy2.Controller.ShowAll;
import CaseStudy2.Controller.ShowCustomer;

public class NewBooking {
    

    public static void bookingVilla() {
        ShowAll showAll = new ShowAll();
            showAll.showAllVilla();
    }
    public static void bookingHouse(){
        ShowAll showAll = new ShowAll();
            showAll.showAllHouse();
    }
    public static void bookingRoom(){
        ShowAll showAll = new ShowAll();
            showAll.showAllRoom();
    }
}