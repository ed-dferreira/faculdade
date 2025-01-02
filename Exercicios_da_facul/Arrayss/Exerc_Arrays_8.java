package Arrayss;
import java.util.Scanner;
public class Exerc_Arrays_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double vetor [] = new double[10];
        double media = 0;
        double soma = 0;
        int quantidade = 0;
        int maioresQueMedia = 0;
        int iguaisAMedia = 0;
        for (int i = 0; i < 10; i++){
            System.out.print("Digite um número real: ");
            vetor [i] = scanner.nextDouble();
        }
        for (int i = 0; i < 10; i++){
            soma += vetor[i];
            quantidade ++;
        }
        media = soma / quantidade;
        for (int i = 0; i < 10; i++){
            if (vetor[i] > media) {
                maioresQueMedia ++;
            } else if (vetor [i] == media){
                iguaisAMedia ++;
            }
        }
        System.out.print("Maiores que a média: " + maioresQueMedia);
        System.out.print("Iguais a média: " + iguaisAMedia);
        scanner.close();
    }
}
/*
 * Exercício 8. Escreva um programa Java que leia um conjunto de 10 números reais,
armazena-os em um vetor e informe:
1. Quantos são maiores que a média
2. Quantos são iguais à média
 */