package CaseStudy2.Common;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import CaseStudy2.Model.Customer.BookingService;
import CaseStudy2.Model.Customer.Customer;

public class BookingCSV {
    private static final String COMMA_DELIMITER=",";
    private static final String NEW_LINE_SEPERATOR="\n";
    private static final String fileBooking="/home/tungdz/Documents/codegym/C0320G1-LamQuocTung/module2/src/CaseStudy2/Data/Booking.csv";
    //file Header CSV
    private static final String FILE_HEAD_VILLA="NameCustomer,ID Service";


    public static void writeBookingToFileCSV(ArrayList<BookingService> listBooking){
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(fileBooking);
            fileWriter.append(FILE_HEAD_VILLA);
            fileWriter.append(NEW_LINE_SEPERATOR);
            for(BookingService bookingService : listBooking){
                fileWriter.append(bookingService.getNameCustomer());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(bookingService.getId());
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
    public static ArrayList<BookingService> getFileCSVToBookingList() {
        BufferedReader br = null;
        ArrayList<BookingService> listBooking = new ArrayList<BookingService>();
        Path Path = Paths.get(fileBooking);
        if(!Files.exists(Path)) {
            try {
                Writer writer = new FileWriter(fileBooking);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        try {
            String Line;
            br = new BufferedReader(new FileReader(fileBooking));
            while((Line = br.readLine())!= null){
                String[] splitData = Line.split(",");
                if(splitData[0].equals("Name")){
                    continue;
                }
                BookingService bookingService= new BookingService() {
                };
                bookingService.setNameCustomer(splitData[0]);
                bookingService.setId(splitData[1]);
                
                listBooking.add(bookingService);
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
        return listBooking;
    }
}