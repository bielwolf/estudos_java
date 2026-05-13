package src.Inicio;
import java.util.Scanner;

public class OutroLoop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double media = 0, nota = 0;
        int totalDeNotas = 0;

        while (nota != -1) {
            System.out.println("Digite sua avaliação");
            nota = leitura.nextDouble();

            if (nota != -1) {
                media += nota;
                totalDeNotas++;
            }
        } 

        System.out.println("Média: " + media/totalDeNotas);
        leitura.close();
    }
}
    
