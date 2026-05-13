package Classe3;

public class ContaBancaria {
    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    void depositar(double valor) {
        this.saldo += valor;
    }

    void sacar(double valor) {
        if (this.saldo < valor) {
            System.out.println("Saldo insuficiente");
            return;
        }
        this.saldo -= valor;
    }

    void consultarSaldo() {
        System.out.println("Seu saldo eh: " + saldo);
    }
}
