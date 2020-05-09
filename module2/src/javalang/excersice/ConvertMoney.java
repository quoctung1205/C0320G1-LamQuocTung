package javalang.excersice;

import java.util.Scanner;

public class ConvertMoney {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input money");
        int usd = Integer.parseInt(scanner.nextLine());
        int vnd = usd * 23000;
        System.out.printf("%s USD covert to %s VND",usd,vnd);
    }
}
