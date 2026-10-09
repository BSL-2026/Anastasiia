package main;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.next();
        String surname = scanner.next();
        int day = scanner.nextInt();
        int month = scanner.nextInt();
        int year = scanner.nextInt();

        LocalDate date = LocalDate.of(year, month, day);
        int age = Period.between(date, LocalDate.now()).getYears();

        System.out.printf(
                "%s %s born on %s %d %s %d and is %d  years old%n",
                name,
                surname,
                date.getDayOfWeek(),
                date.getDayOfMonth(),
                date.getMonth(),
                date.getYear(),
                age
        );
    }
}
