package Matrizes;
import java.util.Scanner;
public class Exerc_Matrizes_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int matriz[][] = new int[2][3];
        int matrizTransposta[][] = new int[3][2];
        for (int i = 0; i < 2; i++){
            for (int j = 0; j < 3; j++){
                System.out.print("Escreva o valor da matriz [" + i + "][" + j + "]:");
                matriz[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < 2; i++){
            for (int j = 0; j < 3; j++){
                matrizTransposta[j][i] = matriz[i][j];
            }
        }
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 2; j++){
                System.out.println(matrizTransposta[i][j] + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}

/*
 * Exercício 9. Escreva um programa Java que leia uma matriz 2 x 3, gere e escreva a
matriz transposta. A matriz transposta é gerada trocando linha por coluna. 
só trocar a linha pela coluna
 */