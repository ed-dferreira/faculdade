package Arrayss;
import java.util.Scanner;
public class Exerc_Arrays_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int vetor[ ] = new int[5];
        for( int i = 0 ; i < 5 ; i++ ){
            vetor[i] =  2 * i + 1;
        }
        System.out.println(vetor [0]);
        System.out.println(vetor [1]);
        System.out.println(vetor [2]);
        System.out.println(vetor [3]);
        System.out.println(vetor [4]);
        scanner.close();
    }
}
/*
Exercício 1. Escreva um programa Java que declare um vetor de inteiros de 5
posições e o preencha com os 5 primeiros números ímpares e imprima-o.
 */