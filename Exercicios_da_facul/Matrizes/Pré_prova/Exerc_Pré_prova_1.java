package Matrizes.Pré_prova;
import java.util.Scanner;
public class Exerc_Pré_prova_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int vetor[] = new int [10];
        for (int i = 0; i < 10; i++){
            System.out.print("Um número inteiro: ");
            int nun1 = scanner.nextInt();
            vetor[i] = nun1;
        }
        int quantidadePares = contarPares(vetor);
        System.out.print("Quantidada de pares é: " + quantidadePares);
        scanner.close();
    }
    public static int contarPares( int vetor[]){
        int quantidadePares = 0;
        for (int i = 0; i < 10; i++){
            if (vetor[i] % 2 == 0){
                quantidadePares ++;
            }
        }
        return quantidadePares;
    }
}
/*
 *  Faça um programa com uma sub-rotina/método contarPares que recebe por parâmetro um
vetor de 10 elementos inteiros e retorna a quantidade de elementos pares dentro do
vetor.
 */