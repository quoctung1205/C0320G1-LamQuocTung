package CaseStudy2.Controller;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

import CaseStudy2.Common.CustomerCSV;
import CaseStudy2.Model.Customer.Customer;

public class AddCustomer {
    private ArrayList<Customer> listCustomers = new ArrayList<Customer>();
    public void addCustomer(){
        String NAME_PATTERN = "^[A-Z][a-z]+$";
        MainController mainController = new MainController();
        listCustomers = CustomerCSV.getFileCSVToCustomerList();
        Scanner scanner = new Scanner(System.in);
        Customer customer =  new Customer() {
        };
        try {
            System.out.println("Add Name Customer");
            String inputName = scanner.nextLine();
            Pattern.matches(NAME_PATTERN, inputName);
            customer.setNameCustomer(inputName);
        } catch (Exception e) {
            System.out.println("Customer Name must capitalize the first character in each word");
        }
        System.out.println("Add day of birth");
        customer.setDayOfBirth(scanner.nextLine());
        System.out.println("Add Sex");
        customer.setSex(scanner.nextLine());
        System.out.println("Add CMND");
        customer.setCmnd(Integer.parseInt(scanner.nextLine()));
        System.out.println("Add Phone Number");
        customer.setPhoneNumber(Integer.parseInt(scanner.nextLine()));
        System.out.println("Add Email");
        customer.setEmail(scanner.nextLine());
        System.out.println("Add Type Customer");
        customer.setTypeCustomer(scanner.nextLine());
        System.out.println("Add Address");
        customer.setAddress(scanner.nextLine());
        // System.out.println("Add Service");
        // customer.setService(scanner.nextLine());
        listCustomers.add(customer);
        CustomerCSV.writeCustomerToFileCSV(listCustomers);
        System.out.println("Add complete, press Enter to continue");
        scanner.nextLine();
        mainController.displayMainMenu();
    }
    
}