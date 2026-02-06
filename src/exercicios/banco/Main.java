package exercicios.banco;
import java.util.Scanner;

public class Main {

    private final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Conta conta = new Conta();    
        int opcao;

        System.out.println("=============  BEM-VINDO  =============");
        conta.criarConta(scanner);
        do{
            System.out.println("Informe qual ação deseja:\n1: Consultar saldo\n2: Depositar dinheiro\n3: Consultar cheque especial\n4: Sacar dinheiro\n5: Pagar um boleto\n6: Verificar se a conta está usando cheque especial\n7: Sair");
            opcao = scanner.nextInt();
            switch (opcao) {
            case 1:
                conta.consultarSaldo();
                break;
            case 2:
                conta.depositarDinheiro(scanner);
                break;
            case 3:
                conta.consultarCheque();
                break;
            case 4:
                conta.sacarDinheiro(scanner);
                break;
            case 5:
                conta.pagarBoleto(scanner);
                break;
            case 6:
                conta.consultarUsoCheque();
                break;
            default:
                break;
        }
        } while(opcao != 7);
    }
}
