package CaseStudy2.Model;

import java.util.Scanner;

public class MainService {
    public static void main(String[] args) {
       Scanner scanner =new Scanner(System.in);
       System.out.println("Choose type service:" 
            +" 01.Villa" + " 02.House" + " 03.Room");
        int input = Integer.parseInt(scanner.nextLine());
        switch(input){
            case 1: {
                VillaService villaService = new VillaService("01", "Villa", 20, 20000000, 10, "Year", "Vip", "Blow Job", 50,4);
                villaService.showInfo();
                break;
            }
            case 2: {
                HouseService houseService = new HouseService("02", "House", 15, 15000000, 8, "Year", "Bip", "Massage", 3);
                houseService.showInfo();
                break;
            }
            case 3: {
                RoomService roomService = new RoomService("03", "Room", 10, 10000000, 6, "Year", "Free Food");
                roomService.showInfo();
                break;
            }
            default: System.out.println("Fail");
        }
    }
}