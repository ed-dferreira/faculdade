package Matrizes;
import java.util.Scanner;
public class Exerc_Matrizes_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int matriz1[][] = new int[4][4];
        int matriz2[][] = new int[4][4];
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++){
                System.out.print("Escreva o valor da matriz [" + i + "][" + j + "]:");
                matriz1[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++){
                System.out.print("Escreva o valor da matriz [" + i + "][" + j + "]:");
                matriz2[i][j] = scanner.nextInt();
            }
        }
        scanner.close();
        encontrarValor(matriz1, matriz2);
    }
    public static void encontrarValor(int[][] matriz1, int[][] matriz2) {
        boolean encontrado = false;
        for (int i = 0; i < 4; i++) { // Percorrendo a primeira matriz
            for (int j = 0; j < 4; j++) {
                encontrado = false;
                for (int m = 0; m < 4; m++) { // Verificando se o valor está na segunda matriz
                    for (int n = 0; n < 4; n++) {
                        if (matriz1[i][j] == matriz2[m][n]) {
                            System.out.println("Valor encontrado na posição [" + i + "][" + j + "]: " + matriz1[i][j]);
                            encontrado = true;
                            break;
                        }
                    }
                    if (encontrado) {
                        break;
                    }
                }
            }
        }
    }
}
/*
 * Exercício 8. Escreva um programa Java que leia duas matrizes 4 x 4 e escreva os
valores da primeira que ocorrem em qualquer posição da segunda.
 */