package Arrayss;
import java.util.Scanner;
public class Exerc_Arrays_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int par = 0;
        int vetor[]= new int[10];
        for (int i = 0; i < 10; i++){
            System.out.print("Digite um valor inteiro: ");
            int valor = scanner.nextInt();
            vetor[i] = valor;
            if (vetor[i] % 2 == 0) {
                par ++;
            }
        }
        System.out.print("Numeros pares: " + par);
        scanner.close();
    }
    
}
/*
 * Exercício 4. Escreva um programa Java que leia um vetor de inteiros de 10
posições e informe quantos valores pares ele possui.
 */