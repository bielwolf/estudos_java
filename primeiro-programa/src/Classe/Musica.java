package Classe;

public class Musica {
    String titulo;
    String artista;
    int anoLancamento;
    double avaliacao;
    int numAvaliacoes;

    void fichaTecnica () {
        System.out.println("TITULO: " + this.titulo);
        System.out.println("ARTISTA: " + this.artista);
        System.out.println("ANO DE LANÇAMENTO: " + this.anoLancamento);
        System.out.println("AVALIAÇÕES: " + this.avaliacao);
        System.out.println("NUMERO DE AVALIAÇÕES: " + this.numAvaliacoes);
    }

    void avaliar (double nota) {
        avaliacao += nota;
        numAvaliacoes++;
    }

    double pegaMedia() {
        return avaliacao / numAvaliacoes;
    }
}
