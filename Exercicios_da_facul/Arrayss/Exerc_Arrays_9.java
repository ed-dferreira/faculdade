package Arrayss;
import java.util.Scanner;
public class Exerc_Arrays_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int vetor [] = new int [10];
        for (int i = 0; i < 10; i++){
            System.out.print("Digite um número inteiro: ");
            vetor [i] = scanner.nextInt();
        }
        for (int i = 0; i < 10; i++){
            for (int j = i + 1; j < 10; j++){
                if (vetor [i] == vetor[j]) {
                    System.out.println("Valor repetido:" + vetor[i]);                    
                }
            }
        }
        scanner.close();
    }
}
/*
 * Exercício 9. Faça um programa que leia um vetor de 10 posições. Verifique se
existem valores iguais e escreva-os na tela.
 */