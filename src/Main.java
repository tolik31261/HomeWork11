import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
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

    public static void task2() {
        System.out.println("Задача 2");
        int year = 2025;
        installSystem(2022);
    }

    public static void installSystem(int clientDeviceYear) {
        int clientOs = 0;
        int currentYear = LocalDate.now().getYear();
        if (clientDeviceYear > currentYear && clientOs == 0) {
            System.out.println("Установите обычную версию приложения для iOS по ссылке.");
        } else if (clientDeviceYear < currentYear && clientOs == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
        } else if (clientDeviceYear > currentYear && clientOs == 1) {
            System.out.println("Установите обычную версию для Android по ссылке.");
        } else if (clientDeviceYear < currentYear && clientOs == 1) {
            System.out.println("Установите облегченную версию для Android по ссылке.");
        } else {
            System.out.println("Ваша операционная система не поддерживается.");
        }
    }

}
