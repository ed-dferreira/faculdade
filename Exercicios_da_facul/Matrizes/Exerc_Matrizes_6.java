package Matrizes;
import java.util.Scanner;
public class Exerc_Matrizes_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int matriz[][] = new int [2][4];
        boolean encontrado = false;
        for (int i = 0; i < 2; i++){
            for (int j = 0; j < 4; j++){
                System.out.print("Escreva os numeros da matriz [" + i + "][" + j +"]");
                matriz[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Qual valor você deseja achar a localização na matriz?");
        int valor = scanner.nextInt();
        for (int i = 0; i < 2; i++){
            for (int j = 0; j < 4; j++){
                if (matriz[i][j] == valor){
                    System.out.print("O valor está na seguinte posição [" + i + "][" + j + "]");
                    encontrado = true;
                    break;
                }
            }
            if (!encontrado) {
                System.out.println("Valor não encontrado!");
            }
        scanner.close();
        }
    }
}
/*
 * Exercício 6. Escreva um programa Java que leia uma matriz 2 x 4 e um valor X. O
programa deverá fazer uma busca desse valor na matriz e, ao final, escrever a
localização (linha e coluna) ou uma mensagem de “não encontrado”.
 */