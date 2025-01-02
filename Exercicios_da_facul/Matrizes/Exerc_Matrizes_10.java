package Matrizes;
import java.util.Scanner;
public class Exerc_Matrizes_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int matriz[][] = new int[10][5];
        int maiorAltura[] = new int[5];
        for (int i = 0; i < 5; i++){
            maiorAltura[i] = Integer.MIN_VALUE;
        }
        for (int i = 0; i < 10; i++){
            for (int j = 0; j < 5; j++){
                System.out.print("Escreva a altura de cada atleta em centimetros [" + i +"]["+ j +"]:");
                matriz[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 5; j++) {
                if (matriz[i][j] > maiorAltura[j]) {
                    maiorAltura[j] = matriz[i][j];
                }
            }
        }
        scanner.close();
        for (int j = 0; j < 5; j++) {
            System.out.println("Maior atleta da " + (j + 1) + "° delegação: " + maiorAltura[j]);
        }
    }
}
/*
 * Exercício 10. Escreva um programa Java que possa armazenar as alturas de dez
atletas de cinco delegações que participarão dos jogos de verão. Imprimir a maior
altura de cada delegação.
 */