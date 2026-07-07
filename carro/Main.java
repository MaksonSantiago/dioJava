package exercicios.carro;
import java.util.Scanner;

public class Main {
    /* Scanner para solicitar input para o usuário "private final static" 
    utilizado para ter acesso ao scanner em outras classes */
    private final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Carro carro = new Carro();
        int opcao;
        do {
            System.out.println("================================");
            System.out.println("PAINEL DO CARRO");
            System.out.println("Selecione a ação que deseja:");
            System.out.println("1. Ligar/Desligar carro\n2. Trocar de marcha\n3. Acelerar\n4. Diminuir velocidade\n5. Virar para esquerda/direita\n6. Verificar velocidade\n7. Sair");
            opcao = scanner.nextInt();
            switch(opcao) {
                case 1:
                    carro.ligarDesligarCarro();
                    break;
                case 2:
                    carro.passarMarcha();
                    break;
                case 3:
                    carro.acelerarCarro();
                    break;
                case 4:
                    carro.diminuirVelocidade();
                    break;
                case 5:
                    carro.virarDirecao();
                    break;
                case 6:
                    carro.verificarVelocidade();
                    break;
            }
        } while(opcao != 7);
    }
}
