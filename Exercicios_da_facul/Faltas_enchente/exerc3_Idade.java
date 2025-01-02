package Faltas_enchente;
import java.util.Scanner;
public class exerc3_Idade {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int idade = 0;
    int somaIdades = 0; 
    int numPessoas = 0;
    int menorIdade = Integer.MAX_VALUE;
    int maiorIdade = Integer.MIN_VALUE;
    System.out.println("Digite 0 para encerrar.");
    while (true) {
        System.out.print("Digite a idade: ");
        idade = scanner.nextInt();
            if (idade == 0) {
                break;
            }
            somaIdades += idade;
            numPessoas++;
            if (idade < menorIdade) {
                menorIdade = idade;
            }
            if (idade > maiorIdade) {
                maiorIdade = idade;
            }
        }
        scanner.close();
        double idadeMedia = somaIdades / numPessoas;
        System.out.println("Número de pessoas: " + numPessoas);
        System.out.printf("Idade média: " + idadeMedia);
        System.out.println("Menor idade: " + menorIdade);
        System.out.println("Maior idade: " + maiorIdade);
        }
    }
/*
 * Faça um programa que, para um número indeterminado de pessoas: leia a idade de cada uma, sendo que a idade 0 (zero) indica o fim da leitura e não deve ser considerada. A seguir, calcule e apresente na tela:

a) o número de pessoas;

b) a idade média do grupo;

c) a menor idade e a maior idade.
 */