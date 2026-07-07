package exercicios;
import java.util.Scanner;

public class impressaoImpar {
    public static void main(String[] args) {
        try (var scanner = new Scanner(System.in)) {
            System.out.println("Digite um número:");
            var num1 = scanner.nextInt();
            int num2;
            do {
                do {
                    System.out.println("Informe outro número:");
                    num2 = scanner.nextInt();
                } while (num2 < num1);
            } while (num2 % num1 == 0);
            System.out.printf("%s", num2 % num1);
        }
    }
}
