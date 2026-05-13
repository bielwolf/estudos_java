package Classe3;

public class ModeloCarro extends Carro {
    private String cor;
    private String combustivel;
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public String getCombustivel() {
        return combustivel;
    }
    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }
    
    void exibirinfoModelo(){
        System.out.println("Cor: " + cor);
        System.out.println("Combustivel: " + combustivel);
    }
}
