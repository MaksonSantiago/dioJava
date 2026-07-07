package exercicios;
import java.util.Scanner;

public class ordemDecrescente {
    public static void main(String[] args) {
        try (var scanner = new Scanner(System.in)) {
            System.out.println("Escolha qual número vai ser mostrado:\n1. Par\n2. Ímpar\n");
            var typeNum = scanner.nextInt();
            while (typeNum != 1 && typeNum != 2) {
                System.out.println("Escolha uma opção válida:\n1. Par\n2. Ímpar\n");
                typeNum = scanner.nextInt();
            }
            System.out.println("Informe o primeiro número:");
            var num1  = scanner.nextInt();
            System.out.println("Informe um segundo número maior que o anterior:");
            var num2 = scanner.nextInt();
            while (num2 <= num1) {
                System.out.println("Informe um número maior:");
                num2 = scanner.nextInt();
            }
            System.out.println("=================================");
            if (typeNum == 1) {
                for (var i = num2; i >= num1; i--) {
                    if (i % 2 == 0) {
                        System.out.printf("%s\n", i);
                    }
                }
            } else {
                for (var i = num2; i >= num1; i--) {
                    if (i % 2 != 0){
                        System.out.printf("%s\n", i);
                    }
                }
            }
        }
    }
}
