package exercicios.banco;

import java.util.Scanner;

public class Conta {
    double saldo;
    double valorCheque;
    double valorDepositar;
    double valorSacar;
    boolean chequeUsado = false;
    double valorChequeUsado;
    double dividaTotal;

    public void criarConta(Scanner scanner){
        System.out.println("Para criar a conta, informe o valor a ser depositado:");
        valorDepositar = scanner.nextDouble();
        if (valorDepositar <= 500.0){
        valorCheque = 50.0;
        } else{
            valorCheque = valorDepositar / 2;
        }
        saldo = valorDepositar;
    }
    public void consultarSaldo(){
        if (chequeUsado == true) saldo = 0;
        System.out.printf("O saldo atual da conta é: R$%s\n", saldo);
        System.out.println("=========================\n");
    }
    public void depositarDinheiro(Scanner scanner){
        System.out.println("Qual o valor para depositar?");
        valorDepositar = scanner.nextDouble();
        if (chequeUsado == false) {
            saldo += valorDepositar;
            System.out.printf("Valor de R$%s depositado com sucesso.\n", valorDepositar);
            System.out.println("=========================\n");
        } else {
            double taxa = valorChequeUsado * 0.20;
            dividaTotal = valorChequeUsado + taxa;
            if (valorDepositar >=  dividaTotal) {
                saldo = valorDepositar - dividaTotal;
                chequeUsado = false;
                valorChequeUsado = 0;
                System.out.println("Débito quitado!");
            } else {
                dividaTotal -= valorDepositar;
                System.out.printf("Débito restante de R$%s.", dividaTotal);
            }
        }
    }
    public void consultarCheque(){
        System.out.printf("Valor do cheque especial é R$%s\n", valorCheque);
    }
    public void sacarDinheiro(Scanner scanner){
        System.out.println("Qual o valor a ser sacado?");
        valorSacar = scanner.nextDouble();
        if( saldo > 0 && valorSacar <= saldo + valorCheque) {
            if (valorSacar > saldo) {
                chequeUsado = true;
                valorChequeUsado = valorChequeUsado + (valorSacar - saldo);
            }
            saldo -= valorSacar;
            System.out.printf("Valor sacado com sucesso.\n");
            System.out.println("=========================\n");
        } else{
            System.out.println("Valor acima do disponível para saque, consulte seu saldo.");
            System.out.println("=========================\n");
        }
    }
    public void pagarBoleto(Scanner scanner) {
        
    }
    public void consultarUsoCheque() {
        if (chequeUsado == true) {
            System.out.printf("o valor usado do cheque especial é R$%s.\n", valorChequeUsado);
            System.out.println("=========================\n");
        } else {
            System.out.println("Não foi usado o cheque especial.");
            System.out.println("=========================\n");
        }
    }

}
