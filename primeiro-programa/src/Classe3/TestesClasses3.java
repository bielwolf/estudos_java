package Classe3;

public class TestesClasses3 {
    public static void main(String[] args) {

        //Instanciando Carro e sua subclasse
        Carro carro = new Carro();
        carro.setModelo("Civic");
        carro.setPrecoAno1(10000);
        carro.setPrecoAno2(20000);
        carro.setPrecoAno3(30000);
        carro.exibirInfo();
        
        ModeloCarro modeloCarro = new ModeloCarro();
        modeloCarro.setCor("Preto");
        modeloCarro.setCombustivel("Gasolina");
        modeloCarro.exibirinfoModelo();

        //Instanciando Animal/cachorro/gato
        Animal animal = new Animal();
        animal.emitirSom();
        Cachorro cachorro = new Cachorro();
        cachorro.emitirSom();
        cachorro.abanarRabo();
        Gato gato = new Gato();
        gato.emitirSom();
        gato.arranharMoveis();

        //Instânciando ContaBancaria e sua subclasse
        ContaCorrente contaBancaria = new ContaCorrente();
        contaBancaria.setSaldo(1000);
        double saldo = contaBancaria.cobrarTarifaMensal();
        System.out.println("Saldo apos cobrar tarifa: " + saldo);
        contaBancaria.depositar(400);
        contaBancaria.consultarSaldo();
        
    }
}