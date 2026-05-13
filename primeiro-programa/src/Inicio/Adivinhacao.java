package src.Inicio;
import java.util.Random;
import java.util.Scanner;

public class Adivinhacao {
    public static void main(String[] args) {
        System.out.println("O jogo de adivinhacao começou!");

        Scanner leitura = new Scanner(System.in);
        int numberRandom = new Random().nextInt(100);

        int tentativas = 0;

        while (tentativas < 5) {
            System.out.println("Digite um numero");
            int resposta = leitura.nextInt();
            System.out.println("Tentativas: " + tentativas);

            if (resposta == numberRandom) {
                System.out.println("Parabens, voce acertou!");
                break;
            } else if (resposta > numberRandom){
                System.out.println("O numero eh menor");
            } else {
                System.out.println("O numero eh maior");
        }
        tentativas++;
        }
        leitura.close();
    }
}
