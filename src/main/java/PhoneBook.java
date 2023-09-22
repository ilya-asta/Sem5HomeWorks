import java.sql.SQLOutput;
import java.util.Scanner;

public class PhoneBook {
    public static void main(String[] args) {
        PhoneBookA phoneBook = new PhoneBookA();
        phoneBook.add("123456789", "Алиса");
        phoneBook.add("987654321", "Иван");
        phoneBook.add("456789123", "Владимир");
        phoneBook.add("321654987", "Давид");
        phoneBook.add("789123456", "Алексадра");
        phoneBook.add("654987321", "Сергей");
        phoneBook.add("234567891", "Иван");
        phoneBook.add("876543219", "Пётр");
        phoneBook.add("345678912", "Александра");
        phoneBook.add("432165498", "Андрей");
        phoneBook.add("876543219", "Степан");
        phoneBook.add("234567891", "Сергей");
        phoneBook.add("654907321", "Владимир");
        phoneBook.add("435455423", "Владимир");
        phoneBook.add("789123446", "Викторя");
        phoneBook.add("321654987", "Давид");
        phoneBook.add("321654987", "Виталий");
        phoneBook.add("321654987", "Виталий");
//        System.out.println(phoneBook.getPhoneNum());
//        System.out.println(phoneBook.getByName("Давид"));
        System.out.println(phoneBook.getAll());
//        System.out.println(phoneBook.deleteContact());
//        System.out.println(phoneBook.getAll());

        Scanner in = new Scanner(System.in);
        System.out.println("1 поиск по номеру\n 2 поиск по имени \n 3 показать все контакты по количеству номеров \n 4 Удалить контакт");
        int num = in.nextInt();
        if (num == 1) {
            System.out.println(phoneBook.getPhoneNum());

        } else if (num == 2) {
            System.out.println(phoneBook.getByName());
        } else if (num == 3) {
            System.out.println(phoneBook.getAll());
        } else if (num == 4) {
            System.out.println(phoneBook.deleteContact());
        }



    }
}