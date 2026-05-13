public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.nome = "Star Wars";
        meuFilme.anoDeLancamento = 1977;
        meuFilme.incluidoNoPlano = true;
        meuFilme.duracaoEmMinutos = 121;

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(10); 
        meuFilme.avalia(9);
        meuFilme.avalia(8);
        System.out.println("Soma das avaliações: " + meuFilme.somaDasAvaliacao);
        System.out.println("Total de avaliações: " + meuFilme.totalDeAvaliacoes);
        System.out.println(meuFilme.obterMedia());

    }
}
