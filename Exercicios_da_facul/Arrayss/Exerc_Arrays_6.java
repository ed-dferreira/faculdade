package Arrayss;
import java.util.Scanner;
public class Exerc_Arrays_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int vetor[] = new int[10];
        boolean encontrado = false;
        for (int i = 0; i < 10; i++){
            System.out.print("Escreva um valor inteiro: ");
            int valor = scanner.nextInt();
            vetor[i] = valor;
        }
        for (int i = 0; i < 10; i++){
            System.out.print("Qual valor deseja buscar? ");
            int procura = scanner.nextInt();
            if (vetor[i] == procura){
                System.out.println("Valor encontrado na posição " + i);
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
/*
 * Exercício 6. Escreva um programa Java que leia um vetor de inteiros de 10
posições e em seguida um valor X qualquer. Seu programa deverá fazer uma busca
do valor X no vetor lido e informar a posição em que foi encontrado ou uma
mensagem de “não encontrado”.
 */