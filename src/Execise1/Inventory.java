package Execise1;

import java.util.LinkedList;

public class Inventory {
    LinkedList<String> items;

    public Inventory() {
        this.items = new LinkedList<>();
    }

    public void addItem(String itemName) {
        if (items.contains(itemName)) {
            System.out.println("Товар с именем '" + itemName + "' уже существует.");
        } else {
            items.add(itemName);
            System.out.println("Товар '" + itemName + "' добавлен в инвентарь.");
        }
    }

    public void removeItem(String itemName) {
        if (items.remove(itemName)) {
            System.out.println("Товар '" + itemName + "' удален из инвентаря.");
        } else {
            System.out.println("Товар с именем '" + itemName + "' не найден.");
        }
    }

    public void checkItemAvailability(String itemName) {
        if (items.contains(itemName)) {
            System.out.println("Товар '" + itemName + "' есть в наличии.");
        } else {
            System.out.println("Товар с именем '" + itemName + "' отсутствует в инвентаре.");
        }
    }

    public void displayInventory() {
        if (items.isEmpty()) {
            System.out.println("Инвентарь пуст.");
        } else {
            System.out.println("Текущий инвентарь:");
            for (String item : items) {
                System.out.println(item);
            }
        }
    }
}


