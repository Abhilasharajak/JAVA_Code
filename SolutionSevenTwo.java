<<<<<<< HEAD
import java.util.*;
public class SolutionSevenTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimal = sc.nextInt();
        String octal = convertToOctal(decimal);
        System.out.println("Octal representation: " + octal);
        sc.close();
    }

    public static String convertToOctal(int decimal) {
        StringBuilder octal = new StringBuilder();
        while (decimal > 0) {
            octal.insert(0, decimal % 8);
            decimal = decimal / 8;
        }
        return octal.toString();

    }
}
=======
import java.util.*;
public class SolutionSevenTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimal = sc.nextInt();
        String octal = convertToOctal(decimal);
        System.out.println("Octal representation: " + octal);
        sc.close();
    }

    public static String convertToOctal(int decimal) {
        StringBuilder octal = new StringBuilder();
        while (decimal > 0) {
            octal.insert(0, decimal % 8);
            decimal = decimal / 8;
        }
        return octal.toString();

    }
}
>>>>>>> 47cff0662cc93605fa9a9bf6966888c1950d813b
