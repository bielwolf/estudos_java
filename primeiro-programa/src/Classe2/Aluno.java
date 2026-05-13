package src.Classe2;

public class Aluno {
    private String nome;
    private double nota;
    private double nota2;

    public String getNome() {
        return nome;
    }
    public double getNota() {
        return nota;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setNota(double nota) {
        this.nota = nota;
    }
    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    double calcularMedia() {
       return  (nota + nota2) / 2;
    }
}
