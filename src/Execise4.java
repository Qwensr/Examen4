import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Execise4 {
    public static void main(String[] args) {
        Map<String, String> dictionary = new HashMap<>();

        dictionary.put("phone", "телефон");
        dictionary.put("pencil", "карандащ");
        dictionary.put("animal", "животное");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Список слов: \nphone\npencil\nanimal");
        System.out.print("Введите слово на английском: ");
        String wordEnglish = scanner.nextLine();
        scanner.close();

        String translation = translation(dictionary, wordEnglish);
        if (translation != null) {
            System.out.println("Перевод слова '" + wordEnglish + "': " + translation);
        } else {
            System.out.println("Перевод для слова '" + wordEnglish + "' не найден.");
        }
    }

    private static String translation(Map<String, String> dictionary, String englishWord) {
        return dictionary.get(englishWord);
    }
    }

