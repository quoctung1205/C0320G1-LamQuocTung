package CaseStudy2.Common;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import CaseStudy2.Model.Service;
import CaseStudy2.Model.Customer.Customer;

public class CustomerCSV {
    private static final String COMMA_DELIMITER=",";
    private static final String NEW_LINE_SEPERATOR="\n";
    private static final String fileCustomer="/home/tungdz/Documents/codegym/C0320G1-LamQuocTung/module2/src/CaseStudy2/Data/Customer.csv";
    //file Header CSV
    private static final String FILE_HEAD_VILLA="Name,Day of Birth, sex, cmnd, Phone number, Email, Type Customer, Address, Service";


    public static void writeCustomerToFileCSV(ArrayList<Customer> listCustomers){
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(fileCustomer);
            fileWriter.append(FILE_HEAD_VILLA);
            fileWriter.append(NEW_LINE_SEPERATOR);
            for(Customer customer: listCustomers){
                fileWriter.append(customer.getNameCustomer());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(customer.getDayOfBirth());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(customer.getSex());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(Integer.toString(customer.getCmnd()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(Integer.toString(customer.getPhoneNumber()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(customer.getEmail());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(customer.getTypeCustomer());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(customer.getAddress());
                fileWriter.append(COMMA_DELIMITER);
                //fileWriter.append(customer.getService());
                fileWriter.append(NEW_LINE_SEPERATOR);
            }
        } catch (Exception e) {
            System.out.println("Error in CSV Writer");
        }
        finally{
            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (Exception e) {
                System.out.println("Error when flush and close");
            }
        }
    }
    public static ArrayList<Customer> getFileCSVToCustomerList() {
        BufferedReader br = null;
        ArrayList<Customer> listCumtomers = new ArrayList<Customer>();
        Path Path = Paths.get(fileCustomer);
        if(!Files.exists(Path)) {
            try {
                Writer writer = new FileWriter(fileCustomer);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        try {
            String Line;
            br = new BufferedReader(new FileReader(fileCustomer));
            while((Line = br.readLine())!= null){
                String[] splitData = Line.split(",");
                if(splitData[0].equals("Name")){
                    continue;
                }
                Customer customer = new Customer() {
                };
                customer.setNameCustomer(splitData[0]);
                customer.setDayOfBirth(splitData[1]);
                customer.setSex(splitData[2]);
                customer.setCmnd(Integer.parseInt(splitData[3]));
                customer.setPhoneNumber(Integer.parseInt(splitData[4]));
                customer.setEmail(splitData[5]);
                customer.setTypeCustomer(splitData[6]);
                customer.setAddress(splitData[7]);
                //customer.setService(splitData[8]);
                listCumtomers.add(customer);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            // System.out.println("Hello");
        }
        finally{
            try {
                br.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return listCumtomers;
    }
}