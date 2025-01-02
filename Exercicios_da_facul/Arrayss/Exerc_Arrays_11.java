package Arrayss;
import java.util.Scanner;
public class Exerc_Arrays_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int vetor[] = new int[20];
        int valor1 = 0; 
        int valor2 = 0; 
        int valor3 = 0; 
        int valor4 = 0; 
        int valor5 = 0; 
        int valor6 = 0; 
        for (int i = 0; i < 20; i++){
            System.out.print("informe o valor do dado d6: ");
            vetor[i] = scanner.nextInt();
            if (vetor[i] < 1 || vetor[i] > 6){
                System.out.println("Valor invalido, digite novamente.");
                i --;
                continue;
            }
            switch (vetor[i]) {
                case 1:
                    valor1 ++;
                    break;
                case 2:
                    valor2 ++;
                    break;
                case 3: 
                    valor3 ++;
                    break;
                case 4:
                    valor4 ++;
                    break;
                case 5:
                    valor5 ++;
                    break;
                case 6: 
                    valor6 ++;
                    break;
                default:
                    break;
            }
        }
        System.out.println("O numero 1 aparece: " + valor1);
        System.out.println("O numero 2 aparece: " + valor2);
        System.out.println("O numero 3 aparece: " + valor3);
        System.out.println("O numero 4 aparece: " + valor4);
        System.out.println("O numero 5 aparece: " + valor5);
        System.out.println("O numero 6 aparece: " + valor6);
        scanner.close();
    }
}
/*
 * Exercício 11. Faça um programa que receba o número sorteado por um dado (de seis
lados) em vinte jogadas e armazene-os em um vetor. Se algum valor de entrada
informado não estiver no intervalo de 1 a 6, esse número deve ser pedido novamente.
Mostre a frequência de cada número sorteado.
 */