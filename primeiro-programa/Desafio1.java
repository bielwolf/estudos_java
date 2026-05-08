import java.util.Scanner;

public class Desafio1 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        String nome = "Gabriel Lobo";
        String tipoConta = "Corrente";
        double saldo = 2500.00;

       System.out.println("============================================");
       System.out.println("Nome: " + nome);
       System.out.println("Tipo de Conta: " + tipoConta);
       System.out.println("Saldo: " + saldo);
       System.out.println("============================================");

        System.out.println("""
                Operações

                1 - Consultar Saldo
                2 - Receber valor
                3 - Transferir valor
                4 - Sair
                """);

        int opcao = leitura.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("O saldo atual eh " + saldo);
                break;
            case 2:
                System.out.println("Digite o valor que deseja receber");
                double valorRecebido = leitura.nextDouble();
                saldo += valorRecebido;
                System.out.println("O saldo atual eh " + saldo);
                break;
            case 3:
                System.out.println("Digite o valor que deseja transferir");
                double valorTransferido = leitura.nextDouble();
                if (saldo < valorTransferido) {
                    System.out.println("Saldo insuficiente");
                    break;
                }
                saldo -= valorTransferido;
                System.out.println("O saldo atual eh " + saldo);
                break;
            default:
                break;
        }
        System.out.println("Obrigado por utilizar nossos serviços");
        leitura.close();
    }
}
