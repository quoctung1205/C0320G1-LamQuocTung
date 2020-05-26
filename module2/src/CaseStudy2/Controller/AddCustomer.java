package CaseStudy2.Controller;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

import CaseStudy2.Common.CustomerCSV;
import CaseStudy2.Exception.BirthDayException;
import CaseStudy2.Exception.EmailException;
import CaseStudy2.Exception.GenderException;
import CaseStudy2.Exception.IdCardException;
import CaseStudy2.Exception.NameException;
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
        while (true) {
            try {
                System.out.print("Enter Name Customer (Format Abc Abc): ");
                String nameCustomer = NameException.nameException(scanner.nextLine());
                customer.setNameCustomer(nameCustomer);
                break;
            } catch (Exception m) {
                System.out.println(m);
            }
        }
        
        while (true) {
            try {
                System.out.print("Enter Id Card (Format XXX XXX XXX): ");
                String idCard = IdCardException.idCardException(scanner.nextLine());
                customer.setIdCard(idCard);
                break;
            } catch (Exception m) {
                System.out.println(m);
            }
        }
        while (true) {
            try {
                System.out.print("Enter Birthday Customer (Format dd/MM/yyyy): ");
                String birthdayCustomer = BirthDayException.birthdayException(scanner.nextLine());
                customer.setDayOfBirth(birthdayCustomer);
                break;
            } catch (Exception m) {
                System.out.println(m);
            }
        }

        while (true) {
            try {
                System.out.print("Enter Gender (male, female, unknown): ");
                String genderCustomer = GenderException.genderException(scanner.nextLine());
                customer.setSex(genderCustomer);
                break;
            } catch (Exception m) {
                System.out.println(m);
            }
        }


        System.out.print("Enter Phone: ");
        customer.setPhoneNumber(Integer.parseInt(scanner.nextLine()));

        while (true) {
            try {
                System.out.print("Enter Email (Format abc@abc.abc): ");
                String emailCustomer = EmailException.emailException(scanner.nextLine());
                customer.setEmail(emailCustomer);
                break;
            } catch (Exception m) {
                System.out.println(m);
            }
        }


        System.out.print("Enter Type Customer: ");
        customer.setTypeCustomer(scanner.nextLine());

        System.out.print("Enter Address: ");
        customer.setAddress(scanner.nextLine());
        System.out.println("------------------------------------------------");
        listCustomers.add(customer);
        CustomerCSV.writeCustomerToFileCSV(listCustomers);
        System.out.println("Add complete, press Enter to continue");
        scanner.nextLine();
        mainController.displayMainMenu();
    }
    
}