package javalang.excersice;

import java.util.Scanner;

public class showAlert {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your name");
        String yourName = scanner.nextLine();
        System.out.println("Hello " + yourName);
    }
}
