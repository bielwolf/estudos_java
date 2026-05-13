package Classe3;

public class ContaCorrente extends ContaBancaria{

    public double cobrarTarifaMensal() {
        return this.getSaldo() * (1 - 0.05);
    }
    
}
