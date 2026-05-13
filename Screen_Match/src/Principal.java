import modelos.Titulo;
import calculos.CalculadoraDeTempo;
import modelos.Filme;
import modelos.Serie;
public class Principal {
    public static void main(String[] args) {
        //Filme meuFilme = new Filme();
        Titulo meuFilme = new Titulo();
        meuFilme.setNome("Star-Wars");
        meuFilme.setAnoDeLancamento(1977);
        meuFilme.setIncluidoNoPlano(true);
        meuFilme.setDuracaoEmMinutos(121);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(10); 
        meuFilme.avalia(6);
        meuFilme.avalia(8);
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println("Média: " + meuFilme.obterMedia());

        //Serie minhaSerie = new Serie();
        Serie minhaSerie = new Serie();
        minhaSerie.setNome("Vikings");
        minhaSerie.setAnoDeLancamento(2013);
        minhaSerie.exibeFichaTecnica();
        minhaSerie.setTemporadas(5);
        minhaSerie.setEpisodiosPorTemporada(10);
        minhaSerie.setMinutosPorEpisodio(45);


        //Filme outroFilme = new Filme();
        Titulo outroFilme = new Filme();
        outroFilme.setNome("Avatar");
        outroFilme.setAnoDeLancamento(2009);
        outroFilme.setDuracaoEmMinutos(162);
        CalculadoraDeTempo calc = new CalculadoraDeTempo();
        calc.inclui(outroFilme);
        System.out.println("Tempo total: " + calc.getTempoTotal());

    }
}
