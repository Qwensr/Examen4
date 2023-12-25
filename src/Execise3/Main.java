package Execise3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<User> userSet = new TreeSet<>();

        System.out.print("Введите количество пользователей: ");
        int numUsers = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numUsers; i++) {
            System.out.print("Введите имя пользователя " + (i + 1) + ": ");
            String name = scanner.nextLine();

            System.out.print("Введите возраст пользователя " + (i + 1) + ": ");
            int age = scanner.nextInt();
            scanner.nextLine();
            userSet.add(new User(name, age));
        }

        System.out.println("\nОтсортированный список пользователей:");
        for (User user : userSet) {
            System.out.println("Имя: " + user.getName() + ", Возраст: " + user.getAge());
        }
    }
}

