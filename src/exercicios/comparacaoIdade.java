package exercicios;
import java.time.OffsetDateTime;
import java.util.Scanner;

public class comparacaoIdade {
    public static  void main(String[] args) {
        try (var scanner = new Scanner(System.in)) {
            var baseYear = OffsetDateTime.now().getYear();
            System.out.println("Informe o nome da  primeira pessoa:");
            var name1  = scanner.next();
            System.out.println("Informe o ano de nascimento da primeira pessoa:");
            var year1 = scanner.nextInt();
            System.out.println("Informe o nome da segunda pessoa:");
            var name2 = scanner.next();
            System.out.println("Informe o ano de nascimento da segunda pessoa:");
            var year2 = scanner.nextInt();
            var age1 = baseYear - year1;
            var age2 = baseYear - year2;
            int ageDifference;
            if (age1 < age2) {
                ageDifference = age2 - age1;
            }
            else {
                ageDifference = age1 - age2;
            }
            System.out.printf("A idade de %s é %s, e a de %s é %s\n", name1, age1, name2, age2);
            System.out.printf("A diferença de idade do(a) %s e do(a) %s é %s", name1, name2, ageDifference);
        }
    }
}
