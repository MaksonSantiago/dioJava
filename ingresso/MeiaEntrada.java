package exercicios.ingresso;

public class MeiaEntrada extends Ingresso{

    //Construtor do ingresso meia
    public MeiaEntrada(double valor, String filme, String tipoSessao) {
        //Herda os atibutos da superclasse
        super(valor, filme, tipoSessao);
    }

    //Retorna o valor da meia entrada com 50% de desconto do valor total
    @Override
    public double calcularValor() {
        return valor / 2;
    }
}
