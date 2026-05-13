package Classe;

public class TestesClasses {
    public static void main(String[] args) {
        //Instância da class Pessoa
        Pessoa saudacao = new Pessoa();
        saudacao.saudacao();

        //Instância da class Calculadora
        Calculadora calc = new Calculadora();
        int resultado = calc.Dobro(10);
        System.out.println(resultado);

        //Instância da class Musica
        Musica musica = new Musica();
        musica.titulo = "Dancing Queen";
        musica.artista = "Abba";
        musica.anoLancamento = 1975;

        musica.avaliar(7);
        musica.avaliar(8);
        musica.avaliar(9);

        musica.fichaTecnica();
        System.out.println("Avaliação: " + musica.avaliacao);
        System.out.println("N° de Avaliacoes: " + musica.numAvaliacoes);
        System.out.println("Media: " + musica.pegaMedia());

        //Instância da class Aluno
        Aluno aluno = new Aluno();
        aluno.nome = "João";
        aluno.idade = 18;
        aluno.exibirInformacoes();
    } 
}
