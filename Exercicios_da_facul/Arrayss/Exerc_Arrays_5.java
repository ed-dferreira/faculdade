package Arrayss;
import java.util.Scanner;
public class Exerc_Arrays_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double vetor[] = new double[10];
        double menorValor = Double.MAX_VALUE;
        double maiorValor = Double.MIN_VALUE;
        for (int i = 0; i < 10; i++){
            System.out.print("Digite um número real: ");
            double nun = scanner.nextDouble();
            vetor [i] = nun;
            if (vetor [i] < menorValor){
                menorValor = vetor[i];
            } else {
                maiorValor = vetor[i];
            }
        }
        System.out.print("Maior valor: " + maiorValor);
        System.out.print("Menor valor: " + menorValor);
        scanner.close();
    }
}



/*
 * Exercício 5. Faça um programa que leia um vetor de números reais com 10
posições e, depois, mostre o maior e o menor elemento desse vetor.
 */