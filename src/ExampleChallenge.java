import java.util.Scanner;

public class ExampleChallenge {
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int userNum = scanner.nextInt();
        if (isEven(userNum)) {
            System.out.println("Par");
        } else {
            System.out.println("Impar");
        }
    }

}
