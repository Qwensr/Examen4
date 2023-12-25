package Execise2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первую строку чисел ");
        String input1 = scanner.nextLine();

        System.out.print("Введите вторую строку чисел ");
        String input2 = scanner.nextLine();

        Set<Integer> set1 = set(input1);
        Set<Integer> set2 = set(input2);

        set1.retainAll(set2);

        if (set1.isEmpty()) {
            System.out.println("Общих чисел нет.");
        } else {
            System.out.println("Общие числа: " + set1);
        }
    }

    private static Set<Integer> set(String input) {
        Set<Integer> numberSet = new HashSet<>();

        String[] numbers = input.split("\\s+");

        for (String numberStr : numbers) {
            if (isInteger(numberStr)) {
                int number = Integer.parseInt(numberStr);
                numberSet.add(number);
            } else {
                System.out.println("Ошибка при одинаковых  чисел: " + numberStr + ". Пропускаем.");
            }
        }

        return numberSet;
    }

    private static boolean isInteger(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
