import modelos.Filme;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("Star Wars");
        meuFilme.setAnoDeLancamento(1977);
        meuFilme.setIncluidoNoPlano(true);
        meuFilme.setDuracaoEmMinutos(121);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(10); 
        meuFilme.avalia(6);
        meuFilme.avalia(8);
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println("Média: " + meuFilme.obterMedia());

    }
}
