package Matrizes.Pré_prova;
import java.util.Scanner;
import java.util.Random;
public class Exerc_Pré_prova_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numeroAleatorio = random.nextInt(10);
        String vetor[] = new String[10];
        for (int i = 0; i < 10; i++){
            System.out.print("Escreva o nome: ");
            String nome = scanner.nextLine();
            vetor[i] = nome;
        }
        System.out.print(vetor[numeroAleatorio]);
        scanner.close();
    }
}
/*
 * Escreva um programa que pergunte os nomes de 10 alunos de uma sala de aula. Armazene
estes nomes em um vetor. Depois, o programa deve sortear um aluno para apresentar o
trabalho primeiro. Para isto, gere um número aleatório até 10 e apresente o nome do
aluno na posição do vetor equivalente a este número gerado.
 */