package Faltas_enchente;
import java.util.Random;
public class exerc4_1_JogoParImpar {
        public static void main(String[] args) {
        Random random = new Random();
        int vitoriasLuiz = 0;
        int vitoriasFernando = 0;
        for (int i = 1; i <= 11; i++) {
            int n1 = random.nextInt(11); 
            int n2 = random.nextInt(11); 
            int soma = n1 + n2;
            System.out.println("Jogada " + i + ":");
            System.out.println("Luiz gerou: " + n1);
            System.out.println("Fernando gerou: " + n2);
            System.out.println("Soma: " + soma);
            if (soma % 2 == 0) {
                System.out.println("Resultado: Luiz ganhou a rodada.");
                vitoriasLuiz++;
            } else {
                System.out.println("Resultado: Fernando ganhou a rodada.");
                vitoriasFernando++;
            }
        }
        if (vitoriasLuiz > vitoriasFernando) {
            System.out.println("Luiz é o vencedor do jogo!");
        } else if (vitoriasFernando > vitoriasLuiz) {
            System.out.println("Fernando é o vencedor do jogo!");
        } else {
            System.out.println("O jogo terminou empatado!");
        }
    }
}
/*
 * 1) Luiz e Fernando decidem jogar par ou ímpar. Luiz escolheu par e Fernando escolheu ímpar. 
 * Ao término de 11 jogadas aquele que ganhar mais será o vencedor do jogo. 
 * Vamos simular o jogo de Luiz e Fernando gerando, em cada jogada, dois números inteiros aleatórios 
 * (n1 e n2) pertencentes ao intervalo [0 a 10]. 
 * Assim, se a soma (n1+n2) dos valores obtido por cada jogador, em uma jogada, for par, 
 * Luiz ganha a jogada, se for ímpar, Fernando ganha a jogada. Faça um programa que simule o jogo, 
 * exibindo, em cada uma das 11 jogadas, o número gerado para cada jogador e quem ganhou a jogada.
 *  Ao final das 11 jogadas o programa deve exibir quem ganhou o jogo.
 */