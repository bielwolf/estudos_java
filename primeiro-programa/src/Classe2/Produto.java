package Classe2;

public class Produto {
    private String nome;
    private double preco;
    public String getNome() {
        return nome;
    }
    public double getPreco() {
        return preco;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }

    
    void aplicarDesconto(double desconto) {
        preco = preco * (1 - desconto);
        System.out.println("O preco com desconto eh: " + preco);
    }
}
