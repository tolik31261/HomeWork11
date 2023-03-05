import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        task1();
    }

    public static int checkYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год високосный.");
        } else {
            System.out.println(year + " год не високосный.");
        }
        return year;
    }
    public static void task1() {
        System.out.println("Задача 1");
        int year = checkYear(2021);
    }

}
