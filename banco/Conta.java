package exercicios.banco;

import java.util.Scanner;

public class Conta {
    // Variáveis utlizadas
    double saldo;
    double valorCheque;
    double valorDepositar;
    double valorSacar;
    boolean chequeUsado = false;
    double valorChequeUsado;
    double dividaTotal;
    double  valorBoleto;

    // Criação da conta bancária
    public void criarConta(Scanner scanner){
        System.out.println("Para criar a conta, informe o valor a ser depositado:");
        // Solicita o valor a ser depositado para criação da conta
        valorDepositar = scanner.nextDouble();
        // Verifica o vlor do primeiro depósito para definir o valor do cheque especial
        if (valorDepositar <= 500.0){
        valorCheque = 50.0;
        } else{
            valorCheque = valorDepositar / 2;
        }
        // Deposita o primeiro valor
        saldo = valorDepositar;
    }
    // Consulta valor disponível na conta
    public void consultarSaldo(){
        // Se a conta estiver utilizando o cheque especial, o valor do saldo é definido a 0
        if (chequeUsado == true) saldo = 0;
        System.out.printf("O saldo atual da conta é: R$%s\n", saldo);
        System.out.println("=========================\n");
    }
    // Deposita valor na conta bancária
    public void depositarDinheiro(Scanner scanner){
        System.out.println("Qual o valor para depositar?");
        // Solicita valor a ser depositado
        valorDepositar = scanner.nextDouble();
        // Caso não esteja utilizando o cheque especial
        if (chequeUsado == false) {
            // Valor é depositado
            saldo += valorDepositar;
            System.out.printf("\nValor de R$%s depositado com sucesso.\n", valorDepositar);
            System.out.println("=========================\n");
        } else {
            /* Caso seja utilizado o cheque, 
            é adicionado os 20% para a necessidade do déposito */
            double taxa = valorChequeUsado * 0.20;
            dividaTotal = valorChequeUsado + taxa;
            if (valorDepositar >=  dividaTotal) {
                /* Caso o valor depositado quite o débito, 
                o valor é depositado e o cheque retorna a não ser utilizado */
                saldo = valorDepositar - dividaTotal;
                chequeUsado = false;
                valorChequeUsado = 0;
                System.out.println("\nDébito quitado!");
            } else {
                /*Caso o valor seja menor que a dívida, é informado a necessidade do depósito com o valor da dívida pelo cheque especial */
                System.out.printf("\nÉ necessário depositar o valor de %s para quitar o débito da utilização do cheque especial.\n", dividaTotal);
                System.out.println("=========================\n");
            }
        }
    }
    //  Consulta o cheque definido pelo primeiro depósito
    public void consultarCheque(){
        System.out.printf("Valor do cheque especial é R$%s\n", valorCheque);
        System.out.println("=========================\n");
    }
    // Saca dinheiro da conta bancária
    public void sacarDinheiro(Scanner scanner){
        System.out.println("Qual o valor a ser sacado?");
        // Solicita o valor a ser sacado
        valorSacar = scanner.nextDouble();
        // Caso o valor estiver dentro da quantia do saldo somado ao total do cheque especial não utilizado
        if(valorCheque > valorChequeUsado && valorSacar <= saldo + (valorCheque - valorChequeUsado)) {
            // Caso o valor a sacar seja maior que o saldo
            if (valorSacar > saldo) {
                // Cheque especial passa a ser usado
                chequeUsado = true;
                // Define o valor usado do cheque pelo valor a ser sacado
                valorChequeUsado = valorChequeUsado + (valorSacar - saldo);
            }
            // Retira o valor a ser sacado do saldo
            saldo -= valorSacar;
            System.out.printf("\nValor sacado com sucesso.\n");
            System.out.println("=========================\n");
        } else{
            // Caso o valor não esteja dentro da quantia do saldo somado ao total do cheque especial não utilizado
            System.out.println("\nValor acima do disponível para saque, consulte seu saldo.");
            System.out.println("=========================\n");
        }
    }
    // Paga boleto com saldo em conta
    public void pagarBoleto(Scanner scanner) {
        System.out.println("Qual o valor do boleto a ser pago?");
        // Solicita valor de boleto
        valorBoleto = scanner.nextDouble();
        // Caso o valor do boleto esteja dentro da quantia do saldo somado ao total do cheque especial não utilizado
        if (valorCheque > valorChequeUsado && valorBoleto <= saldo + (valorCheque - valorChequeUsado)) {
            /* Caso o valor do boleto 
            seja maior que o saldo */
            if (valorBoleto > saldo) {
                // Cheque especial passa ser usado
                chequeUsado = true;
                // Define o valor usado do cheque para pagamento do boleto
                valorChequeUsado = valorChequeUsado + (valorBoleto - saldo);
            }
            // Retira o valor do boleto do saldo
            saldo -= valorBoleto;
            System.out.println("\nBoleto pago com sucesso.");
            System.out.println("=========================\n");
        } else {
            // Caso o valor do boleto não esteja dentro da quantia do saldo somado ao total do cheque especial não utilizado
            System.out.println("\nSaldo insuficiente para pagamento de boleto.");
            System.out.println("=========================\n");
        }
    }
    // Consulta o uso do cheque especial
    public void consultarUsoCheque() {
        // caso o cheque esteja sendo usado
        if (chequeUsado == true) {
            System.out.printf("o valor usado do cheque especial é R$%s.\n", valorChequeUsado);
            System.out.println("=========================\n");
        } else {
            // Caso não esteja sendo usado
            System.out.println("Não foi usado o cheque especial.");
            System.out.println("=========================\n");
        }
    }

}
