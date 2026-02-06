package exercicios;
import java.util.Scanner;

public class calculaAreaRetangulo {
    public static void main(String[] args) {
        try (var scanner = new Scanner(System.in)) {
            System.out.println("Informe a base do retângulo:");
            var base = scanner.nextInt();
            System.out.println("Informe a altura do retângulo:");
            var altura = scanner.nextInt();
            var area = base * altura;
            System.out.printf("A área do retângulo de base %s e altura %s é %s", base, altura, area);
        }
    }
    
}
