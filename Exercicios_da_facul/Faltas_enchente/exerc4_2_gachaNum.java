package Faltas_enchente;
import java.util.Scanner;
import java.util.Random;
public class exerc4_2_gachaNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numeroAleatorio = random.nextInt(51); 
        boolean acertou = false;
        int tentou = 0;
        System.out.println("Tente adivinhar o número entre 0 e 50. Você tem 10 tentativa!");
        for (int i = 1; i < 11; i++) {
            System.out.print("Chute " + i + ": ");
            int chute = scanner.nextInt();
            if (chute == numeroAleatorio) {
                acertou = true;
                System.out.println("Muito bem! Você acertou!");
                break;
            } else {
                tentou ++;
                int tentativasRestantes = 10 - tentou;
                System.out.println("Tentativas restantes: " + tentativasRestantes);
            }
        }
        if (!acertou) { //false
            System.out.println("Lamentável! Você errou todas as tentativas.");
            System.out.println("O número correto era: " + numeroAleatorio);
        }
        scanner.close();
    }
}