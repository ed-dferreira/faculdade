package Arrayss;
import java.util.Scanner;
public class Exerc_Arrays_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double vetor1[] = new double[20];
        double vetorInvertido[] = new double[20];
        for (int i = 0; i < 20; i++){
            System.out.print("Digite um número real: ");
        }
        for (int i = 0; i < 20; i++) {
            vetorInvertido[i] = vetor1[19 - i];
        }
        for (int i = 0; i < 20; i++) {
            System.out.println("Vetor: " + vetor1[i]);
        }
        for (int i = 0; i < 20; i++) {
            System.out.println("Vetor invertido: " + vetorInvertido[i]);
        }
        scanner.close();
    }
}


/*
 * Exercício 12. Elaborar um programa que leia 20 elementos do tipo real em um
vetor A e construir um vetor B de mesma dimensão com os mesmos elementos
armazenados no vetor A, porém de forma invertida. Ou seja, o primeiro elemento
do vetor A passa a ser o último do vetor B, o segundo elemento do vetor A passa ser
o penúltimo do vetor B e assim por diante. Apresentar os elementos dos vetores A
e B.
 */