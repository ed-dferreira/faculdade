package Arrayss;
import java.util.Scanner;
public class Exerc_Arrays_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int vetor[] = new int [10];
        int somaVetor = 0;
        for (int i = 0; i < 10; i++){
            System.out.print("Escreva 10 valores inteiros: ");
            int valor = scanner.nextInt();
            vetor [i] = valor;
            somaVetor += vetor[i];
        }
        System.out.println("A soma é: " + somaVetor);
        scanner.close();
    }
    
}
/*
 * Exercício 3. Escreva um programa Java que leia um vetor de inteiros de 10
posições (ou seja, declara um vetor de inteiros de tamanho 10 e armazena 10
valores informados pelo usuário em suas posições) e em seguida escreve a soma
dos valores armazenados no vetor.
 */