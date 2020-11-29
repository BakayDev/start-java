package lesson2;

public class Days {
    public static void main(String[] args) {
        int days = 365;
        int year = days / 365;
        int month = (days % 365) / 31;
        int leftDays = days - year * 365 - month * 31;
        System.out.println("Sum days: " + days);
        System.out.println("Sum years: " + year);
        System.out.println("Sum mouth: " + month);
        System.out.println("leftdays: " + leftDays);
    }
}
