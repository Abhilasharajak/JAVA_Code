<<<<<<< HEAD
import java.util.Scanner;

public class SolutionSevenOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimal = sc.nextInt();
        String binary = convertToBinary(decimal);
        System.out.println("Binary representation: " + binary);
        sc.close();
    }

    public static String convertToBinary(int decimal) {
        StringBuilder binary = new StringBuilder();
        while (decimal > 0) {
            binary.insert(0, decimal % 2);
            decimal = decimal / 2;
        }
        return binary.toString();

    }

}
=======
import java.util.Scanner;

public class SolutionSevenOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimal = sc.nextInt();
        String binary = convertToBinary(decimal);
        System.out.println("Binary representation: " + binary);
        sc.close();
    }

    public static String convertToBinary(int decimal) {
        StringBuilder binary = new StringBuilder();
        while (decimal > 0) {
            binary.insert(0, decimal % 2);
            decimal = decimal / 2;
        }
        return binary.toString();

    }

}
>>>>>>> 47cff0662cc93605fa9a9bf6966888c1950d813b
