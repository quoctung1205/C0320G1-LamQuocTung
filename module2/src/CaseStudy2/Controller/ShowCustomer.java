package CaseStudy2.Controller;

import java.util.ArrayList;
import java.util.Scanner;

import CaseStudy2.Common.CustomerCSV;
import CaseStudy2.Model.Customer.Customer;

public class ShowCustomer {
    private ArrayList<Customer> listCustomer = new ArrayList<Customer>();
    public void showAllCustomer(){
        MainController mainController = new MainController();
        listCustomer = CustomerCSV.getFileCSVToCustomerList();
        for(Customer customer : listCustomer){
            System.out.println("-----------------");
            System.out.println("Name Customer: "+ customer.getNameCustomer());
            System.out.println("Day of birth: "+ customer.getDayOfBirth());
            System.out.println("Sex: "+ customer.getSex());
            System.out.println("Cmnd: "+ customer.getCmnd());
            System.out.println("Phone Number: "+ customer.getPhoneNumber());
            System.out.println("Email: "+ customer.getEmail());
            System.out.println("Type Customer: "+ customer.getTypeCustomer());
            System.out.println("Address: "+ customer.getAddress());
           // System.out.println("Service: "+ customer.getService();
            System.out.println("------------------");
        }
        System.out.println("Enter to back the main menu");
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        mainController.displayMainMenu();
    }
}