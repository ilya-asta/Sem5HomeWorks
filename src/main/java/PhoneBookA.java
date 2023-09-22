
import java.util.*;

public class PhoneBookA {
    private Map<String, List<String>> map = new HashMap<>();

    void add(String phoneNum, String name) {
        if (map.containsKey(name)) {
            List<String> phoneNumbers = map.get(name);
            phoneNumbers.add(phoneNum);
        } else {
            List<String> phoneNumbers = new ArrayList<>();
            phoneNumbers.add(phoneNum);
            map.put(name, phoneNumbers);
        }
    }

    String getPhoneNum() {
        Scanner in = new Scanner(System.in);
        System.out.println("Напишите номер телефона который хотите найти: ");
        String phoneNum = in.next();
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            List<String> phoneNumbers = entry.getValue();
            if (phoneNumbers.contains(phoneNum)) {
                stringBuilder.append(entry.getKey());
                stringBuilder.append(" : ");
                stringBuilder.append(entry.getValue());
                stringBuilder.append("\n");
            }
        }
        return stringBuilder.toString();

    }

    String getByName() {
        Scanner in = new Scanner(System.in);
        System.out.println("Напишите имя который хотите найти: ");
        String name = in.next();
        StringBuilder stringBuilder = new StringBuilder();
        if (map.containsKey(name)) {
            List<String> phoneNumbers = map.get(name);
            for (String phoneNumber : phoneNumbers) {
                stringBuilder.append(phoneNumber);
                stringBuilder.append(" : ");
                stringBuilder.append(name);
                stringBuilder.append("\n");
            }
        }
        return stringBuilder.toString();
    }

    String getAll() {
        StringBuilder stringBuilder = new StringBuilder();
        List<Map.Entry<String, List<String>>> entries = new ArrayList<>(map.entrySet());
        entries.sort((entry1, entry2) -> Integer.compare(entry2.getValue().size(), entry1.getValue().size()));
        for (Map.Entry<String, List<String>> entry : entries) {
            List<String> phoneNumbers = entry.getValue();
            stringBuilder.append(entry.getKey());
            stringBuilder.append(" : ");
            stringBuilder.append(phoneNumbers);
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    String deleteContact() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите имя пользователя для удаления: ");
        String name = in.next();
        StringBuilder stringBuilder = new StringBuilder();
        if (map.containsKey(name) == false) {
            System.out.println("Такого имени нет");
        }

        if (map.containsKey(name)) {
            List<String> phoneNumbers = map.remove(name);
            for (String phoneNumber : phoneNumbers) {
                stringBuilder.append(phoneNumber);
                stringBuilder.append(" : ");
                stringBuilder.append(name + " Удален");
                stringBuilder.append("\n");
            }
        }
        return stringBuilder.toString();
    }
}

