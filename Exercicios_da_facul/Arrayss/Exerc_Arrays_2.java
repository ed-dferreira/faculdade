package Arrayss;
import java.util.Scanner;
public class Exerc_Arrays_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int vetor[] = new int[10];
        for (int i = 0; i < 10; i++){
            System.out.print("Digite um número: ");
            int nun = scanner.nextInt();
            vetor[i] = nun;
        }
        System.out.print("Qual posição você deseja acessar? ");
        int posicao = scanner.nextInt();
        if (posicao >= 0 && posicao <= 9) {
            System.out.println("O valor na posição " + posicao + " é: " + vetor[posicao]);
        } else {
            System.out.println("Posição inválida! Digite um número entre 0 e 9.");
        }
        scanner.close();
    }   
}

/*
 * Exercício 2. Escreva um programa Java que declare um vetor de inteiros de 10
posições e preencha ele com valores recebidos do usuário. Em seguida, o programa
recebe um número inteiro referente a uma posição do vetor e exibe o número
inteiro armazenado na posição do vetor criado anteriormente.
 */