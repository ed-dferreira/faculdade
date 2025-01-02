package Matrizes;
import java.util.Scanner;
public class Exerc_Matrizes_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int menorMatriz = 999999999;
        int matriz[][] = new int[4][3];
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 3; j++){
                System.out.print("Escreva os valores dá matriz[" + i + "][" + j + "]:");
                matriz[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 3; j++){
                if (matriz[i][j] < menorMatriz) {
                    menorMatriz = matriz [i][j];
                }
            }
        }
        System.out.println("O menor valor é:" + menorMatriz);
        scanner.close();
    }
}
/*
 * Exercício 5. Escreva um programa Java que leia uma matriz 4 x 3 e escreva a
posição (linha e coluna) do menor valor.
 */