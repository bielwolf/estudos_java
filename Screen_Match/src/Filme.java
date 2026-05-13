public class Filme {
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    double somaDasAvaliacao;
    int totalDeAvaliacoes;
    int duracaoEmMinutos;

    void exibeFichaTecnica() {
        System.out.println("Nome: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println("Incluído no plano: " + incluidoNoPlano);
        System.out.println("Avaliação: " + somaDasAvaliacao);
        System.out.println("Total de avaliações: " + totalDeAvaliacoes);
        System.out.println("Duração em minutos: " + duracaoEmMinutos);
    }

    void avalia(double nota) {
        somaDasAvaliacao += nota;
        totalDeAvaliacoes++;
    }

    double obterMedia() {
        return somaDasAvaliacao / totalDeAvaliacoes;
    }
}