package Classe2;

public class TestesClasses2 {
    public static void main(String[] args) {
        //Instância da class IdadePessoa
        IdadePessoa pessoa = new IdadePessoa();
        pessoa.setNome("Gabriel");
        pessoa.setIdade(18);
        pessoa.veirificarIdade();

        //Instância da class Produto
        Produto produto = new Produto();
        produto.setNome("Smartphone");
        produto.setPreco(1000);
        produto.aplicarDesconto(0.1);

        //Instância da class Aluno
        Aluno aluno = new Aluno();
        aluno.setNome("João");
        aluno.setNota(10);
        aluno.setNota2(9.5);

        System.out.println("Media: " + aluno.calcularMedia());

        //Instância da class Livro
        Livro livro = new Livro();
        livro.setTitulo("O Senhor dos Aneis");
        livro.setAutor("JRR Tolkien");
        livro.exibirDetalhes();
        
    }
}
