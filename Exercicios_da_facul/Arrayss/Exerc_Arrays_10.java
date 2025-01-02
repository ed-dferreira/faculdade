package Arrayss;
import java.util.Scanner;
public class Exerc_Arrays_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double vetor [] = new double[15];
        double melhorTempo = 99999999;
        double mediaTempo = 0; 
        double piorTempo = 0;
        for (int i = 0; i < 15; i++){
            System.out.print("Tempo da volta: ");
            vetor[i] = scanner.nextDouble();
            mediaTempo += vetor[i];
        }
        for (int i = 0; i < 15; i++){
            if (vetor[i] <= melhorTempo ) {
                melhorTempo = vetor[i];
            }
        }
        for (int i = 0; i < 15; i++){
            if (vetor[i] >= piorTempo) {
                piorTempo = vetor[i];
            }
        }
        mediaTempo = mediaTempo / 15;
        System.out.print("O melhor tempo de voltas é: " + melhorTempo);
        System.out.print("O pior tempo de voltas é: " + piorTempo);
        System.out.print("O tempo médio de voltas é: " + mediaTempo);
        scanner.close();
    }
}
/*
 * Exercício 10. Durante uma corrida de automóveis com N voltas de duração foram
anotadas para um piloto, na ordem sequencial, os tempos registrados em cada
volta. Faça um programa para ler os tempos registrados em 15 voltas, calcular e
imprimir:
A. Melhor tempo registrado;
B. A volta em que o pior tempo ocorreu;
C. Tempo médio das N voltas.
 */