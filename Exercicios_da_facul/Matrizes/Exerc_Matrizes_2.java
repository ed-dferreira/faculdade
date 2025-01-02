package Matrizes;
import java.util.Scanner;
public class Exerc_Matrizes_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maioresQ10 = 0;
        int matriz[][] = new int[5][3];
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 3; j++){
                System.out.print("Digite o valor para matriz[" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 3; j++){
                if (matriz[i][j] > 10) {
                    maioresQ10++;
                }
            }
        }
        System.out.print("A quantidade de números maiores que 10 é: " + maioresQ10);
        scanner.close();
    }
}
/*
 * Exercício 2. Escreva um programa Java que leia uma matriz 5 x 3, conte e escreva
quantos valores maiores que 10 ela possui.
 */