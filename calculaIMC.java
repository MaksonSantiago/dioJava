package exercicios;
import java.util.Scanner;

public class calculaIMC {
    public static void main(String[] args) {
        try (var scanner = new Scanner(System.in)) {
            System.out.println("Insira seu peso:");
            var kg = scanner.nextFloat();
            System.out.println("Insira sua altura:");
            var meter = scanner.nextFloat();
            var imc = kg / (meter * meter);
            if (imc <= 18.5) {
                System.out.println("Tripa seca");
            }
            else if (imc >= 18.6 && imc <= 24.9) {
                System.out.println("Tá massa");
            }
            else if (imc >= 25.0 && imc <= 29.9) {
                System.out.println("Tá ficando gordo boy");
            }
            else if (imc >= 30.0 && imc <= 34.9) {
                System.out.println("Tá ruim, mas da pra ajeitar");
            }
            else if (imc >= 35.0 && imc <= 39.9) {
                System.out.println("Jajá vira um planeta");
            }
            else {
                System.out.println("Meu fi já tá com a própria órbita");
            }
        }
    }
}
