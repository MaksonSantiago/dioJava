package exercicios.ingresso;

public abstract class Ingresso {
    //Atributos universais dos ingressos
    protected double valor;
    private String filme;
    private String tipoSessao;

    //Construtor generico de ingresso
    public Ingresso(double valor, String filme, String tipoSessao) {
        this.valor = valor;
        this.filme = filme;
        this.tipoSessao = tipoSessao;
    }

    //Metodo abstrato para calcular o valor do ingresso com desconto dependendo da modalidade
    abstract double calcularValor();

    //Metodo para mostrar informações finais do ingresso
    public void exibirInformacoes() {
        System.out.println("Filme: " + filme);
        System.out.println("Tipo Sessão: " + tipoSessao);
        System.out.println("Valor: R$" + calcularValor());
    }
}
