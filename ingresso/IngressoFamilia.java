package exercicios.ingresso;

public class IngressoFamilia extends Ingresso {

    //Declara o atrinuto de quantidade de pessoas no combo familia
    int quantidadePessoas;

    //Construtor do ingresso familia
    public IngressoFamilia(double valor, String filme, String tipoSessao, int quantidadePessoas) {
        //Herda atributos da superclasse
        super(valor, filme, tipoSessao);
        //Define o valor de quantidade de pessoas com o parametro
        this.quantidadePessoas = quantidadePessoas;
    }

    //Retorna o valor com o desconto de 5% em cima do valor total dos ingressos comprados
    @Override
    public double calcularValor() {
        double total = valor * quantidadePessoas;
        return quantidadePessoas > 3 ? total *= 0.95 :  total;
    }
}
