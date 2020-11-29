package lesson2;

import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input int seconds: ");
        int seconds = in.nextInt();
        int minutes = seconds / 60;
        int days = seconds / 86400;
        int hours = seconds / 3600;
        System.out.printf("%d : days in %d hours: \n", days, hours);
        System.out.printf("%d : hours in %d minutes: \n", hours, minutes);
        System.out.printf("%d : minutes in %d seconds: \n", minutes, seconds);
    }
}
