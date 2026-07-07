package exercicios;
import java.util.Scanner;

public class calculaAreaQuadrado {
    public static void main(String[] args) {
        try (var scanner = new Scanner(System.in)) {
            System.out.println("Informe o lado do quadrado a ser calculado a área:");
            var lado = scanner.nextInt();
            var area = lado * lado;
            System.out.printf("A área do quadrado com o lado %s é %s", lado, area);
        }
    }
}
