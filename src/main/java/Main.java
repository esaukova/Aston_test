import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        HelloService helloService = new HelloService();
        helloService.returnHello();

        NameService nameService = new NameService();
        System.out.println(nameService.returnName());

        ArrayService arrayService = new ArrayService();
        arrayService.returnNums();

    }
}

