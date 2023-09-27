import java.util.Scanner;
public class NameService {
    public String returnName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String name = scanner.nextLine();
        String nameToBeEqualTo = "Вячеслав";

        if (name.equals(nameToBeEqualTo)) {
            return ("Привет, Вячеслав");
        }
        return ("Нет такого имени");

    }
}
