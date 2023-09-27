import java.util.Scanner;
public class ArrayService {
    public void returnNums() {
        Scanner scanner = new Scanner(System.in);
        int sizeOfArray = 5; // задаём размер массива
        int[] array = new int[sizeOfArray];

        System.out.print("Введите " + sizeOfArray + " чисел через пробел: ");
        for (int i = 0; i < sizeOfArray; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Числа кратные 3: ");
        for (int i = 0; i < sizeOfArray; i++) {
            if (array[i] % 3 == 0) {
                System.out.print(array[i] + " ");
            }
        }
    }
}
