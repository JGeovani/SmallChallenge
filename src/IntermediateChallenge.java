import java.util.Scanner;

public class IntermediateChallenge {

    public static int convertHexToDecimal(String hex) {
        return Integer.parseInt(hex, 16);
    }

    public static void main(String args[]) throws NumberFormatException {
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();
        String[] hexadecimalsAux = new String[amount];
        int[] decimals = new int[amount];

        for (int i = 0; i < amount; i++) {
            hexadecimalsAux[i] = scanner.next();
        }
        scanner.close();

        System.out.println(amount);
        for (int i = 0; i < amount; i++) {
            if (hexadecimalsAux[i] != null) {
                try {
                    decimals[i] = convertHexToDecimal(hexadecimalsAux[i]);
                } catch (Exception ex) {
                }
            }
            System.out.println(decimals[i]);
        }
    }
}
