package Faltas_enchente;
import java.util.Random;
import java.util.Scanner;
public class exerc2_PedraPapelTesoura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] opcoes = {"Pedra", "Papel", "Tesoura"};
        
        for (int rodada = 0; rodada < 10; rodada++) {
            System.out.println("Rodada " + rodada + ":");
            System.out.print("Escolha (0 = Pedra, 1 = Papel, 2 = Tesoura): ");
            int escolhaUsuario = scanner.nextInt();
            int escolhaComputador = random.nextInt(3);
            System.out.println("Usuário escolheu: " + opcoes[escolhaUsuario]);
            System.out.println("Computador escolheu: " + opcoes[escolhaComputador]);
            if (escolhaUsuario == escolhaComputador) {
                System.out.println("Resultado: Empate!");
            } else if ((escolhaUsuario == 0 && escolhaComputador == 2) ||
                       (escolhaUsuario == 1 && escolhaComputador == 0) ||
                       (escolhaUsuario == 2 && escolhaComputador == 1)) {
                System.out.println("Resultado: Usuário ganha!");
            } else {
                System.out.println("Resultado: Computador ganha!");
            }
            System.out.println("--------------------------");
        }
        scanner.close();
    }
}

/*
 * Escreva um programa que implemente o jogo conhecido como Pedra, Papel e Tesoura. 
 * Neste jogo, o usuário e o computador escolhem entre pedra, papel ou tesoura por 10 rodadas. 
 * Sabendo que pedra ganha de tesoura, papel ganha de pedra e tesoura ganha de papel, 
 * exiba na tela o ganhador de cada rodada: usuário ou computador. Para esta implementação, 
 * assuma que o número 0 representa pedra, 1 representa papel e 2 representa tesoura. 
 * Em cada rodada, o programa deve pedir para o usuário entrar com sua escolha, gerar aleatoriamente 
 * a escolha do computador, exibir a escolha e indicar o vencedor.
 */