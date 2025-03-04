import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class PhoneBook {

    // Используем HashMap для хранения фамилий и списка телефонов
    private final Map<String, List<String>> phoneBook;

    // Конструктор
    public PhoneBook() {
        phoneBook = new HashMap<>();
    }

    // Метод для добавления записи (фамилия, телефон)
    public void add(String lastName, String phoneNumber) {
        // Если фамилия уже есть в справочнике, добавляем новый телефон в список
        if (!phoneBook.containsKey(lastName)) {
            phoneBook.put(lastName, new ArrayList<>());
        }
        phoneBook.get(lastName).add(phoneNumber);
    }

    // Метод для получения списка номеров по фамилии
    public List<String> get(String lastName) {
        // Возвращаем список телефонов для фамилии, если он существует
        return phoneBook.getOrDefault(lastName, new ArrayList<>());
    }

    // Метод для печати всех записей в справочнике (для отладки)
    public void printAll() {
        for (Map.Entry<String, List<String>> entry : phoneBook.entrySet()) {
            System.out.println("Фамилия: " + entry.getKey() + ", Телефоны: " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        // Пример использования телефонного справочника
        PhoneBook phoneBook = new PhoneBook();

        // Добавляем записи
        phoneBook.add("Иванов", "123-456-789");
        phoneBook.add("Иванов", "987-654-321");
        phoneBook.add("Петров", "555-555-555");
        phoneBook.add("Сидоров", "111-222-333");
        phoneBook.add("Петров", "444-555-666");

        // Получаем телефоны по фамилии
        System.out.println("Телефоны Иванов: " + phoneBook.get("Иванов"));
        System.out.println("Телефоны Петров: " + phoneBook.get("Петров"));
        System.out.println("Телефоны Сидоров: " + phoneBook.get("Сидоров"));
        System.out.println("Телефоны несуществующей фамилии: " + phoneBook.get("Смирнов"));

        // Печать всех записей в справочнике
        System.out.println("\nВсе записи справочника:");
        phoneBook.printAll();
    }
}