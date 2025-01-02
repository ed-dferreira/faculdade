package Matrizes;
import java.util.Scanner;
public class Exerc_Matrizes_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int matriz[][] = new int[5][5];
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                System.out.print("Digite os números da matriz[" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }  
        // Transformação em matriz triangular inferior
        for (int i = 0; i < 5; i++){
            for (int j = i + 1; j < 5; j++){
                matriz[i][j] = 0;
            }
        }
        System.out.println("Matriz triangular inferior resultante:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}

/*
 * Exercício 4. Escreva um programa Java que leia uma matriz 5 x 5 e a transforme
numa matriz triangular inferior, atribuindo zero a todos os elementos acima da
diagonal principal. O programa deve apresentar a matriz.
 */