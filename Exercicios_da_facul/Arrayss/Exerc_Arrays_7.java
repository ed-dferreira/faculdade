package Arrayss;
import java.util.Scanner;
public class Exerc_Arrays_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double vetor1[] = new double [10];
        double vetor2[] = new double [10];
        double resulMulti = 1;
        for (int i = 0; i < 10; i++){
            System.out.print("Digite um valor real: ");
            double valor1 = scanner.nextDouble();
            vetor1[i] = valor1;
        }
        for (int i = 0; i < 10; i++){
            System.out.print("Digite um valor real: ");
            double valor2 = scanner.nextDouble();
            vetor2[i] = valor2;
        }
        for (int i = 0; i < 10; i++){
            resulMulti *= vetor1[i] * vetor2[i];
        }
        System.out.println("O resultado da multiplicação entre os vetores é: " + resulMulti);
        scanner.close();
    }
}
/*
 * Exercício 7. Faça um programa que leia um vetor de números reais de 10 valores e
depois outro vetor de números reais com outros 10 valores. Em seguida, o
programa deve mostrar o resultado da multiplicação entre os valores de mesmo
índice, ou seja, o primeiro valor do primeiro vetor deve ser multiplicado pelo
primeiro valor do segundo vetor e, assim, sucessivamente, até que o último valor
do primeiro vetor seja multiplicado pelo último valor do segundo vetor.
 */