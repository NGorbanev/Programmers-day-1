import java.util.Scanner;
import java.util.Arrays;

public class Praktikum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год:");
        int year = scanner.nextInt();

        if (isLeapYear(year)) {
            // здесь нужно вывести результат
            // В не високосный год он выпадает на 13 сентября, в високосный — на 12 сентября.
            System.out.println("12.09." + year);
        } else {
            System.out.println("13.09." + year);
        }
    }

    public static boolean isLeapYear(int year) {
        // здесь нужно определить, является ли переданный год високосным
        if (year % 400 == 0){
           return true;
        } else if (year % 100 == 0){
            return false;
        } else if (year % 4 == 0) {
            return true;
        }
        return false;
    }
} 