import java.util.Scanner;
public class HelloService {
    public void returnHello() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int num = scanner.nextInt();
        int moreThanThisNum = 7;
        if (num > moreThanThisNum) {
            System.out.println("Привет");
        }

    }
}



