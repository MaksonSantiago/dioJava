package exercicios.ingresso;

public class Main {
    public static void main(String[] args) {
        //Instancias de ingressos
        Ingresso ingressoMeia = new MeiaEntrada(40.00, "Superman", "dublado");
        Ingresso familia = new IngressoFamilia(40.00, "Superman", "Legendado", 4);

        //Mostra no terminal detalhes da meia entrada
        ingressoMeia.exibirInformacoes();
        System.out.println();
        //Mostra no terminal detalhes do ingresso familia
        familia.exibirInformacoes();
    }
}
