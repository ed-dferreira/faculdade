package Faltas_enchente;
import java.util.Scanner;
public class Exerc5_Urna {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int paulo = 0;
    int alan = 0;
    int jonas = 0;
    int nulo = 0;
    int branco = 0;
    while (true) {
        System.out.println("Urna eletrônica");
        System.out.println("1. Candidato Paulo");
        System.out.println("2. Candidato Alan");
        System.out.println("3. Candidato Jonas");
        System.out.println("4. Nulo");
        System.out.println("5. Branco");
        System.out.println("6. Para desligar a urna");
        System.out.print("Entre com o seu voto: ");
        int voto = scanner.nextInt();
        switch (voto) {
            case 1:
                System.out.println("Votou no Paulo!");
                paulo++;
                break;
            case 2:
                System.out.println("Votou no Alan!");
                alan++;
                break;
            case 3:
                System.out.println("Votou no Jonas!");
                jonas++;
                break;
            case 4:
                System.out.println("Votou nulo!");
                nulo++;
                break;
            case 5:
                System.out.println("Voto em branco!");                    
                branco++;
                break;
            case 6:
                System.out.println("Desligando a urna...");
                scanner.close();
                System.out.println("Candidato Paulo recebeu: " + paulo + " votos.");
                System.out.println("Candidato Alan recebeu: " + alan + " votos.");
                System.out.println("Candidato Jonas recebeu: " + jonas + " votos.");
                System.out.println("Votos nulos: " + nulo + " votos.");
                System.out.println("Votos em branco: " + branco + " votos.");
                return;
            default:
                System.out.println("Opção inválida");
                break;
            }
        }
    }
}
