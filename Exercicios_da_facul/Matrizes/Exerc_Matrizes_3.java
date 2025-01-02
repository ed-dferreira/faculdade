package Matrizes;
import java.util.Scanner;
public class Exerc_Matrizes_3{
    public static void main (String [ ] args){
    Scanner scanner = new Scanner(System.in);
    int matriz[][] = new int[6][6];
    int somaMatriz = 0;
        for (int i = 0; i < 6; i++){
            for (int j = 0; j < 6; j++){
                System.out.print("Valor da matriz[" + i + "][" + j + "]: ");
                matriz[i][j]= scanner.nextInt();
            }
        }
        for (int i = 0; i < 6; i++){
            for (int j = 0; j < 6; j++){
                if (i == j) {
                    somaMatriz += matriz[i][j]; 
                } 
            }
        }
    System.out.print("A soma da matriz é: " + somaMatriz);
    scanner.close();
    }
}
/*
 * Exercício 3. Escreva um programa Java que leia uma matriz 6 x 6 e escreva a soma
dos elementos da diagonal principal.
 */