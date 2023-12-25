package Execise1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nВыберите действие:");
            System.out.println("1. Добавить товар");
            System.out.println("2. Удалить товар");
            System.out.println("3. Проверить наличие товара");
            System.out.println("4. Показать инвентарь");
            System.out.println("0. Выйти");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Введите имя товара для добавления: ");
                    String addItemName = scanner.nextLine();
                    inventory.addItem(addItemName);
                    break;

                case 2:
                    System.out.print("Введите имя товара для удаления: ");
                    String removeItemName = scanner.nextLine();
                    inventory.removeItem(removeItemName);
                    break;

                case 3:
                    System.out.print("Введите имя товара для проверки наличия: ");
                    String checkItemName = scanner.nextLine();
                    inventory.checkItemAvailability(checkItemName);
                    break;

                case 4:
                    inventory.displayInventory();
                    break;

                case 0:
                    System.out.println("Выход из программы.");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Неверный выбор. Попробуйте снова.");
            }
        }
    }
}
