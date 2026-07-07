package exercicios;
import java.util.Scanner;

public class gerarTabuada {
    public static void main(String[] args) {
        try (var scanner = new Scanner(System.in)) {
            System.out.println("Informe um número:");
            var num = scanner.nextInt();
            System.out.printf("Tabuada do número %s:\n", num);
            for (var i = 1; i < 11; i++) {
                System.out.printf("%s x %s = %s\n", num, i, num * i);
            }
        }
    }
}
